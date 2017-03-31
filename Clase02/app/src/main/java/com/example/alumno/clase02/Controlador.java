package com.example.alumno.clase02;

import android.view.View;

/**
 * Created by alumno on 30/03/2017.
 */

public class Controlador {

    MyListener miListener;

    public Controlador(MyListener m){

        this.miListener=m;
    }

    public MyListener getMiListener(){
        return miListener;
    }
}
