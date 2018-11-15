package com.exercicis.mabel.log_toastprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bStart;
    private Button bRestart;
    private Button bResume;
    private Button bPause;
    private Button bStop;
    private Button bDestroy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bStart = findViewById(R.id.bStart);
        bRestart = findViewById(R.id.bRestart);
        bResume = findViewById(R.id.bResume);
        bPause = findViewById(R.id.bPause);
        bStop = findViewById(R.id.bStop);
        bDestroy = findViewById(R.id.bDestroy);

        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStart();
            }
        });

        bRestart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRestart();
            }
        });

        bResume.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onResume();
            }
        });

        bPause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onPause();
            }
        });

        bStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onStop();
            }
        });

        bDestroy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onDestroy();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart","Start");
        Toast toastStart = Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_SHORT);
        toastStart.setGravity(Gravity.CENTER,0,0);
        toastStart.show();
    }

    public void onRestart() {
        super.onRestart();
        Log.i("onRestart","Restart");
        Toast toastRestart = Toast.makeText(getApplicationContext(),"Restart",Toast.LENGTH_SHORT);
        toastRestart.setGravity(Gravity.CENTER,0,0);
        toastRestart.show();
    }

    public void onResume() {
        super.onResume();
        Log.i("onResume","Resume");
        Toast toastResume = Toast.makeText(getApplicationContext(),"Resume",Toast.LENGTH_SHORT);
        toastResume.setGravity(Gravity.CENTER,0,0);
        toastResume.show();
    }

    public void onPause() {
        super.onPause();
        Log.i("onPause","Pause");
        Toast toastPause = Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_SHORT);
        toastPause.setGravity(Gravity.CENTER,0,0);
        toastPause.show();
    }

    public void onStop() {
        super.onStop();
        Log.i("onStop","Stop");
        Toast toastStop = Toast.makeText(getApplicationContext(),"Stop",Toast.LENGTH_SHORT);
        toastStop.setGravity(Gravity.CENTER,0,0);
        toastStop.show();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy","Destroy");
        Toast toastDestroy = Toast.makeText(getApplicationContext(),"Destroy",Toast.LENGTH_SHORT);
        toastDestroy.setGravity(Gravity.CENTER,0,0);
        toastDestroy.show();
    }

}
