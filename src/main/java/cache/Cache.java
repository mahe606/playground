package cache;

import java.util.Date;

public class Cache {
    private String name;
    private Date lastUsedOn;

    public Cache(String name, Date lastUsedOn) {
        this.name = name;
        this.lastUsedOn = lastUsedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUsedOn() {
        return lastUsedOn;
    }

    public void setLastUsedOn(Date lastUsedOn) {
        this.lastUsedOn = lastUsedOn;
    }
}
