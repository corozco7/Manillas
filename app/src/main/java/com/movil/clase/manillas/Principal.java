package com.movil.clase.manillas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private EditText n1;
    private TextView res;
    private Resources recursos;
    private Spinner material, dije, tipo, moneda;
    private String ma[], di[], ti[], mo[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        n1 = findViewById(R.id.txtCantidad);
        res = findViewById(R.id.txtResultado);
        material = findViewById(R.id.cmbMaterial);
        dije = findViewById(R.id.cmbDije);
        tipo = findViewById(R.id.cmbTipo);
        moneda = findViewById(R.id.cmbMoneda);

        recursos = this.getResources();
        ma = recursos.getStringArray(R.array.materiales);
        di = recursos.getStringArray(R.array.dijes);
        ti = recursos.getStringArray(R.array.tipos);
        mo = recursos.getStringArray(R.array.monedas);
        ArrayAdapter<String> adapterMateriales = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,ma);
        material.setAdapter(adapterMateriales);
        ArrayAdapter<String> adapterDijes = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,di);
        dije.setAdapter(adapterDijes);
        ArrayAdapter<String> adapterTipos = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,ti);
        tipo.setAdapter(adapterTipos);
        ArrayAdapter<String> adapterMonedas = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,mo);
        moneda.setAdapter(adapterMonedas);
    }

    public boolean validar(){
        int com = Integer.parseInt(n1.getText().toString());
        if (n1.getText().toString().isEmpty()){
            n1.setError(recursos.getString(R.string.error_uno));
            return false;
        }
        if (com <= 0){
            n1.setError(recursos.getString(R.string.error_dos));
            return false;
        }
        return true;
    }

    public void calcular(View v){
        int opcionMaterial, opcionDije, opcionTipo, opcionMoneda, cantidad, resultado = 0;
        if (validar()){
            opcionMaterial = material.getSelectedItemPosition();
            opcionDije = dije.getSelectedItemPosition();
            opcionTipo = tipo.getSelectedItemPosition();
            opcionMoneda = moneda.getSelectedItemPosition();
            cantidad = Integer.parseInt(n1.getText().toString());
            switch (opcionMaterial){
                case 0:
                    switch (opcionDije){
                        case 0:
                            switch (opcionTipo){
                                case 0:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,100);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,100);
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,100);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,100);
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,80);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,80);
                                            break;
                                    }
                                    break;
                                case 3:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,70);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,70);
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 1:
                            switch (opcionTipo){
                                case 0:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,120);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,120);
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,120);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,120);
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,100);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,100);
                                            break;
                                    }
                                    break;
                                case 3:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,90);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,90);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 1:
                    switch (opcionDije){
                        case 0:
                            switch (opcionTipo){
                                case 0:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,90);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,90);
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,90);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,90);
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,70);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,70);
                                            break;
                                    }
                                    break;
                                case 3:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,50);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,50);
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 1:
                            switch (opcionTipo){
                                case 0:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,110);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,110);
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,110);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,110);
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,90);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,90);
                                            break;
                                    }
                                    break;
                                case 3:
                                    switch (opcionMoneda){
                                        case 0:
                                            resultado = Metodos.precioPeso(cantidad,80);
                                            break;
                                        case 1:
                                            resultado = Metodos.precioDolar(cantidad,80);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
            res.setText(String.format(""+resultado));
        }
    }

    public void limpiar (View v){
        n1.setText("");
        material.setSelection(0);
        dije.setSelection(0);
        tipo.setSelection(0);
        moneda.setSelection(0);
        n1.requestFocus();
    }

}
