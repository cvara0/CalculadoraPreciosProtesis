package com.example.calculadorapreciosprotesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditarPrecios extends AppCompatActivity {


    private EditText etEPProRem2;
    private EditText etEPProRem4;
    private EditText etEPProRem6;
    private EditText etEPProRem8;
    private EditText etEPProRem10;
    private EditText etEPProRem12;

    private  EditText etEPProFijCorCol;
    private  EditText etEPProFijCorEnBiol;
    private  EditText etEPProFijPerMun;
    private  EditText etEPProFijZirc;
    private  EditText etEPProFijPMA;
    private  EditText etEPProFijCeram;

    private  EditText etEPRepYVarPalYEnc;
    private  EditText etEPRepYVarAgr1Elem;
    private  EditText etEPRepYVarSubCadaUn;
    private  EditText etEPRepYVarRebEnProt;
    private  EditText etEPRepYVarCubInd;
    private  EditText etEPRepYVarPlacVacPre;
    private  EditText etEPRepYVarArmCroCob;

    private  EditText etEPOrtSinExp;
    private  EditText etEPOrtConExp;

    private SharedPreferences preferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_precios);

        preferencias=getSharedPreferences("preciosNuevos",Context.MODE_PRIVATE);
    //////////////////////PROTESIS REMOVIBLES

        etEPProRem2=(EditText)findViewById(R.id.editTextEPProRem2);
        etEPProRem2.setText(preferencias.getString("precioNuevoEPProRem2",""));

        etEPProRem4=(EditText)findViewById(R.id.editTextEPProRem4);
        etEPProRem4.setText(preferencias.getString("precioNuevoEPProRem4",""));

        etEPProRem6=(EditText)findViewById(R.id.editTextEPProRem6);
        etEPProRem6.setText(preferencias.getString("precioNuevoEPProRem6",""));

        etEPProRem8=(EditText)findViewById(R.id.editTextEPProRem8);
        etEPProRem8.setText(preferencias.getString("precioNuevoEPProRem8",""));

        etEPProRem10=(EditText)findViewById(R.id.editTextEPProRem10);
        etEPProRem10.setText(preferencias.getString("precioNuevoEPProRem10",""));

        etEPProRem12=(EditText)findViewById(R.id.editTextEPProRem12);
        etEPProRem12.setText(preferencias.getString("precioNuevoEPProRem12",""));

        ///////////////////////PROTESIS FIJAS
        etEPProFijCorCol=(EditText)findViewById(R.id.editTextEPProFijCorCol);
        etEPProFijCorCol.setText(preferencias.getString("precioNuevoEPProFijCorCol",""));

        etEPProFijCorEnBiol=(EditText)findViewById(R.id.editTextEPProFijCorEnBiol);
        etEPProFijCorEnBiol.setText(preferencias.getString("precioNuevoEPProFijCorEnBiol",""));

        etEPProFijPerMun=(EditText)findViewById(R.id.editTextEPProFijPerMun);
        etEPProFijPerMun.setText(preferencias.getString("precioNuevoEPProFijPerMun",""));

        etEPProFijZirc=(EditText)findViewById(R.id.editTextEPProFijZirc);
        etEPProFijZirc.setText(preferencias.getString("precioNuevoEPProFijZirc",""));

        etEPProFijPMA=(EditText)findViewById(R.id.editTextEPProFijPMA);
        etEPProFijPMA.setText(preferencias.getString("precioNuevoEPProFijPMA",""));

        etEPProFijCeram=(EditText)findViewById(R.id.editTextEPProFijCeram);
        etEPProFijCeram.setText(preferencias.getString("precioNuevoEPProFijCeram",""));

        ///////////////////////REPARACIONES Y VARIOS
        etEPRepYVarPalYEnc=(EditText)findViewById(R.id.editTextEPRepYVarPalYEnc);
        etEPRepYVarPalYEnc.setText(preferencias.getString("precioNuevoEPRepYVarPalYEnc",""));

        etEPRepYVarAgr1Elem=(EditText)findViewById(R.id.editTextEPRepYVarAgr1Elem);
        etEPRepYVarAgr1Elem.setText(preferencias.getString("precioNuevoEPRepYVarAgr1Elem",""));

        etEPRepYVarSubCadaUn=(EditText)findViewById(R.id.editTextEPRepYVarSubCadaUn);
        etEPRepYVarSubCadaUn.setText(preferencias.getString("precioNuevoEPRepYVarSubCadaUn",""));

        etEPRepYVarRebEnProt=(EditText)findViewById(R.id.editTextEPRepYVarRebEnProt);
        etEPRepYVarRebEnProt.setText(preferencias.getString("precioNuevoEPRepYVarRebEnProt",""));

        etEPRepYVarCubInd=(EditText)findViewById(R.id.editTextEPRepYVarCubInd);
        etEPRepYVarCubInd.setText(preferencias.getString("precioNuevoEPRepYVarCubInd",""));

        etEPRepYVarPlacVacPre=(EditText)findViewById(R.id.editTextEPRepYVarPlacVacPre);
        etEPRepYVarPlacVacPre.setText(preferencias.getString("precioNuevoEPRepYVarPlacVacPre",""));

        etEPRepYVarArmCroCob=(EditText)findViewById(R.id.editTextEPRepYVarArmCroCob);
        etEPRepYVarArmCroCob.setText(preferencias.getString("precioNuevoEPRepYVarArmCroCob",""));

        /////////////////////// ORTODONCIA
        etEPOrtSinExp=(EditText)findViewById(R.id.editTextEPOrtSinExp);
        etEPOrtSinExp.setText(preferencias.getString("precioNuevoEPOrtSinExp",""));

        etEPOrtConExp=(EditText)findViewById(R.id.editTextEPOrtConExp);
        etEPOrtConExp.setText(preferencias.getString("precioNuevoEPOrtConExp",""));
    }


    public void guardarYCerrar(View v) {

        SharedPreferences.Editor editor=preferencias.edit();

        editor.putString("precioNuevoEPProRem2",etEPProRem2.getText().toString());
        editor.putString("precioNuevoEPProRem4",etEPProRem4.getText().toString());
        editor.putString("precioNuevoEPProRem6",etEPProRem6.getText().toString());
        editor.putString("precioNuevoEPProRem8",etEPProRem8.getText().toString());
        editor.putString("precioNuevoEPProRem10",etEPProRem10.getText().toString());
        editor.putString("precioNuevoEPProRem12",etEPProRem12.getText().toString());

        editor.putString("precioNuevoEPProFijCorCol",etEPProFijCorCol.getText().toString());
        editor.putString("precioNuevoEPProFijCorEnBiol",etEPProFijCorEnBiol.getText().toString());
        editor.putString("precioNuevoEPProFijPerMun",etEPProFijPerMun.getText().toString());
        editor.putString("precioNuevoEPProFijZirc",etEPProFijZirc.getText().toString());
        editor.putString("precioNuevoEPProFijPMA",etEPProFijPMA.getText().toString());
        editor.putString("precioNuevoEPProFijCeram",etEPProFijCeram.getText().toString());

        editor.putString("precioNuevoEPRepYVarPalYEnc",etEPRepYVarPalYEnc.getText().toString());
        editor.putString("precioNuevoEPRepYVarAgr1Elem",etEPRepYVarAgr1Elem.getText().toString());
        editor.putString("precioNuevoEPRepYVarSubCadaUn",etEPRepYVarSubCadaUn.getText().toString());
        editor.putString("precioNuevoEPRepYVarRebEnProt",etEPRepYVarRebEnProt.getText().toString());
        editor.putString("precioNuevoEPRepYVarCubInd",etEPRepYVarCubInd.getText().toString());
        editor.putString("precioNuevoEPRepYVarPlacVacPre",etEPRepYVarPlacVacPre.getText().toString());
        editor.putString("precioNuevoEPRepYVarArmCroCob",etEPRepYVarArmCroCob.getText().toString());

        editor.putString("precioNuevoEPOrtSinExp",etEPOrtSinExp.getText().toString());
        editor.putString("precioNuevoEPOrtConExp",etEPOrtConExp.getText().toString());

        editor.commit();

        Intent i = new Intent(this, MainActivity.class);

        i.putExtra("etEPProRem2", etEPProRem2.getText().toString());
        i.putExtra("etEPProRem4", etEPProRem4.getText().toString());
        i.putExtra("etEPProRem6", etEPProRem6.getText().toString());
        i.putExtra("etEPProRem8", etEPProRem8.getText().toString());
        i.putExtra("etEPProRem10", etEPProRem10.getText().toString());
        i.putExtra("etEPProRem12", etEPProRem12.getText().toString());

        i.putExtra("etEPProFijCorCol",etEPProFijCorCol.getText().toString());
        i.putExtra("etEPProFijCorEnBiol",etEPProFijCorEnBiol.getText().toString());
        i.putExtra("etEPProFijPerMun",etEPProFijPerMun.getText().toString());
        i.putExtra("etEPProFijZirc",etEPProFijZirc.getText().toString());
        i.putExtra("etEPProFijPMA",etEPProFijPMA.getText().toString());
        i.putExtra("etEPProFijCeram",etEPProFijCeram.getText().toString());

        i.putExtra("etEPRepYVarPalYEnc",etEPRepYVarPalYEnc.getText().toString());
        i.putExtra("etEPRepYVarAgr1Elem",etEPRepYVarAgr1Elem.getText().toString());
        i.putExtra("etEPRepYVarSubCadaUn",etEPRepYVarSubCadaUn.getText().toString());
        i.putExtra("etEPRepYVarRebEnProt",etEPRepYVarRebEnProt.getText().toString());
        i.putExtra("etEPRepYVarCubInd",etEPRepYVarCubInd.getText().toString());
        i.putExtra("etEPRepYVarPlacVacPre",etEPRepYVarPlacVacPre.getText().toString());
        i.putExtra("etEPRepYVarArmCroCob",etEPRepYVarArmCroCob.getText().toString());

        i.putExtra("etEPOrtSinExp",etEPOrtSinExp.getText().toString());
        i.putExtra("etEPOrtConExp",etEPOrtConExp.getText().toString());

        startActivity(i);
        Toast toast1=Toast.makeText(this, "Cambios guardados",Toast.LENGTH_SHORT);
        toast1.show();
        finish();


    }

}