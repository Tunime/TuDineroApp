package com.example.alvaro.tudinero;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    private EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.countries_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        et1=(EditText)findViewById(R.id.minimo);
        et2=(EditText)findViewById(R.id.tiapre);
        et3=(EditText)findViewById(R.id.tirea);
    }
    public void Miprecio(View view){
        String tiempoaprendisaje=et2.getText().toString();
        String tiemporealisacion=et3.getText().toString();

        float min = Float.valueOf(et1.getText().toString());
        int ta=Integer.parseInt(tiempoaprendisaje);
        int tr=Integer.parseInt(tiemporealisacion);

        float suma=(min*ta)+(min*tr);

        String resultado=String.valueOf(suma);

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("cobra",resultado);
        startActivity(i);

    }

}
