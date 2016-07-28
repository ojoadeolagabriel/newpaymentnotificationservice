package util.config;

import facade.attr.ConfigurationAttribute;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class SystemSetting extends Blitz<SystemSetting> {

    @ConfigurationAttribute(fieldDescription = "systemsetting.applicationName")
    private String applicationName;

    @ConfigurationAttribute(fieldDescription = "systemsetting.nairaSymbol")
    private String nairaSymbol;

    @ConfigurationAttribute(fieldDescription = "systemsetting.rabbitMqHost")
    private String rabbitMqHost;

    @ConfigurationAttribute(fieldDescription = "systemsetting.rabbitMqHostUsername")
    private String rabbitMqHostUsername;

    public String getRabbitMqHostUsername() {
        return rabbitMqHostUsername;
    }

    public void setRabbitMqHostUsername(String rabbitMqHostUsername) {
        this.rabbitMqHostUsername = rabbitMqHostUsername;
    }

    public String getRabbitMqHostPassword() {
        return rabbitMqHostPassword;
    }

    public void setRabbitMqHostPassword(String rabbitMqHostPassword) {
        this.rabbitMqHostPassword = rabbitMqHostPassword;
    }

    @ConfigurationAttribute(fieldDescription = "systemsetting.rabbitMqHostPassword")
    private String rabbitMqHostPassword;

    public String getNairaSymbol() {
        return nairaSymbol;
    }

    public void setNairaSymbol(String nairaSymbol) {
        this.nairaSymbol = nairaSymbol;
    }

    @ConfigurationAttribute(fieldDescription = "systemsetting.systemEmailAddress")
    private String systemEmailAddress;

    @ConfigurationAttribute(fieldDescription = "systemsetting.author")
    private String author;

    @ConfigurationAttribute(fieldDescription = "systemsetting.sqlserverIp")
    private String sqlServerIp;

    @ConfigurationAttribute(fieldDescription = "systemsetting.sqlserverPort")
    private int sqlServerPort;

    public String getSqlServerPassword() {
        return sqlServerPassword;
    }

    public void setSqlServerPassword(String sqlServerPassword) {
        this.sqlServerPassword = sqlServerPassword;
    }

    public String getSqlServerUsername() {
        return sqlServerUsername;
    }

    public void setSqlServerUsername(String sqlServerUsername) {
        this.sqlServerUsername = sqlServerUsername;
    }

    @ConfigurationAttribute(fieldDescription = "systemsetting.sqlServerPassword")
    private String sqlServerPassword;

    @ConfigurationAttribute(fieldDescription = "systemsetting.sqlServerUsername")
    private String sqlServerUsername;

    @ConfigurationAttribute(fieldDescription = "systemsetting.sqlServerDatabase")
    private String sqlServerDatabase;

    @ConfigurationAttribute(fieldDescription = "systemsetting.mode")
    private int mode;


    public String getSystemEmailAddress() {
        return systemEmailAddress;
    }

    public void setSystemEmailAddress(String systemEmailAddress) {
        this.systemEmailAddress = systemEmailAddress;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSqlServerIp() {
        return sqlServerIp;
    }

    public void setSqlServerIp(String sqlServerIp) {
        this.sqlServerIp = sqlServerIp;
    }

    public int getSqlServerPort() {
        return sqlServerPort;
    }

    public void setSqlServerPort(int sqlServerPort) {
        this.sqlServerPort = sqlServerPort;
    }

    public String getSqlServerDatabase() {
        return sqlServerDatabase;
    }

    public void setSqlServerDatabase(String sqlServerDatabase) {
        this.sqlServerDatabase = sqlServerDatabase;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String getRabbitMqHost() {
        return rabbitMqHost;
    }

    public void setRabbitMqHost(String rabbitMqHost) {
        this.rabbitMqHost = rabbitMqHost;
    }
}
