package com.example.calculadorapreciosprotesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    //////////////////////////TEXT VIEW
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
    private TextView tvProRem13;
    private TextView tvProRem14;

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

    private TextView tvCalcTotal;

//////////////////////////CHECK BOX
    private CheckBox cbProRem1;
    private CheckBox cbProRem2;
    private CheckBox cbProRem3;
    private CheckBox cbProRem4;
    private CheckBox cbProRem5;
    private CheckBox cbProRem6;
    private CheckBox cbProRem7;
    private CheckBox cbProRem8;
    private CheckBox cbProRem9;
    private CheckBox cbProRem10;
    private CheckBox cbProRem11;
    private CheckBox cbProRem12;
    private CheckBox cbProRem13;
    private CheckBox cbProRem14;

    private CheckBox cbProFijCorCol;
    private CheckBox cbProFijCorEnBiol;
    private CheckBox cbProFijPerMun;
    private CheckBox cbProFijZirc;
    private CheckBox cbProFijPMA;
    private CheckBox cbProFijCeram;

    private CheckBox cbRepYVarPalYEnc;
    private CheckBox cbRepYVarAgr1Elem;
    private CheckBox cbRepYVarSubCadUn;
    private CheckBox cbRepYVarRebEnPro;
    private CheckBox cbRepYVarCubInd;
    private CheckBox cbRepYVarPlacVacPre;
    private CheckBox cbRepYVarArmCroCob;

    private CheckBox cbOrtSinExp;
    private CheckBox cbOrtConExp;

    //////////////////////////EDIT TEXT
    private EditText etCantProRem1;
    private EditText etCantProRem2;
    private EditText etCantProRem3;
    private EditText etCantProRem4;
    private EditText etCantProRem5;
    private EditText etCantProRem6;
    private EditText etCantProRem7;
    private EditText etCantProRem8;
    private EditText etCantProRem9;
    private EditText etCantProRem10;
    private EditText etCantProRem11;
    private EditText etCantProRem12;
    private EditText etCantProRem13;
    private EditText etCantProRem14;

    private EditText etCantProFijCorCol;
    private EditText etCantProFijCorEnBiol;
    private EditText etCantProFijPerMun;
    private EditText etCantProFijZirc;
    private EditText etCantProFijPMA;
    private EditText etCantProFijCeram;

    private EditText etCantRepYVarPalYEnc;
    private EditText etCantRepYVarAgr1Elem;
    private EditText etCantRepYVarSubCadUn;
    private EditText etCantRepYVarRebEnPro;
    private EditText etCantRepYVarCubInd;
    private EditText etCantRepYVarPlacVacPre;
    private EditText etCantRepYVarArmCroCob;

    private EditText etCantOrtSinExp;
    private EditText etCantOrtConExp;

    private EditText etAnticipo;
    private EditText etNombreCliente;



//////////OTROS
    private TextView tvFecha;
    private SharedPreferences preferencias;
    private String resumen="";
    //private Button bVerResum;

    String fechaString="";
    String nombreClienteString="";
    String anticipoString="";
    String totalString="";

    String proRem1String="";
    String proRem2String="";
    String proRem3String="";
    String proRem4String="";
    String proRem5String="";
    String proRem6String="";
    String proRem7String="";
    String proRem8String="";
    String proRem9String="";
    String proRem10String="";
    String proRem11String="";
    String proRem12String="";
    String proRem13String="";
    String proRem14String="";
    String proFijCorColString="";
    String proFijCorEnBiolString="";
    String proFijPerMunString="";
    String proFijZircString="";
    String proFijPMAString="";
    String proFijCeramString="";

    String repYVarPalYEncString="";
    String repYVarAgr1ElemString="";
    String repYVarSubCadUnString="";
    String repYVarRebEnProString="";
    String repYVarCubIndString="";
    String repYVarPlacVacPreString="";
    String repYVarArmCroCobString="";

    String ortSinExpString="";
    String ortConExpString="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFecha=(TextView)findViewById(R.id.textViewFecha);
        tvFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));


        preferencias=getSharedPreferences("precios", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();

//////////////////////PROTESIS REMOVIBLES
        try {
            editor.putString("precioNuevoProRem1",String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem2"))*100/2)/100));
        }catch (Exception ignored){}
        try {
        editor.putString("precioNuevoProRem2", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem2"))*100)/100));
        }catch (Exception ignored){}
        try {
        editor.putString("precioNuevoProRem3", String.valueOf((float) Math.round((Float.parseFloat(getIntent().getStringExtra("etEPProRem2")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem4"))) *100/ 2)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem4", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem4"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem5", String.valueOf((float) Math.round((Float.parseFloat(getIntent().getStringExtra("etEPProRem4")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem6"))) *100/ 2)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem6", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem6"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem7", String.valueOf((float) Math.round((Float.parseFloat(getIntent().getStringExtra("etEPProRem6")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem8"))) *100/ 2)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem8", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem8"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem9", String.valueOf((float) Math.round((Float.parseFloat(getIntent().getStringExtra("etEPProRem8")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem10"))) *100/ 2)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem10", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem10"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem11", String.valueOf((float) Math.round((Float.parseFloat(getIntent().getStringExtra("etEPProRem10")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem12"))) *100/ 2)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem12", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem12"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem13", String.valueOf((float) Math.round((Float.parseFloat(getIntent().getStringExtra("etEPProRem12")) + Float.parseFloat(getIntent().getStringExtra("etEPProRem14"))) *100/ 2)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProRem14", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProRem14"))*100)/100));
        }catch (Exception ignored){}

        ///////////////////////PROTESIS FIJAS
        try {
        editor.putString("precioNuevoProFijCorCol", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProFijCorCol"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProFijCorEnBiol", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProFijCorEnBiol"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProFijPerMun", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProFijPerMun"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProFijZirc", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProFijZirc"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProFijPMA", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProFijPMA"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoProFijCeram", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPProFijCeram"))*100)/100));
        }catch (Exception ignored){}

        ///////////////////////REPARACIONES Y VARIOS
        try {
            editor.putString("precioNuevoRepYVarPalYEnc", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarPalYEnc"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoRepYVarAgr1Elem", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarAgr1Elem"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoRepYVarSubCadUn", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarSubCadaUn"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoRepYVarRebEnPro", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarRebEnProt"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoRepYVarCubInd", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarCubInd"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoRepYVarPlacVacPre", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarPlacVacPre"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevoRepYVarArmCroCob", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPRepYVarArmCroCob"))*100)/100));
        }catch (Exception ignored){}

        ///////////////////////ORTODONCIA
        try {
        editor.putString("precioNuevotvOrtSinExp", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPOrtSinExp"))*100)/100));
        }catch (Exception ignored){}
        try {
            editor.putString("precioNuevotvOrtConExp", String.valueOf((float) Math.round(Float.parseFloat(getIntent().getStringExtra("etEPOrtConExp"))*100)/100));
        }catch (Exception ignored){}

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
        tvProRem13=(TextView) findViewById(R.id.textViewProRem13);
        tvProRem14=(TextView) findViewById(R.id.textViewProRem14);

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
        tvProRem13.setText(preferencias.getString("precioNuevoProRem13",""));
        tvProRem14.setText(preferencias.getString("precioNuevoProRem14",""));
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

    public void calcularTotalButton(View view) {
        etAnticipo = (EditText) findViewById(R.id.editTextAnticipo);
        etNombreCliente = (EditText) findViewById(R.id.editTextNombreCliente);

        etCantProRem1 = (EditText) findViewById(R.id.editTextCantProRem1);
        etCantProRem2 = (EditText) findViewById(R.id.editTextCantProRem2);
        etCantProRem3 = (EditText) findViewById(R.id.editTextCantProRem3);
        etCantProRem4 = (EditText) findViewById(R.id.editTextCantProRem4);
        etCantProRem5 = (EditText) findViewById(R.id.editTextCantProRem5);
        etCantProRem6 = (EditText) findViewById(R.id.editTextCantProRem6);
        etCantProRem7 = (EditText) findViewById(R.id.editTextCantProRem7);
        etCantProRem8 = (EditText) findViewById(R.id.editTextCantProRem8);
        etCantProRem9 = (EditText) findViewById(R.id.editTextCantProRem9);
        etCantProRem10 = (EditText) findViewById(R.id.editTextCantProRem10);
        etCantProRem11 = (EditText) findViewById(R.id.editTextCantProRem11);
        etCantProRem12 = (EditText) findViewById(R.id.editTextCantProRem12);
        etCantProRem13 = (EditText) findViewById(R.id.editTextCantProRem13);
        etCantProRem14 = (EditText) findViewById(R.id.editTextCantProRem14);

        etCantProFijCorCol = (EditText) findViewById(R.id.editTextCantProFijCorCol);
        etCantProFijCorEnBiol = (EditText) findViewById(R.id.editTextCantProFijCorEnBiol);
        etCantProFijPerMun = (EditText) findViewById(R.id.editTextCantProFijPerMun);
        etCantProFijZirc = (EditText) findViewById(R.id.editTextCantProFijZirc);
        etCantProFijPMA = (EditText) findViewById(R.id.editTextCantProFijPMA);
        etCantProFijCeram = (EditText) findViewById(R.id.editTextCantProFijCeram);

        etCantRepYVarPalYEnc = (EditText) findViewById(R.id.editTextCantRepYVarPalYEnc);
        etCantRepYVarAgr1Elem = (EditText) findViewById(R.id.editTextCantRepYVarAgr1Elem);
        etCantRepYVarSubCadUn = (EditText) findViewById(R.id.editTextCantRepYVarSubCadUn);
        etCantRepYVarRebEnPro = (EditText) findViewById(R.id.editTextCantRepYVarRebEnPro);
        etCantRepYVarCubInd = (EditText) findViewById(R.id.editTextCantRepYVarCubInd);
        etCantRepYVarPlacVacPre = (EditText) findViewById(R.id.editTextCantRepYVarPlacVacPre);
        etCantRepYVarArmCroCob = (EditText) findViewById(R.id.editTextCantRepYVarArmCroCob);

        etCantOrtSinExp = (EditText) findViewById(R.id.editTextCantOrtSinExp);
        etCantOrtConExp = (EditText) findViewById(R.id.editTextCantOrtConExp);

        cbProRem1 = (CheckBox) findViewById(R.id.checkBoxProRem1);
        cbProRem2 = (CheckBox) findViewById(R.id.checkBoxProRem2);
        cbProRem3 = (CheckBox) findViewById(R.id.checkBoxProRem3);
        cbProRem4 = (CheckBox) findViewById(R.id.checkBoxProRem4);
        cbProRem5 = (CheckBox) findViewById(R.id.checkBoxProRem5);
        cbProRem6 = (CheckBox) findViewById(R.id.checkBoxProRem6);
        cbProRem7 = (CheckBox) findViewById(R.id.checkBoxProRem7);
        cbProRem8 = (CheckBox) findViewById(R.id.checkBoxProRem8);
        cbProRem9 = (CheckBox) findViewById(R.id.checkBoxProRem9);
        cbProRem10 = (CheckBox) findViewById(R.id.checkBoxProRem10);
        cbProRem11 = (CheckBox) findViewById(R.id.checkBoxProRem11);
        cbProRem12 = (CheckBox) findViewById(R.id.checkBoxProRem12);
        cbProRem13 = (CheckBox) findViewById(R.id.checkBoxProRem13);
        cbProRem14 = (CheckBox) findViewById(R.id.checkBoxProRem14);

        cbProFijCorCol = (CheckBox) findViewById(R.id.checkBoxProFijCorCol);
        cbProFijCorEnBiol = (CheckBox) findViewById(R.id.checkBoxProFijCorEnBiol);
        cbProFijPerMun = (CheckBox) findViewById(R.id.checkBoxProFijPerMun);
        cbProFijZirc = (CheckBox) findViewById(R.id.checkBoxProFijZirc);
        cbProFijPMA = (CheckBox) findViewById(R.id.checkBoxProFijPMA);
        cbProFijCeram = (CheckBox) findViewById(R.id.checkBoxProFijCeram);

        cbRepYVarPalYEnc = (CheckBox) findViewById(R.id.checkBoxRepYVarPalYEnc);
        cbRepYVarAgr1Elem = (CheckBox) findViewById(R.id.checkBoxRepYVarAgr1Elem);
        cbRepYVarSubCadUn = (CheckBox) findViewById(R.id.checkBoxRepYVarSubCadUn);
        cbRepYVarRebEnPro = (CheckBox) findViewById(R.id.checkBoxRepYVarRebEnPro);
        cbRepYVarCubInd = (CheckBox) findViewById(R.id.checkBoxRepYVarCubInd);
        cbRepYVarPlacVacPre = (CheckBox) findViewById(R.id.checkBoxRepYVarPlacVacPre);
        cbRepYVarArmCroCob = (CheckBox) findViewById(R.id.checkBoxRepYVarArmCroCob);

        cbOrtSinExp = (CheckBox) findViewById(R.id.checkBoxOrtSinExp);
        cbOrtConExp = (CheckBox) findViewById(R.id.checkBoxOrtConExp);

        float valorAnticipo = 0;
        try {
            valorAnticipo = Float.parseFloat(etAnticipo.getText().toString());
        } catch (Exception e) {
        }

        float total = 0;

        if (cbProRem1.isChecked()) {
            total += (Float.parseFloat(tvProRem1.getText().toString()) * Float.parseFloat(etCantProRem1.getText().toString()));
            proRem1String = "-Prót. rem. 1 diente:\n-----Cantidad: " + etCantProRem1.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem1.getText().toString()) * Float.parseFloat(etCantProRem1.getText().toString())) + "\n";


        } else {
            proRem1String = "";
        }
        if (cbProRem2.isChecked()) {
            total += (Float.parseFloat(tvProRem2.getText().toString())) * Float.parseFloat(etCantProRem2.getText().toString());
            proRem2String = "-Prót. rem. 2 dientes:\n-----Cantidad: " + etCantProRem2.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem2.getText().toString()) * Float.parseFloat(etCantProRem2.getText().toString())) + "\n";


        } else {
            proRem2String = "";
        }
        if (cbProRem3.isChecked()) {
            total += (Float.parseFloat(tvProRem3.getText().toString()) * Float.parseFloat(etCantProRem3.getText().toString()));
            proRem3String = "-Prót. rem. 3 dientes:\n-----Cantidad: " + etCantProRem3.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem3.getText().toString()) * Float.parseFloat(etCantProRem3.getText().toString())) + "\n";
        } else {
            proRem3String = "";
        }
        if (cbProRem4.isChecked()) {
            total += (Float.parseFloat(tvProRem4.getText().toString())) * Float.parseFloat(etCantProRem4.getText().toString());
            proRem4String = "-Prót. rem. 2 dientes:\n-----Cantidad: " + etCantProRem4.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem4.getText().toString()) * Float.parseFloat(etCantProRem4.getText().toString())) + "\n";
        }else {
            proRem4String = "";
        }
        if (cbProRem5.isChecked()) {
            total += (Float.parseFloat(tvProRem5.getText().toString()) * Float.parseFloat(etCantProRem5.getText().toString()));
            proRem5String = "-Prót. rem. 5 dientes:\n-----Cantidad: " + etCantProRem5.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem5.getText().toString()) * Float.parseFloat(etCantProRem5.getText().toString())) + "\n";
        }else {
            proRem5String = "";
        }
        if (cbProRem6.isChecked()) {
            total += (Float.parseFloat(tvProRem6.getText().toString())) * Float.parseFloat(etCantProRem6.getText().toString());
            proRem6String = "-Prót. rem. 6 dientes:\n-----Cantidad: " + etCantProRem6.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem6.getText().toString()) * Float.parseFloat(etCantProRem6.getText().toString())) + "\n";
        }else {
            proRem6String = "";
        }
        if (cbProRem7.isChecked()) {
            total += (Float.parseFloat(tvProRem7.getText().toString()) * Float.parseFloat(etCantProRem7.getText().toString()));
            proRem7String = "-Prót. rem. 7 dientes:\n-----Cantidad: " + etCantProRem7.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem7.getText().toString()) * Float.parseFloat(etCantProRem7.getText().toString())) + "\n";
        }else {
            proRem7String = "";
        }
        if (cbProRem8.isChecked()) {
            total += (Float.parseFloat(tvProRem8.getText().toString())) * Float.parseFloat(etCantProRem8.getText().toString());
            proRem8String = "-Prót. rem. 8 dientes:\n-----Cantidad: " + etCantProRem8.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem8.getText().toString()) * Float.parseFloat(etCantProRem8.getText().toString())) + "\n";
        }else {
            proRem8String = "";
        }
        if (cbProRem9.isChecked()) {
            total += (Float.parseFloat(tvProRem9.getText().toString()) * Float.parseFloat(etCantProRem9.getText().toString()));
            proRem9String = "-Prót. rem. 9 dientes:\n-----Cantidad: " + etCantProRem9.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem9.getText().toString()) * Float.parseFloat(etCantProRem9.getText().toString())) + "\n";
        }else {
            proRem9String = "";
        }
        if (cbProRem10.isChecked()) {
            total += (Float.parseFloat(tvProRem10.getText().toString())) * Float.parseFloat(etCantProRem10.getText().toString());
            proRem10String = "-Prót. rem. 10 dientes:\n-----Cantidad: " + etCantProRem10.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem10.getText().toString()) * Float.parseFloat(etCantProRem10.getText().toString())) + "\n";
        }else {
            proRem10String = "";
        }
        if (cbProRem11.isChecked()) {
            total += (Float.parseFloat(tvProRem11.getText().toString()) * Float.parseFloat(etCantProRem11.getText().toString()));
            proRem11String = "-Prót. rem. 11 dientes:\n-----Cantidad: " + etCantProRem11.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem11.getText().toString()) * Float.parseFloat(etCantProRem11.getText().toString())) + "\n";
        }else {
            proRem11String = "";
        }
        if (cbProRem12.isChecked()) {
            total += (Float.parseFloat(tvProRem12.getText().toString())) * Float.parseFloat(etCantProRem12.getText().toString());
            proRem12String = "-Prót. rem. 12 dientes:\n-----Cantidad: " + etCantProRem12.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem12.getText().toString()) * Float.parseFloat(etCantProRem12.getText().toString())) + "\n";
        }else {
            proRem12String = "";
        }
        if (cbProRem13.isChecked()) {
            total += (Float.parseFloat(tvProRem13.getText().toString()) * Float.parseFloat(etCantProRem13.getText().toString()));
            proRem13String = "-Prót. rem. 13 dientes:\n-----Cantidad: " + etCantProRem13.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem13.getText().toString()) * Float.parseFloat(etCantProRem13.getText().toString())) + "\n";
        }else {
            proRem13String = "";
        }
        if(cbProRem14.isChecked()){
            total += (Float.parseFloat(tvProRem14.getText().toString())) * Float.parseFloat(etCantProRem14.getText().toString());
            proRem14String = "-Prót. rem. 14 dientes:\n-----Cantidad: " + etCantProRem14.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProRem14.getText().toString()) * Float.parseFloat(etCantProRem14.getText().toString())) + "\n";
        }else {
            proRem14String = "";
        }
        if(cbProFijCorCol.isChecked()){
            total += (Float.parseFloat(tvProFijCorCol.getText().toString())) * Float.parseFloat(etCantProFijCorCol.getText().toString());
            proFijCorColString = "-Corona colada:\n-----Cantidad: " + etCantProFijCorCol.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProFijCorCol.getText().toString()) * Float.parseFloat(etCantProFijCorCol.getText().toString())) + "\n";
        }else {
            proFijCorColString = "";
        }
        if(cbProFijCorEnBiol.isChecked()){
            total += (Float.parseFloat(tvProFijCorEnBiol.getText().toString())) * Float.parseFloat(etCantProFijCorEnBiol.getText().toString());
            proFijCorEnBiolString = "-Corona en Biolon:\n-----Cantidad: " + etCantProFijCorEnBiol.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProFijCorEnBiol.getText().toString()) * Float.parseFloat(etCantProFijCorEnBiol.getText().toString())) + "\n";
        }else {
            proFijCorEnBiolString = "";
        }
        if(cbProFijPerMun.isChecked()){
            total += (Float.parseFloat(tvProFijPerMun.getText().toString())) * Float.parseFloat(etCantProFijPerMun.getText().toString());
            proFijPerMunString = "-Perno muñón:\n-----Cantidad: " + etCantProFijPerMun.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProFijPerMun.getText().toString()) * Float.parseFloat(etCantProFijPerMun.getText().toString())) + "\n";
        }else {
            proFijPerMunString = "";
        }
        if(cbProFijZirc.isChecked()){
            total += (Float.parseFloat(tvProFijZirc.getText().toString())) * Float.parseFloat(etCantProFijZirc.getText().toString());
            proFijZircString = "-Zirconio:\n-----Cantidad: " + etCantProFijZirc.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProFijZirc.getText().toString()) * Float.parseFloat(etCantProFijZirc.getText().toString())) + "\n";
        }else {
            proFijZircString = "";
        }
        if(cbProFijPMA.isChecked()){
            total += (Float.parseFloat(tvProFijPMA.getText().toString())) * Float.parseFloat(etCantProFijPMA.getText().toString());
            proFijPMAString = "-PMA:\n-----Cantidad: " + etCantProFijPMA.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProFijPMA.getText().toString()) * Float.parseFloat(etCantProFijPMA.getText().toString())) + "\n";
        }else {
            proFijPMAString = "";
        }
        if(cbProFijCeram.isChecked()){
            total += (Float.parseFloat(tvProFijCeram.getText().toString())) * Float.parseFloat(etCantProFijCeram.getText().toString());
            proFijCeramString = "-Cerámica:\n-----Cantidad: " + etCantProFijCeram.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvProFijCeram.getText().toString()) * Float.parseFloat(etCantProFijCeram.getText().toString())) + "\n";
        }else {
            proFijCeramString = "";
        }
        if(cbRepYVarPalYEnc.isChecked()){
            total += (Float.parseFloat(tvRepYVarPalYEnc.getText().toString())) * Float.parseFloat(etCantRepYVarPalYEnc.getText().toString());
            repYVarPalYEncString = "-Reparación paladar/encía:\n-----Cantidad: " + etCantRepYVarPalYEnc.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvRepYVarPalYEnc.getText().toString()) * Float.parseFloat(etCantRepYVarPalYEnc.getText().toString())) + "\n";
        }else {
            repYVarPalYEncString = "";
        }
        if(cbRepYVarAgr1Elem.isChecked()){
            total += (Float.parseFloat(tvRepYVarAgr1Elem.getText().toString())) * Float.parseFloat(etCantRepYVarAgr1Elem.getText().toString());
            repYVarAgr1ElemString = "-Reparación/agregado de elemento:\n-----Cantidad: " + etCantRepYVarAgr1Elem.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvRepYVarAgr1Elem.getText().toString()) * Float.parseFloat(etCantRepYVarAgr1Elem.getText().toString())) + "\n";
        }else {
            repYVarAgr1ElemString = "";
        }
        if(cbRepYVarSubCadUn.isChecked()){
            total += (Float.parseFloat(tvRepYVarSubCadUn.getText().toString())) * Float.parseFloat(etCantRepYVarSubCadUn.getText().toString());
            repYVarSubCadUnString = "-Subsiguiente:\n-----Cantidad: " + etCantRepYVarSubCadUn.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvRepYVarSubCadUn.getText().toString()) * Float.parseFloat(etCantRepYVarSubCadUn.getText().toString())) + "\n";
        }else {
            repYVarSubCadUnString = "";
        }
        if(cbRepYVarRebEnPro.isChecked()){
            total += (Float.parseFloat(tvRepYVarRebEnPro.getText().toString())) * Float.parseFloat(etCantRepYVarRebEnPro.getText().toString());
            repYVarRebEnProString = "-Rebasado en prótesis:\n-----Cantidad: " + etCantRepYVarRebEnPro.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvRepYVarRebEnPro.getText().toString()) * Float.parseFloat(etCantRepYVarRebEnPro.getText().toString())) + "\n";
        }else {
            repYVarRebEnProString = "";
        }
        if(cbRepYVarCubInd.isChecked()){
            total += (Float.parseFloat(tvRepYVarCubInd.getText().toString())) * Float.parseFloat(etCantRepYVarCubInd.getText().toString());
            repYVarCubIndString = "-Cubeta individual:\n-----Cantidad: " + etCantRepYVarCubInd.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvRepYVarCubInd.getText().toString()) * Float.parseFloat(etCantRepYVarCubInd.getText().toString())) + "\n";
        }else {
            repYVarCubIndString = "";
        }
        if(cbRepYVarPlacVacPre.isChecked()){
            total += (Float.parseFloat(tvRepYVarPlacVacPre.getText().toString())) * Float.parseFloat(etCantRepYVarPlacVacPre.getText().toString());
            repYVarPlacVacPreString = "-Placa vacu-press:\n-----Cantidad: " + etCantRepYVarPlacVacPre.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvRepYVarPlacVacPre.getText().toString()) * Float.parseFloat(etCantRepYVarPlacVacPre.getText().toString())) + "\n";
        }else {
            repYVarPlacVacPreString = "";
        }
        if(cbRepYVarArmCroCob.isChecked()){
            total += (Float.parseFloat(tvRepYVarArmCroCob.getText().toString())) * Float.parseFloat(etCantRepYVarArmCroCob.getText().toString());
            repYVarArmCroCobString = "-Armazón Cr Co:\n-----Cantidad: " + etCantRepYVarArmCroCob.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvRepYVarArmCroCob.getText().toString()) * Float.parseFloat(etCantRepYVarArmCroCob.getText().toString())) + "\n";
        }else {
            repYVarArmCroCobString = "";
        }
        if(cbOrtSinExp.isChecked()){
            total += (Float.parseFloat(tvOrtSinExp.getText().toString())) * Float.parseFloat(etCantOrtSinExp.getText().toString());
            ortSinExpString = "-Ortodoncia sin expanción:\n-----Cantidad: " + etCantOrtSinExp.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvOrtSinExp.getText().toString()) * Float.parseFloat(etCantOrtSinExp.getText().toString())) + "\n";
        }else {
            ortSinExpString = "";
        }
        if(cbOrtConExp.isChecked()){
            total += (Float.parseFloat(tvOrtConExp.getText().toString())) * Float.parseFloat(etCantOrtConExp.getText().toString());
            ortConExpString = "-Ortodoncia con expanción:\n-----Cantidad: " + etCantOrtConExp.getText().toString() + "\n-----Precio: $ " + (Float.parseFloat(tvOrtConExp.getText().toString()) * Float.parseFloat(etCantOrtConExp.getText().toString())) + "\n";
        }else {
            ortConExpString = "";
        }

        total-=valorAnticipo;
        total=(float)Math.round(total*100)/100;
        tvCalcTotal=(TextView) findViewById(R.id.textViewCalcTotal);
        tvCalcTotal.setText(String.valueOf(total));

        fechaString="-Fecha: "+tvFecha.getText().toString()+"\n";
        nombreClienteString="-Cliente: "+etNombreCliente.getText().toString()+"\n";
        anticipoString="-Anticipo: $ "+etAnticipo.getText().toString()+"\n\n";
        totalString="\n-Total: $ "+tvCalcTotal.getText().toString()+"\n";
        mostrarResumen();

    }

    public void mostrarResumen(){

        Intent i = new Intent(this, Resumen.class );

        i.putExtra("resumen", (fechaString
                +nombreClienteString
                +anticipoString
                +proRem1String+proRem2String+proRem3String+proRem4String+proRem5String+proRem6String+proRem7String+
                proRem8String+proRem9String+proRem10String+proRem11String+proRem12String+proRem13String+proRem14String
                +proFijCorColString+ proFijCorEnBiolString+proFijPerMunString+proFijZircString+proFijPMAString+proFijCeramString
                + repYVarPalYEncString+ repYVarAgr1ElemString+ repYVarSubCadUnString+ repYVarRebEnProString+ repYVarCubIndString+repYVarPlacVacPreString+ repYVarArmCroCobString
                +ortSinExpString+ ortConExpString
                +totalString));

        startActivity(i);

    }
}