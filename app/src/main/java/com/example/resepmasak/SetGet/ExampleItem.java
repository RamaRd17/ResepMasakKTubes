package com.example.resepmasak.SetGet;

public class ExampleItem {

    private String judul;
    private String imageResource;
    private String deskirpsi;
    private String kategori;
    public ExampleItem(String judul,String imageResource, String deskirpsi, String kategori) {
        this.judul = judul;
        this.imageResource = imageResource;
        this.deskirpsi = deskirpsi;
        this.kategori = kategori;
    }

    public String getImageResource() {
        return imageResource;
    }

    public String getText1() {
        return judul;
    }

    public String getText2() {
        return deskirpsi;
    }
    public String getText3() {
        return kategori;
    }
}
