package com.example.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity{

    private ToggleButton toggleButton1 , toggleButton2;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding Action listner
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){

        toggleButton1 = (ToggleButton)findViewById(R.id.toggleButton);
        toggleButton2 = (ToggleButton)findViewById(R.id.toggleButton2);
        submitButton  = (Button)findViewById(R.id.button);

        //Performing action on button click
        submitButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                StringBuilder result = new StringBuilder();
                result.append("Toggle Button1").append(toggleButton1.getText());
                result.append("Toggle Button2").append(toggleButton2.getText());

                String button1Status = (String) toggleButton1.getText();

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),button1Status.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
