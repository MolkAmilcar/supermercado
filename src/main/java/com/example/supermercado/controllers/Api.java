package com.example.supermercado.controllers;

import com.example.supermercado.models.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")
public class Api {
    private static List<Merma> listaMerma = new ArrayList<Merma>();
    private static List<Producto> listaProducto = new ArrayList<Producto>();
    private static List<UsuarioCajero> listaUsuarioCajero = new ArrayList<UsuarioCajero>();
    private static List<UsuarioReponedor> listaUsuarioReponedor = new ArrayList<UsuarioReponedor>();

    @GetMapping("/merma")
    public List<Merma> getMerma(){
        listaMerma.add(new Merma("merma", "merma cero", 0));
        return listaMerma;
    }

    @GetMapping("/producto")
    public List<Producto> getProducto(){
        listaProducto.add(new Producto("Sopa champiñones gourmet", 13, 10, 590, "Derecha de pasillo verduras"));
        listaProducto.add(new Producto("Cerveza cusqueña 6u", 2, 20, 3569, "Fila de refrigeradores"));
        return listaProducto;
    }

    @GetMapping("/cajero")
    public List<UsuarioCajero> getUsuarioCajero(){
        listaUsuarioCajero.add(new UsuarioCajero("Javiera", "14.013.586-0", "javieraBae", "baejinra123", 45));
        listaUsuarioCajero.add(new UsuarioCajero("Ivania", "20.943.124-6", "avonalbahaca", "albahaca|||", 2));
        return listaUsuarioCajero;
    }

    @GetMapping("/reponedor")
    public List<UsuarioReponedor> getUsuarioReponedor(){
        listaUsuarioReponedor.add(new UsuarioReponedor("Sabina", "17.602.950-1", "sabinagod", "sabina132", 2));
        listaUsuarioReponedor.add(new UsuarioReponedor("Raul", "17.341.704-7", "rauuul", "raulgillete", 4));
        return listaUsuarioReponedor;
    }
}
