package util.datatype;

/**
 * Created by Adeola.Ojo on 7/26/2016.
 */
public class BooleanUtil {
    public static boolean convertToBoolean(String value) {
        boolean returnValue = false;
        if ("1".equalsIgnoreCase(value) || "yes".equalsIgnoreCase(value) ||
                "true".equalsIgnoreCase(value) || "on".equalsIgnoreCase(value))
            returnValue = true;
        return returnValue;
    }
}
