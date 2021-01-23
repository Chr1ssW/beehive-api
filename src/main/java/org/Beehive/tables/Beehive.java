package org.Beehive.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beehive")
public class Beehive
{
    @Id
    private String sensorId;

    @Column
    private String location;

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorID) {
        this.sensorId = sensorID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
