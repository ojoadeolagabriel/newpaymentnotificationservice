package data.access;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import util.StopWatchUtil;
import util.config.SystemSetting;
import util.config.SystemSettingFactory;
import util.datatype.BooleanUtil;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class LightFoot<T> {

    String _connString;
    CallableStatement cstmt = null;
    ResultSet rs = null;

    public LightFoot(String connString) {
        _connString = connString;
    }

    public LightFoot() {

    }


    public static Object convert(Class clazz, String value) {

        if (Boolean.TYPE == clazz) return BooleanUtil.convertToBoolean(value);
        if (Byte.TYPE == clazz) return Byte.parseByte(value);
        if (Short.TYPE == clazz) return Short.parseShort(value);
        if (Integer.TYPE == clazz) return Integer.parseInt(value);
        if (Long.TYPE == clazz) return Long.parseLong(value);
        if (Float.TYPE == clazz) return Float.parseFloat(value);
        if (Double.TYPE == clazz) return Double.parseDouble(value);
        if (value == null)
            value = null;
        return value;
    }

    /**
     * execute all.
     *
     * @param preparedCall
     * @param param
     * @return
     * @throws SQLServerException
     */
    public List<T> execute(String preparedCall, Map<String, Object> param) throws SQLServerException {
        SystemSetting setting = SystemSettingFactory.SystemSetting();
        SQLServerDataSource ds = new SQLServerDataSource();

        String database = setting.getSqlServerDatabase();
        String ip = setting.getSqlServerIp();
        int port = setting.getSqlServerPort();

        ds.setServerName(ip);
        ds.setPortNumber(port);
        ds.setDatabaseName(database);
        ds.setPassword(setting.getSqlServerPassword());
        ds.setUser(setting.getSqlServerUsername());
        ds.setLoginTimeout(10);

        try (Connection connection = ds.getConnection();
             StopWatchUtil timer = new StopWatchUtil()) {
            cstmt = connection.prepareCall(preparedCall);

            int paramIndex = 0;
            if (param != null) {
                for (String key : param.keySet()) {
                    ++paramIndex;
                    cstmt.setObject(paramIndex, param.get(key));
                }
            }

            rs = cstmt.executeQuery();

            List<T> coll = new ArrayList<>();
            while (rs.next()) {
                T data = (T) ((Class) ((ParameterizedType)
                        this.getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0]).newInstance();

                for (Field field : data.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    try {
                        String fieldData = rs.getString(field.getName());
                        Object finalData = convert(field.getType(), fieldData);
                        field.set(data, finalData);
                        System.out.println("reading field :" + field.getName() + " value: " + fieldData);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                coll.add(data);
            }
            rs.close();

            long elapsed = timer.elapsed(false);
            System.out.println(String.format("reader took: %d ms (%d ns)", elapsed / 100000, elapsed));
            return coll;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }

        return null;
    }

    /**
     * executeSingle
     *
     * @param preparedCall
     * @param param
     * @return
     * @throws SQLServerException
     */
    public T executeSingle(String preparedCall, Map<String, Object> param) throws SQLServerException {
        SystemSetting setting = SystemSettingFactory.SystemSetting();
        SQLServerDataSource ds = new SQLServerDataSource();

        String database = setting.getSqlServerDatabase();
        String ip = setting.getSqlServerIp();
        int port = setting.getSqlServerPort();
        ds.setServerName(ip);
        ds.setPortNumber(port);
        ds.setDatabaseName(database);
        ds.setPassword(setting.getSqlServerPassword());
        ds.setUser(setting.getSqlServerUsername());
        ds.setLoginTimeout(10);

        try (Connection connection = ds.getConnection()) {
            cstmt = connection.prepareCall(preparedCall);

            for (String key : param.keySet()) {
                cstmt.setObject(key, param.get(key));
            }

            rs = cstmt.executeQuery();

            T data = (T) ((Class) ((ParameterizedType)
                    this.getClass().getGenericSuperclass())
                    .getActualTypeArguments()[0]).newInstance();

            while (rs.next()) {
                for (Field field : data.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    try {
                        String fieldData = rs.getString(field.getName());
                        Object finalData = convert(field.getType(), fieldData);

                        field.set(data, finalData);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                return data;
            }

            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }

        return null;
    }
}
