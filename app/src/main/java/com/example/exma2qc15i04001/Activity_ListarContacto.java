package com.example.exma2qc15i04001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Entidades.Contactos;

public class Activity_ListarContacto extends AppCompatActivity {

    // Declaracion de variables
    public static List<Contactos> dataSources = new ArrayList<>();
   // private RecyclerView recyclerContactos;
   // private LinearLayoutManager lManager;
    //private AdaptadorContactos adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__listar_contacto);
    }
}
