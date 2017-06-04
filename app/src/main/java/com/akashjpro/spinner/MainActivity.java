package com.akashjpro.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spMonHoc;
    ArrayList<String> mangMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spMonHoc = (Spinner) findViewById(R.id.spinnerMonHoc);
        mangMonHoc = new ArrayList<String>();

        mangMonHoc.add("Android");
        mangMonHoc.add("Ios");
        mangMonHoc.add("Php");
        mangMonHoc.add("Swif");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, mangMonHoc);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spMonHoc.setAdapter(adapter);

        spMonHoc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, mangMonHoc.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //ham nay khong tac dung
            }
        });
    }
}
