package com.example.calculadorapreciosprotesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private TextView fecha;
    private TextView tvProRem2;
    private TextView tvProRem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fecha=(TextView)findViewById(R.id.textViewFecha);
        fecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        tvProRem2=(TextView) findViewById(R.id.textViewProRem2);
        //seguir de aca
        


    }
    public void editarPreciosActivity(View view){



        Intent i = new Intent(this, EditarPrecios.class );

        startActivity(i);


    }
}