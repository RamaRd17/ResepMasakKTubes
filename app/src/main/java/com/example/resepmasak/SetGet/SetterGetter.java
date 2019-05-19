package com.example.resepmasak.SetGet;


public class SetterGetter {
    private String judul;
    private String photo;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKategorimakanan() {
        return kategorimakanan;
    }

    public void setKategorimakanan(String kategorimakanan) {
        this.kategorimakanan = kategorimakanan;
    }

    private String deskripsi;
    private String kategorimakanan;
}


