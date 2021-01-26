package org.Beehive.tables;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class Payload {
    @JsonProperty("app_id")
    private String appId;

    @JsonProperty("dev_id")
    private String devId;

    @JsonProperty("hardware_serial")
    private String hardwareSerial;

    @JsonProperty("port")
    private int port;

    @JsonProperty("counter")
    private int counter;

    @JsonProperty("payload_raw")
    private String payloadRaw;

    @JsonProperty("payload_fields")
    private BeehiveData payloadFields;

    @JsonProperty("metadata")
    private JSONObject metadata;

    @JsonProperty("downlink_url")
    private String downLinkUrl;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getHardwareSerial() {
        return hardwareSerial;
    }

    public void setHardwareSerial(String hardwareSerial) {
        this.hardwareSerial = hardwareSerial;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getPayloadRaw() {
        return payloadRaw;
    }

    public void setPayloadRaw(String payloadRaw) {
        this.payloadRaw = payloadRaw;
    }

    public BeehiveData getPayloadFields() {
        return payloadFields;
    }

    public void setPayloadFields(BeehiveData payloadFields) {
        this.payloadFields = payloadFields;
    }

    public JSONObject getMetadata() {
        return metadata;
    }

    public void setMetadata(JSONObject metadata) {
        this.metadata = metadata;
    }

    public String getDownLinkUrl() {
        return downLinkUrl;
    }

    public void setDownLinkUrl(String downLinkUrl) {
        this.downLinkUrl = downLinkUrl;
    }
}
