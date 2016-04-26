package com.example.tacademy.sampledialogfragment;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.btn_single_choice);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySingleDialog f=new MySingleDialog();
                f.show(getSupportFragmentManager(),"dialog");
            }
        });
        btn=(Button)findViewById(R.id.btn_show_custom);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialongFragment f=new CustomDialongFragment();
                f.show(getSupportFragmentManager(),"custom");
            }
        });
    }
}
