package com.example.myapplication.model;

public class TreatmentModel {
    private String title;
    private String deskripsi;
    private boolean expanded;

    public TreatmentModel() {
    }

    public TreatmentModel(String title, String deskripsi) {
        this.title = title;
        this.deskripsi = deskripsi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
