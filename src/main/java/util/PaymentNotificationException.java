package util;

/**
 * Created by Adeola.Ojo on 7/26/2016.
 */
public class PaymentNotificationException {

    public static void raiseError(String message) throws Exception {
        System.out.println("error occured: " + message);
        throw new Exception(message);
    }
}
