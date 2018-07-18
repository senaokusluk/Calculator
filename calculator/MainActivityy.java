package com.example.melek.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityy extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityy);
         editText1= (EditText)findViewById(R.id.editText1);
         editText2= (EditText)findViewById(R.id.editText2);
         result= (TextView) findViewById(R.id.resultText);

    }


    public void sum(View view)
    {
      int a= Integer.parseInt(editText1.getText().toString());
      int b=Integer.parseInt(editText2.getText().toString());
      int resultint= a+b ;
      result.setText("Result:"+ resultint);
    }
    public void deduct(View view)
    {
        int a= Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());
        int resultint1= a-b ;
        result.setText("Result:"+ resultint1);
    }

    public void multiply(View view)
    {
        int a= Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());
        int resultint2= a*b ;
        result.setText("Result:"+ resultint2);
    }
    public void divide(View view)
    {
        int a= Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());
        int resultint3= a/b ;
        result.setText("Result:"+ resultint3);
    }


}
