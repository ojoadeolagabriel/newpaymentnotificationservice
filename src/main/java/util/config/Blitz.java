package util.config;

import facade.attr.ConfigurationAttribute;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Properties;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class Blitz<T> {

    private String _propertyFilePath;

    public static Object changeType(Class clazz, String value) {
        if (Boolean.TYPE == clazz) return Boolean.parseBoolean(value);
        if (Byte.TYPE == clazz) return Byte.parseByte(value);
        if (Short.TYPE == clazz) return Short.parseShort(value);
        if (Integer.TYPE == clazz) return Integer.parseInt(value);
        if (Long.TYPE == clazz) return Long.parseLong(value);
        if (Float.TYPE == clazz) return Float.parseFloat(value);
        if (Double.TYPE == clazz) return Double.parseDouble(value);
        return value;
    }

    /**
     * fire call
     *
     * @param path
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public T fire(String path) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        _propertyFilePath = path;
        if (_propertyFilePath == "" || _propertyFilePath == null)
            return null;

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(_propertyFilePath));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        T data = (T) ((Class) ((ParameterizedType)
                this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0]).newInstance();

        for (Field field : data.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {

                ConfigurationAttribute configurationAttribute = field.getAnnotation(ConfigurationAttribute.class);
                String cc = prop.getProperty(configurationAttribute.fieldDescription());

                //if type is enum
                Class<?> type = field.getType();
                if (type != null && type.isEnum()) {

                }

                Object finalData = changeType(type, cc);
                field.set(data, finalData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }

}
