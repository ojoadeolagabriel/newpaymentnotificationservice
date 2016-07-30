package util.comms;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import util.config.SystemSetting;
import util.config.SystemSettingFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class RabbitMqUtil {

    private static Connection _connection;

    private static Connection getConnection() throws IOException, TimeoutException {
        if(_connection == null){
            SystemSetting setting = SystemSettingFactory.SystemSetting();
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost(setting.getRabbitMqHost());

            if(setting.getRabbitMqHostUsername() != "" && setting.getRabbitMqHostUsername() != null)
                factory.setUsername(setting.getRabbitMqHostUsername());
            if(setting.getRabbitMqHostPassword() != "" && setting.getRabbitMqHostPassword() != null)
                factory.setPassword(setting.getRabbitMqHostPassword());

            _connection = factory.newConnection();
        }
        return _connection;
    }

    public static String readMessage(String queue){

        try {
            Channel channel = getConnection().createChannel();
            String buffer = channel.basicConsume(queue, true, new DefaultConsumer(channel));
            return buffer;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *push Message
     * @param message
     * @param queue
     * @throws IOException
     * @throws TimeoutException
     */
    public static void pushMessage(String message, String queue) throws IOException, TimeoutException {
        if(message==null || message == "")
            return;

        try{
            Channel channel = getConnection().createChannel();
            channel.queueDeclare(queue, false, false, false, null);
            channel.basicPublish("",queue, null, message.getBytes());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
