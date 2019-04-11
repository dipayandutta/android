package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza , coffe , burger;
    Button orderButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){

        pizza = (CheckBox)findViewById(R.id.checkBox);
        coffe = (CheckBox)findViewById(R.id.checkBox2);
        burger= (CheckBox)findViewById(R.id.checkBox3);
        orderButton = (Button)findViewById(R.id.button);

        orderButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View view){
                int totalAmount = 100;
                StringBuilder result = new StringBuilder();
                result.append("Slected Items");

                if(pizza.isChecked()){
                    result.append("Pizza Rs.100");
                    totalAmount += 100;
                }
                if (coffe.isChecked()){
                    result.append("Coffee 50Rs");
                    totalAmount += 50;
                }
                if (burger.isChecked()){
                    result.append("Burger 2000");
                    totalAmount += 2000;
                }
                else{
                    result.append("Nothing is Selected");
                }

                result.append("Total "+totalAmount+"Rs ");
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
