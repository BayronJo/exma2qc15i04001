package com.example.exma2qc15i04001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.AdaptadorContactos;
import Entidades.Contactos;

public class Activity_ListaOrdenada extends AppCompatActivity {

    // Declaracion de variables
    public static List<Contactos> dataSources;
    private RecyclerView recyclerContactos;
    private LinearLayoutManager lManager;
    private AdaptadorContactos adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__lista_ordenada);

        // Inicializamos los objetos
        this.recyclerContactos = findViewById(R.id.listContactos);
        // this.CargarDatos();
        this.lManager = new LinearLayoutManager(this);
        this.adaptador = new AdaptadorContactos(this.dataSources);

        // Establecemos las propiedades
        this.recyclerContactos.setHasFixedSize(true);
        this.recyclerContactos.setLayoutManager(this.lManager);
        this.recyclerContactos.setAdapter(this.adaptador);
    }

    private void CargarDatos() {
        this.dataSources = new ArrayList<>();

        // Creamos el primer Contacto
        Contactos nuevoContacto = new Contactos();
        nuevoContacto.setNombre("Contacto 1");
        nuevoContacto.setApellido("asdad");
        nuevoContacto.setTelefono1(1231231);
        nuevoContacto.setFavorito(1);
        nuevoContacto.setTelefono2(1231);
        this.dataSources.add(nuevoContacto);

        // Creamo el segundo Contacto
        nuevoContacto = new Contactos();
        nuevoContacto.setNombre("Contacto 2");
        nuevoContacto.setApellido("asdad");
        nuevoContacto.setTelefono1(123123);
        nuevoContacto.setTelefono2(1231);
        nuevoContacto.setFavorito(0);
        this.dataSources.add(nuevoContacto);
    }
}
