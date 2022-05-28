package com.example.supermercado.models;

public class UsuarioCajero extends Usuario{
    private int ventas;

    public UsuarioCajero(String nombre, String rut, String usuario, String contraseña, int ventas) {
        super(nombre, rut, usuario, contraseña);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}
