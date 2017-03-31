package com.example.alumno.clase02;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 30/03/2017.
 */

public class Vista implements IMostrarInfo {

    private MainActivity activity;
    private Modelo miModelo;
    private Controlador miControlador;
    private Button boton1;
    private Button boton2;
    private Button boton3;


    public void setMiControlador(Controlador c){
        this.miControlador=c;
        boton1.setOnClickListener(miControlador.getMiListener());
        boton2.setOnClickListener(miControlador.getMiListener());
        boton3.setOnClickListener(miControlador.getMiListener());
    }

    public Vista(MainActivity a, Modelo m){
        this.activity=a;
        this.miModelo=m;

        TextView view = (TextView) activity.findViewById(R.id.saludar);
        //view.setText("Chau"); Una manera
        //view.setText(R.string.despedir); // O trayendo el texto desde el string.xml

        boton1 = (Button) activity.findViewById(R.id.id_boton1);
        boton2 = (Button) activity.findViewById(R.id.id_boton2);
        boton3 = (Button) activity.findViewById(R.id.id_boton3);
    }

    @Override
    public void mostrarInfo(){
        TextView tv= (TextView) activity.findViewById(R.id.saludar);
        tv.setText(miModelo.getCambiarInfo());
    }


}
