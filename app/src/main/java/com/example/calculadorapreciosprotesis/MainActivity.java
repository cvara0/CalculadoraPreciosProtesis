package com.example.calculadorapreciosprotesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.SharedPreferences;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView fecha;

    private TextView tvProRem1;
    private TextView tvProRem2;
    private TextView tvProRem3;
    private TextView tvProRem4;
    private TextView tvProRem5;
    private TextView tvProRem6;
    private TextView tvProRem7;
    private TextView tvProRem8;
    private TextView tvProRem9;
    private TextView tvProRem10;
    private TextView tvProRem11;
    private TextView tvProRem12;

    private TextView tvProFijCorCol;
    private TextView tvProFijCorEnBiol;
    private TextView tvProFijPerMun;
    private TextView tvProFijZirc;
    private TextView tvProFijPMA;
    private TextView tvProFijCeram;

    private TextView tvRepYVarPalYEnc;
    private TextView tvRepYVarAgr1Elem;
    private TextView tvRepYVarSubCadUn;
    private TextView tvRepYVarRebEnPro;
    private TextView tvRepYVarCubInd;
    private TextView tvRepYVarPlacVacPre;
    private TextView tvRepYVarArmCroCob;

    private TextView tvOrtSinExp;
    private TextView tvOrtConExp;

    private SharedPreferences preferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fecha=(TextView)findViewById(R.id.textViewFecha);
        fecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        preferencias=getSharedPreferences("precios", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();

//////////////////////PROTESIS REMOVIBLES
        try {
            editor.putString("precioNuevoProRem1",String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProRem2"))/2));
        }catch (Exception e){}
        try {
        editor.putString("precioNuevoProRem2", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProRem2"))));
        }catch (Exception e){}
        try {
        editor.putString("precioNuevoProRem3", String.valueOf((Float.parseFloat(getIntent().getStringExtra("etEPProRem2")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem4"))) / 2));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem4", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProRem4"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem5", String.valueOf((Float.parseFloat(getIntent().getStringExtra("etEPProRem4")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem6"))) / 2));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem6", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProRem6"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem7", String.valueOf((Float.parseFloat(getIntent().getStringExtra("etEPProRem6")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem8"))) / 2));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem8", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProRem8"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem9", String.valueOf((Float.parseFloat(getIntent().getStringExtra("etEPProRem8")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem10"))) / 2));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem10", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProRem10"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem11", String.valueOf((Float.parseFloat(getIntent().getStringExtra("etEPProRem10")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem12"))) / 2));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProRem12", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProRem12"))));
        }catch (Exception e){}

        ///////////////////////PROTESIS FIJAS
        try {
        editor.putString("precioNuevoProFijCorCol", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProFijCorCol"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProFijCorEnBiol", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProFijCorEnBiol"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProFijPerMun", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProFijPerMun"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProFijZirc", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProFijZirc"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProFijPMA", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProFijPMA"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoProFijCeram", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPProFijCeram"))));
        }catch (Exception e){}

        ///////////////////////REPARACIONES Y VARIOS
        try {
            editor.putString("precioNuevoRepYVarPalYEnc", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarPalYEnc"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoRepYVarAgr1Elem", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarAgr1Elem"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoRepYVarSubCadUn", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarSubCadaUn"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoRepYVarRebEnPro", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarRebEnProt"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoRepYVarCubInd", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarCubInd"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoRepYVarPlacVacPre", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarPlacVacPre"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevoRepYVarArmCroCob", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarArmCroCob"))));
        }catch (Exception e){}

        ///////////////////////ORTODONCIA
        try {
        editor.putString("precioNuevotvOrtSinExp", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPOrtSinExp"))));
        }catch (Exception e){}
        try {
            editor.putString("precioNuevotvOrtConExp", String.valueOf(Float.parseFloat(getIntent().getStringExtra("etEPOrtConExp"))));
        }catch (Exception e){}

        editor.commit();

//////////////////////PROTESIS REMOVIBLES
        tvProRem1=(TextView) findViewById(R.id.textViewProRem1);
        tvProRem2=(TextView) findViewById(R.id.textViewProRem2);
        tvProRem3=(TextView) findViewById(R.id.textViewProRem3);
        tvProRem4=(TextView) findViewById(R.id.textViewProRem4);
        tvProRem5=(TextView) findViewById(R.id.textViewProRem5);
        tvProRem6=(TextView) findViewById(R.id.textViewProRem6);
        tvProRem7=(TextView) findViewById(R.id.textViewProRem7);
        tvProRem8=(TextView) findViewById(R.id.textViewProRem8);
        tvProRem9=(TextView) findViewById(R.id.textViewProRem9);
        tvProRem10=(TextView) findViewById(R.id.textViewProRem10);
        tvProRem11=(TextView) findViewById(R.id.textViewProRem11);
        tvProRem12=(TextView) findViewById(R.id.textViewProRem12);

        ///////////////////////PROTESIS FIJAS
        tvProFijCorCol=(TextView) findViewById(R.id.textViewProFijCorCol);
        tvProFijCorEnBiol=(TextView) findViewById(R.id.textViewProFijCoreEnBiol);
        tvProFijPerMun=(TextView) findViewById(R.id.textViewProFijPerMun);
        tvProFijZirc=(TextView) findViewById(R.id.textViewProFijZirc);
        tvProFijPMA=(TextView) findViewById(R.id.textViewProFijPMA);
        tvProFijCeram=(TextView) findViewById(R.id.textViewProFijCeram);

///////////////////////REPARACIONES Y VARIOS
        tvRepYVarPalYEnc=(TextView) findViewById(R.id.textViewRepYVarPalYEnc);
        tvRepYVarAgr1Elem=(TextView) findViewById(R.id.textViewRepYVarAgr1Elem);
        tvRepYVarSubCadUn=(TextView) findViewById(R.id.textViewRepYVarSubCadUn);
        tvRepYVarRebEnPro=(TextView) findViewById(R.id.textViewRepYVarRebEnPro);
        tvRepYVarCubInd=(TextView) findViewById(R.id.textViewRepYVarCubInd);
        tvRepYVarPlacVacPre=(TextView) findViewById(R.id.textViewRepYVarPlacVacPre);
        tvRepYVarArmCroCob=(TextView) findViewById(R.id.textViewRepYVarArmCroCob);

///////////////////////ORTODONCIA
        tvOrtSinExp=(TextView) findViewById(R.id.textViewOrtSinExp);
        tvOrtConExp=(TextView) findViewById(R.id.textViewOrtConExp);


//////////////////////PROTESIS REMOVIBLES
        tvProRem1.setText(preferencias.getString("precioNuevoProRem1",""));
        tvProRem2.setText(preferencias.getString("precioNuevoProRem2",""));
        tvProRem3.setText(preferencias.getString("precioNuevoProRem3",""));
        tvProRem4.setText(preferencias.getString("precioNuevoProRem4",""));
        tvProRem5.setText(preferencias.getString("precioNuevoProRem5",""));
        tvProRem6.setText(preferencias.getString("precioNuevoProRem6",""));
        tvProRem7.setText(preferencias.getString("precioNuevoProRem7",""));
        tvProRem8.setText(preferencias.getString("precioNuevoProRem8",""));
        tvProRem9.setText(preferencias.getString("precioNuevoProRem9",""));
        tvProRem10.setText(preferencias.getString("precioNuevoProRem10",""));
        tvProRem11.setText(preferencias.getString("precioNuevoProRem11",""));
        tvProRem12.setText(preferencias.getString("precioNuevoProRem12",""));
///////////////////////PROTESIS FIJAS
        tvProFijCorCol.setText(preferencias.getString("precioNuevoProFijCorCol",""));
        tvProFijCorEnBiol.setText(preferencias.getString("precioNuevoProFijCorEnBiol",""));
        tvProFijPerMun.setText(preferencias.getString("precioNuevoProFijPerMun",""));
        tvProFijZirc.setText(preferencias.getString("precioNuevoProFijZirc",""));
        tvProFijPMA.setText(preferencias.getString("precioNuevoProFijPMA",""));
        tvProFijCeram.setText(preferencias.getString("precioNuevoProFijCeram",""));

 ///////////////////////REPARACIONES Y VARIOS
        tvRepYVarPalYEnc.setText(preferencias.getString("precioNuevoRepYVarPalYEnc",""));
        tvRepYVarAgr1Elem.setText(preferencias.getString("precioNuevoRepYVarAgr1Elem",""));
        tvRepYVarSubCadUn.setText(preferencias.getString("precioNuevoRepYVarSubCadUn",""));
        tvRepYVarRebEnPro.setText(preferencias.getString("precioNuevoRepYVarRebEnPro",""));
        tvRepYVarCubInd.setText(preferencias.getString("precioNuevoRepYVarCubInd",""));
        tvRepYVarPlacVacPre.setText(preferencias.getString("precioNuevoRepYVarPlacVacPre",""));
        tvRepYVarArmCroCob.setText(preferencias.getString("precioNuevoRepYVarArmCroCob",""));

        ///////////////////////ORTODONCIA
        tvOrtSinExp.setText(preferencias.getString("precioNuevotvOrtSinExp",""));
        tvOrtConExp.setText(preferencias.getString("precioNuevotvOrtConExp",""));


    }
    public void editarPreciosActivity(View view){

        Intent i = new Intent(this, EditarPrecios.class );

        startActivity(i);



    }
}