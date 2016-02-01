package com.example.berraco.cap3ciclodevida;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
//
//        EN funcion de un layout padre, se crea una accion para accedes a otro layout activity 2
        RelativeLayout relative=(RelativeLayout) findViewById(R.id.RelativePadre1);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Actividad2.class);
                startActivity(intent);
            }
        });
    }

//    Clases para imprimir por log
    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"Actividad 1 onStart");
    }

    @Override
    protected void onResume() { //Activo
        super.onResume();
        Log.v(TAG,"Actividad 1 onResume");
    }

    @Override
    protected void onPause() {//VISIBLE
        super.onPause();
        Log.v(TAG,"Actividad 1 onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"Actividad 1 onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
