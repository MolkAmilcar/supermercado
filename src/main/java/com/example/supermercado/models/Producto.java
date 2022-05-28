package com.example.supermercado.models;

public class Producto {
    private String nombre;
    private int sección;
    private int stock;
    private int precio;
    private String ubicación;

    public Producto(String nombre, int sección,int stock, int precio, String ubicación) {
        this.nombre = nombre;
        this.sección = sección;
        this.stock = stock;
        this.precio = precio;
        this.ubicación = ubicación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSección() {
        return sección;
    }

    public void setSección(int sección) {
        this.sección = sección;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }
}
