package com.example.apple.datepicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Calendar mdate;
    int day,month,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = findViewById(R.id.txtdate);
            mdate = Calendar.getInstance();
            day = mdate.get(Calendar.DAY_OF_MONTH);
            month = mdate.get(Calendar.MONTH);
            year = mdate.get(Calendar.YEAR);
            tv.setText(day + "/" + month + "/" + year);
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int day) {
                            tv.setText(day + "/" + month + "/" + year);
                        }
                    },year,month,day);
                    datePickerDialog.show();

                }
            });
        }

    }

