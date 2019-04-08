package com.example.customtoastapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayOutInflaterInstance

        LayoutInflater layoutInflaterInstance = getLayoutInflater();
        //Getting the view object as defined in the customtoast.xml
        View layout = layoutInflaterInstance.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast Object
        Toast toast = new Toast(getApplicationContext()) ;
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();
    }
}
