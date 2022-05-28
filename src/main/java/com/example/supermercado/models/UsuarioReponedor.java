package com.example.supermercado.models;

public class UsuarioReponedor extends Usuario{
    private int sección;

    public UsuarioReponedor(String nombre, String rut, String usuario, String contraseña, int sección) {
        super(nombre, rut, usuario, contraseña);
        this.sección = sección;
    }

    public int getSección() {
        return sección;
    }

    public void setSección(int sección) {
        this.sección = sección;
    }
}
