package com.example.shivamBILL;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class cnc_Bill extends AppCompatActivity {

    public TextView mDisplayDate;
    public DatePickerDialog.OnDateSetListener onDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnc__bill);

        //Date Dialog
        mDisplayDate = (TextView) findViewById(R.id.Date);
        DateDialog();
    }
    //For Opening Date Dialog Box
    public void DateDialog()
    {
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);

            }
        });
    }
}