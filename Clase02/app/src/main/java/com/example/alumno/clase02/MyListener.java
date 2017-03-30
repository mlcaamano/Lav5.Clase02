package com.example.alumno.clase02;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    IMostrarInfo a;

    public MyListener(IMostrarInfo a){
        this.a= a;
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.id_boton1)
        {
            Log.d("CLICK", "CLICK BOTON 1");
            a.mostrarInfo();
        }
        else if(v.getId()==R.id.id_boton2)
        {
            Log.d("CLICK", "CLICK BOTON 2");
        }
        else if(v.getId()==R.id.id_boton3)
        {
            Log.d("CLICK", "CLICK BOTON 3");
        }

    }
}
