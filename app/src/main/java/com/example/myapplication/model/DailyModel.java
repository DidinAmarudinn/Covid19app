package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class DailyModel {
    @SerializedName("confirmed")
    private Confirmed confirmed;
    @SerializedName("deaths")
    private Deaths deaths;
    @SerializedName("recovered")
    private Recovered recovered;
    @SerializedName("reportDate")
    private String reportDate;

    public DailyModel(Confirmed confirmed, Deaths deaths, Recovered recovered, String reportDate) {
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
        this.reportDate = reportDate;
    }


    public Confirmed getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Confirmed confirmed) {
        this.confirmed = confirmed;
    }

    public Deaths getDeaths() {
        return deaths;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public Recovered getRecovered() {
        return recovered;
    }

    public void setRecovered(Recovered recovered) {
        this.recovered = recovered;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public class Confirmed{
        @SerializedName("china")
        private String china;
        @SerializedName("outsideChina")
        private String outsideChina;

        public Confirmed(String china, String outsideChina) {
            this.china = china;
            this.outsideChina = outsideChina;
        }

        public String getChina() {
            return china;
        }

        public void setChina(String china) {
            this.china = china;
        }

        public String getOutsideChina() {
            return outsideChina;
        }

        public void setOutsideChina(String outsideChina) {
            this.outsideChina = outsideChina;
        }
    }
    public class Deaths{
        @SerializedName("china")
        private String china;
        @SerializedName("outsideChina")
        private String outsideChina;

        public Deaths(String china, String outsideChina) {
            this.china = china;
            this.outsideChina = outsideChina;
        }

        public String getChina() {
            return china;
        }

        public void setChina(String china) {
            this.china = china;
        }

        public String getOutsideChina() {
            return outsideChina;
        }

        public void setOutsideChina(String outsideChina) {
            this.outsideChina = outsideChina;
        }
    }
    public class Recovered{
        @SerializedName("china")
        private String china;
        @SerializedName("outsideChina")
        private String outsideChina;

        public Recovered(String china, String outsideChina) {
            this.china = china;
            this.outsideChina = outsideChina;
        }

        public String getChina() {
            return china;
        }

        public void setChina(String china) {
            this.china = china;
        }

        public String getOutsideChina() {
            return outsideChina;
        }

        public void setOutsideChina(String outsideChina) {
            this.outsideChina = outsideChina;
        }
    }
}
