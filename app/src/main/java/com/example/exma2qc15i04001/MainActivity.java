package com.example.exma2qc15i04001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//import static com.example.exma2qc15i04001.Activity_ListarContacto.lstContactos;

public class MainActivity extends AppCompatActivity {

    Button btnNewContacto, btnListaContacto, btnListaOrdenada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");

        btnNewContacto = findViewById(R.id.btnNewContacto);
        btnListaContacto = findViewById(R.id.btnListaContacto);
        btnListaOrdenada = findViewById(R.id.btnListaOrdenada);

        btnNewContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frmNewContactos = new Intent(MainActivity.this,Activity_AgregarContacto.class);
                startActivity(frmNewContactos);
            }
        });

        btnListaOrdenada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frmListaContactos = new Intent(MainActivity.this,Activity_ListaOrdenada.class);
                startActivity(frmListaContactos);
            }
        });

        btnListaContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (lstContactos.size() != 0){
                    Intent frmListaOrdenada = new Intent(MainActivity.this,Activity_ListarContacto.class);
                    startActivity(frmListaOrdenada);
                /*else {
                    Toast.makeText(MainActivity.this,"La Lista esta vacia",Toast.LENGTH_SHORT).show();
                }*/

            }
        });
    }
}
