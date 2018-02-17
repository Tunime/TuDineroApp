package com.example.alvaro.tudinero;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends Activity {

    private TextView presio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String valor = getIntent().getExtras().getString("cobra");
        presio=(TextView)findViewById(R.id.precio);
        presio.setText(valor);
    }
}
