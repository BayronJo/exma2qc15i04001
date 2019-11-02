package com.example.exma2qc15i04001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import Entidades.Contactos;

public class Activity_AgregarContacto extends AppCompatActivity {

    TextView txtNombre,txtApellido,txtTelefono1,txtTelefono2;
    Button btnAgregar;
    CheckBox cbFavorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__agregar_contacto);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtTelefono1 = findViewById(R.id.txtTelefono1);
        txtTelefono2 = findViewById(R.id.txtTelefono2);
        cbFavorito = findViewById(R.id.cbFavorito);
        btnAgregar = findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNombre.getText().length() != 0 && txtApellido.getText().length() != 0 && txtTelefono1.getText().length() != 0 && txtTelefono2.getText().length() != 0){
                    Contactos _contact = new Contactos();
                    _contact.setNombre(txtNombre.getText().toString());
                    _contact.setApellido(txtApellido.getText().toString());
                    _contact.setTelefono1(  Integer.parseInt(txtTelefono1.getText().toString()));
                    _contact.setTelefono2(  Integer.parseInt(txtTelefono2.getText().toString()));

                    if (cbFavorito.isChecked()){
                        _contact.setFavorito(1);
                    }else {
                        _contact.setFavorito(0);
                    }

                    //lstContactos.add(_contact);

                    Toast.makeText(Activity_AgregarContacto.this,"Se guardo correctamente",Toast.LENGTH_SHORT).show();
                    finish();
                }else {
                    Toast.makeText(Activity_AgregarContacto.this,"Los Campos no pueden quedar vacios",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
