package com.example.gary.serv_trans;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    ImageView logo;
    Button btn_ingresar;
    Button btn_registrar;

    //ObjectAnimator -> proporciona soporte para animar los objetos
    ObjectAnimator animatorbtn_ingresar;
    ObjectAnimator animatorbtn_registrar;


    //setear tiempo de duracion de animacion
    long animationDuration = 1000;

    //AnimatorSet Reproduce un conjunto de ObjectAnimator en un orden especificado. Las animaciones pueder todas a la vez

    AnimatorSet animatorSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_inicio);
//        getActionBar().hide(); //oculta el action bar
        getSupportActionBar().hide();

        Window w = getWindow();//oculta status bar del activity
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        btn_ingresar = findViewById(R.id.btn_ingresar);
        btn_registrar = findViewById(R.id.btn_registrar);
    }



        //void animacionlogin(){
        //  animatorbtn_ingresar = ObjectAnimator.ofFloat(btn_ingresar,"y",-100f);
        //animatorbtn_registrar = ObjectAnimator.ofFloat(btn_registrar,"y",-100f);
        //animatorbtn_ingresar.setDuration(animationDuration);
        //animatorbtn_registrar.setDuration(animationDuration);
        //AnimatorSet animatorSetY = new AnimatorSet();
        //animatorSetY.play(animatorbtn_ingresar);
        //animatorSetY.play(animatorbtn_registrar);
        //animatorSetY.start();

        //}


}

