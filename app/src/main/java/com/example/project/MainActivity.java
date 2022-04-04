package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtIncome,txtExpenses,txtBalance,txtDetails;
    Button btnEntry,btnReport;
    MyDatabase MyDatabase;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIncome=findViewById(R.id.txtIncome);
        txtExpenses=findViewById(R.id.txtExpenses);
        txtBalance=findViewById(R.id.txtBalance);
        txtDetails=findViewById(R.id.txtDetails);
        btnEntry=findViewById(R.id.btnEntry);
        btnReport=findViewById(R.id.btnReport);
        myDatabase=new myDatabase(this);


        btnEntry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(mainActivity.this,DataEntry.class);
                startActicity(intent);
            }
        });

        btnReport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(mainActivity.this,DataWiseReport.class);
                startActicity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}