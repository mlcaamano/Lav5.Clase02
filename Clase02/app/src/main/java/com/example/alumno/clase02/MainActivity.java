package com.example.alumno.clase02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view = (TextView) findViewById( R.id.saludar);
        //view.setText("Chau"); Una manera
        view.setText(R.string.despedir); // O trayendo el texto desde el string.xml

        Button boton1 = (Button) findViewById(R.id.id_boton1);

        View.OnClickListener listener = new MyListener();
        boton1.setOnClickListener(listener);
    }
}


