package data.dto;

import data.access.LightFoot;

/**
 * Created by Adeola.Ojo on 7/25/2016.
 */
public class User extends LightFoot<User> {

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    private long Id;
    private String Name;
}
