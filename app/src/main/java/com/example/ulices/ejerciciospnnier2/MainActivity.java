package com.example.ulices.ejerciciospnnier2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
String[] animales={"pato","conejo","oveja"};
    ImageAdapter adapterGrilla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapterGrilla = new ImageAdapter(this);
        Spinner spinner=(Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(adapterGrilla);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        Toast dato1= Toast.makeText(getApplicationContext(),animales[position],Toast.LENGTH_SHORT);
                                dato1.show();
                        break;
                    case 2:
                        Toast dato2= Toast.makeText(getApplicationContext(),animales[position],Toast.LENGTH_SHORT);
                        dato2.show();
                        break;
                    case 3:
                        Toast dato3= Toast.makeText(getApplicationContext(),animales[position],Toast.LENGTH_SHORT);
                        dato3.show();
                        break;
                    default:
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
