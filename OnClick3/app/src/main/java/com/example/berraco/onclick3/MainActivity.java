package com.example.berraco.onclick3;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn1,btn2,btn3;
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx = this;
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);

//Primera forma de onclick
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"Accion 1",Toast.LENGTH_SHORT).show();
            }
        });


        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn2){
            Toast.makeText(this,"Accion 2",Toast.LENGTH_SHORT).show();
        }
    }


    public void accion3(View v ){
            Toast.makeText(this,"Accion 3",Toast.LENGTH_SHORT).show();
    }
}
