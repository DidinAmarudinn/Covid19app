package com.example.myapplication.model;

public class ProtectModel {
    private   String title;
  private   String deskripsi;

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    private boolean expanded;

    public ProtectModel(String title, String deskripsi) {
        this.title = title;
        this.deskripsi = deskripsi;
    }
    public ProtectModel() {
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
}
