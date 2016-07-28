package util.config;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class SystemSettingFactory {

    private static String configPath(){
        try {
            ClassLoader classLoader = SystemSettingFactory.class.getClassLoader();
            File file = new File(classLoader.getResource("app.config").getFile());
            String path = file.getPath();
            return path;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static SystemSetting SystemSetting(){
        try {
            return new SystemSetting().fire(configPath());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
