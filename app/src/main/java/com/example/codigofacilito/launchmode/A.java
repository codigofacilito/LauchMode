package com.example.codigofacilito.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class A extends AppCompatActivity implements View.OnClickListener {
    private StringBuilder textMethod;
    private TextView txtLaunch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        textMethod = new StringBuilder();
        //Video Componentes basicos Texview
        txtLaunch = (TextView) findViewById(R.id.txtLaunch);
        //Video Componentes basicos Button
        findViewById(R.id.btnA).setOnClickListener(this);
        findViewById(R.id.btnB).setOnClickListener(this);
        findViewById(R.id.btnC).setOnClickListener(this);
        findViewById(R.id.btnD).setOnClickListener(this);
        printMethod("onCreate");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        printMethod("onNewIntent");
    }
    //Ciclo de vida de un activity
    @Override
    protected void onPause() {
        super.onPause();
        printMethod("onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        printMethod("onResume");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        printMethod("onDestroy");
    }
    //Video Componentes basicos button
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnA:
                openActivity(A.class);
                break;
            case R.id.btnB:
                openActivity(B.class);
                break;
            case R.id.btnC:
                openActivity(C.class);
                break;
            case R.id.btnD:
                openActivity(D.class);
                break;
        }
    }

    //Video Activity
    public void openActivity(Class c){
        startActivity(new Intent(getApplicationContext(),c));
    }

    private void printMethod(String method) {
        textMethod.append(method).append("\n");
        //Video Texview
        txtLaunch.setText(textMethod.toString());
    }
}
