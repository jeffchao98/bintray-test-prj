package com.scaine.testsdkpush;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.scaine.testframework.DataModel;
import com.scaine.testframework.MainPart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainPart mainPart = new MainPart();
        DataModel data = mainPart.getParserData();
        String name = data.strName;
        String version = mainPart.getVersion();

        Log.i("test-out", name);
        Log.i("test-out-version", version);
    }
}
