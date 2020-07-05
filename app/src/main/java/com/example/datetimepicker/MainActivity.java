package com.example.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
  Button date;
  Button time;
  EditText edtime;
  EditText eddate;
  // for datepicker we have 3 parameters so define them
    private  int mday,mMonth,myear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         date=findViewById(R.id.date);
         time=findViewById(R.id.time);
         edtime=findViewById(R.id.editText2Time);
         eddate=findViewById(R.id.editText1date);
         date.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (v==date)
                 {
                     //get current date
                      final Calendar calendar=Calendar.getInstance();
                      mday=calendar.get(Calendar.DAY_OF_MONTH);
                     mMonth=calendar.get(Calendar.MONTH);
                     myear=calendar.get(Calendar.YEAR);
                     DatePickerDialog datePickerDialog =new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                         @Override
                         public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                         {

                         }
                     }
                 }
             }
         });

    }

}
