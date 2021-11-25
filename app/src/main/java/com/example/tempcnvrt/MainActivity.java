package com.example.tempcnvrt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView editTextNumber;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editTextNumber=findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                ;

                String s= editTextNumber.getText().toString();
                double Celsius =Integer.parseInt(s);
                double Fahrenheight= 1.8*Celsius + 32;
                textView.setText("the corresponding value in fahrenheit is " + Fahrenheight);
            }
        });






    }
}