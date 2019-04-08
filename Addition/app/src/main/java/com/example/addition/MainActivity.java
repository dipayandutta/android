package com.example.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private EditText editText1 , editText2;
    private Button addButton;
    private Button multiplyButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton(){

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        addButton = (Button)findViewById(R.id.button);
        multiplyButton = (Button)findViewById(R.id.mulButton);

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String numberOne = editText1.getText().toString();
                String numberTwo = editText2.getText().toString();

                int firstNumber     = Integer.parseInt(numberOne);
                int secondNumber    = Integer.parseInt(numberTwo);

                int sum = firstNumber + secondNumber;
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();


            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String numberOne = editText1.getText().toString();
                String numberTwo = editText2.getText().toString();

                int firstNumber     = Integer.parseInt(numberOne);
                int secondNumber    = Integer.parseInt(numberTwo);

                int multiplication  = firstNumber*secondNumber;
                Toast.makeText(getApplicationContext(),String.valueOf(multiplication),Toast.LENGTH_LONG).show();
            }
        });
    }
}
