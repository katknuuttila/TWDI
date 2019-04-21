package com.example.togetherwedoit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths = {"Choose location...","Odense"};


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                //Intent intent = new Intent(MainActivity.this,HomeScreen.class);
                //startActivity(intent);

                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                Intent intent = new Intent(MainActivity.this,HomeScreen.class);
                startActivity(intent);
                // Whatever you want to happen when the second item gets selected
                break;
        }
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }


}
// @Override
//            public void onItemSelected(AdapterView<?> arg0, View arg1,
//                    int arg2, long arg3) {
//                 String str = (String) arg0.getSelectedItem();
//
//                             //here print selected value...
//                 System.out.println("String is :: " + str);
//
//                             //And StartActivity here...
//
//                    Intent intent = new Intent(YourActivity.this,SecondActivity.class);
//                    startActivity(intent);