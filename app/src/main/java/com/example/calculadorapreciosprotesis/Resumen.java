package com.example.calculadorapreciosprotesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    private TextView tvResumen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        tvResumen=(TextView) findViewById(R.id.textViewResumen);
        tvResumen.setText(getIntent().getStringExtra("resumen"));
    }
    public void volverButton(View view){
        finish();
    }
}