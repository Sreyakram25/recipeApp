package com.example.recipeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Search_rec extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_rec);
        ed1=(EditText) findViewById(R.id.recipesearch);
        b1=(AppCompatButton) findViewById(R.id.searched);
        b2=(AppCompatButton) findViewById(R.id.menuback);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String getRecipe=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),"searched item is"+" "+getRecipe,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });
    }

    }
