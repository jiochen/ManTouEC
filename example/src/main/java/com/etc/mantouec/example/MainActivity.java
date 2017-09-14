package com.etc.mantouec.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.etc.mt_core.app.MT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MT.getApplication().getApplicationContext(), "Arsenal", Toast.LENGTH_LONG).show();
    }
}
