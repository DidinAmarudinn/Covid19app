package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class RiwayatModel {
    @SerializedName("combinedKey")
    private String combinedKey;
    @SerializedName("lastUpdate")
    private String lastUpdate;
    @SerializedName("active")
    private String active;
    @SerializedName("recovered")
    private String recovered;
    @SerializedName("confirmed")
    private String confirmed;
    @SerializedName("deaths")
    private String deaths;


    public RiwayatModel(String combinedKey, String lastUpdate, String active, String recovered, String confirmed, String deaths) {
        this.combinedKey = combinedKey;
        this.lastUpdate = lastUpdate;
        this.active = active;
        this.recovered = recovered;
        this.confirmed = confirmed;
        this.deaths = deaths;
    }

    public String getCombinedKey() {
        return combinedKey;
    }

    public void setCombinedKey(String combinedKey) {
        this.combinedKey = combinedKey;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }
}
