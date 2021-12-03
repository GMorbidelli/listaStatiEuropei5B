package com.example.lisstastatieuropei5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lwStati;
    String listastati[] ={"Italia,", "Francia", "Germania", "Spagan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lwStati = (ListView) findViewById(R.id.listaStati);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView, listastati);
        lwStati.setAdapter(aa);



    }
}