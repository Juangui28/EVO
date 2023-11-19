package com.juanguillermo.evo;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.juanguillermo.evo.R;
public class BlogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        // Obtener referencias a los elementos de diseño
        Button btnBackToMain = findViewById(R.id.btnBackToMain);
        TextView textTitle = findViewById(R.id.textTitleBlog);
        TextView textContent = findViewById(R.id.textContent);
        TextView textDate = findViewById(R.id.textDate);

        // Datos ficticios quemados del blog
        String blogTitle = "Increíble Concierto";
        String blogContent = "Ayer asistí a un concierto increíble. La energía en el lugar era asombrosa...";
        String blogDate = "Fecha de Publicación: 18/11/2023";

        // Configurar los elementos de diseño con los datos del blog
        textTitle.setText(blogTitle);
        textContent.setText(blogContent);
        textDate.setText(blogDate);

        // Configurar el botón para volver a MainActivity
        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BlogActivity.this, MainActivity.class));
                finish(); // Cierra la actividad actual para que no se apile en la pila de actividades
            }
        });
    }
}
