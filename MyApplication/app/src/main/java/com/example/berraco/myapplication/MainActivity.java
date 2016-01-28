package com.example.berraco.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1, bt2, bt3;
    Context  ctx;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            ctx~this;

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(this,"Accion 1", Toast.LENGTH_SHORT).show();
            }
        });

        bt2.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt2){

            Toast.makeText(this,"Accion2",Toast.LENGTH_SHORT).show();
        }
    }



//3ra forma

    public void accion3(View v){

        Toast.makeText(this,"Accion3",Toast.LENGTH_SHORT).show();

    }


}

//\
//    private TextView tv1, tv2, tv3;
//    private EditText edit1;
//    private Button btn1;


//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tv1=(TextView)findViewById(R.id.tv1);
//        tv2=(TextView)findViewById(R.id.tv2);
//        tv3=(TextView)findViewById(R.id.tv3);
//
//        edit1=(EditText)findViewById(R.id.edit1);
//        btn1=(Button)findViewById(R.id.btn1);
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String texto= edit1.getText().toString();
//
//                tv1.setText(texto);
//                tv2.append(texto);
//                tv3.setText(texto);
//            }
//        });
//
//
//    }



