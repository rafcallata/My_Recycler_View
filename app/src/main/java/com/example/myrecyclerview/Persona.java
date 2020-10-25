package com.example.myrecyclerview;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    String nombre;
    String edad;
    int foto;

    public Persona(String nombre, String edad, int foto) {
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
    }

    private List<Persona> personas;

    private void inicializarDatos(){
        personas = new ArrayList<>();
        personas.add(new Persona("Roberto Gómez Bolaño","41 años de edad",R.drawable.chavo));
        personas.add(new Persona("Carlos Villagrán","30 años de edad",R.drawable.quico));
        personas.add(new Persona("Ramón Valdés","50 años de edad",R.drawable.ramon));
    }
}
