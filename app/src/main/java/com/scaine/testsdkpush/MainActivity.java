package com.scaine.testsdkpush;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.scaine.testframework.MainPart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainPart mainPart = new MainPart();

        Log.i("test out", mainPart.getName());
    }
}
