package org.Beehive.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Null;
import java.util.Date;

@Entity
@Table(name = "beehive_data")
public class BeehiveData
{
    @Id
    private int dataId;

    @Column
    private String sensorId;

    @Column
    private float internalTemp;

    @Column
    private float externalTemp;

    @Column
    private int humidity;

    @Column
    private float weight;

    @Column
    private Date timeStamp;

    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public float getInternalTemp() {
        return internalTemp;
    }

    public void setInternalTemp(float internalTemp) {
        this.internalTemp = internalTemp;
    }

    public float getExternalTemp() {
        return externalTemp;
    }

    public void setExternalTemp(float externalTemp) {
        this.externalTemp = externalTemp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
