package data.dto;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class Corporate {

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    public void setContactEmailAddress(String contactEmailAddress) {
        this.contactEmailAddress = contactEmailAddress;
    }

    public String getContactSmsAddress() {
        return contactSmsAddress;
    }

    public void setContactSmsAddress(String contactSmsAddress) {
        this.contactSmsAddress = contactSmsAddress;
    }

    public int getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(int corporateId) {
        this.corporateId = corporateId;
    }

    public boolean isEnableNotitifcation() {
        return enableNotitifcation;
    }

    public void setEnableNotitifcation(boolean enableNotitifcation) {
        this.enableNotitifcation = enableNotitifcation;
    }

    public int getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(int notificationType) {
        this.notificationType = notificationType;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String contactEmailAddress;
    public String contactSmsAddress;
    public int corporateId;
    public boolean enableNotitifcation;
    public int notificationType;
    public String routeId;
}
