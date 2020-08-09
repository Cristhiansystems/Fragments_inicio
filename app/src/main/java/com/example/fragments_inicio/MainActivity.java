package com.example.fragments_inicio;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements  fragment_rojo.OnFragmentInteractionListener,
        fragment_verde.OnFragmentInteractionListener,fragment_azul.OnFragmentInteractionListener{

    fragment_rojo Fragment_rojo;
    fragment_verde Fragment_verde;
    fragment_azul Fragment_azul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment_azul=new fragment_azul();
        Fragment_rojo=new fragment_rojo();
        Fragment_verde=new fragment_verde();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments,Fragment_rojo).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onClick(View view){

        FragmentTransaction Transaction=getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case    R.id.btn1:
                Transaction.replace(R.id.contenedorFragments,Fragment_rojo);
                break;
            case R.id.btn2:
                Transaction.replace(R.id.contenedorFragments,Fragment_verde);
                break;
            case R.id.btn3:
                Transaction.replace(R.id.contenedorFragments,Fragment_azul);
                break;

        }

        Transaction.commit();
    }
}
