package com.alfredobejarano.bezirkpubexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alfredobejarano.bezirkpubexample.R;
import com.alfredobejarano.bezirkpubexample.events.SimulateKeyEvent;
import com.alfredobejarano.bezirkpubexample.factory.KeyViewIdFactory;
import com.alfredobejarano.bezirkpubexample.utils.ProjectUtils;
import com.bezirk.middleware.Bezirk;

public class MainActivity extends AppCompatActivity {

    private Bezirk bezirk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bezirk = new ProjectUtils().InitializeBezirk(this);
    }

    public void buttonPressed(View v) {
        int key = new KeyViewIdFactory().getKeyViewId(v.getId());
        bezirk.sendEvent(new SimulateKeyEvent(key));
        Log.d("KEY PRESSED", "Key with code: " + String.valueOf(key) + " pressed!");
    }
}
