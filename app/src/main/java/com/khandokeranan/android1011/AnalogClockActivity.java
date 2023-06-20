package com.khandokeranan.android1011;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AnalogClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_analog_clock);
        Button nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(AnalogClockActivity.this, CheckBoxActivity.class);
                startActivity(next);
            }
        });

        Button showBtn = findViewById(R.id.showBtn);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                AlertDialog.Builder builder = new AlertDialog.Builder(AnalogClockActivity.this);
                LayoutInflater inflater = LayoutInflater.from(AnalogClockActivity.this);
                View view = inflater.inflate(R.layout.custom_alert_dialog, null);
                TextView TitleText = view.findViewById(R.id.titleTextView);
                TitleText.setText("Clock Widget Code");
                TextView messageTextView = view.findViewById(R.id.messageTextView);
                messageTextView.setText("<AnalogClock\n" +
                        "   android:layout_width=\"80dp\"\n" +
                        "   android:layout_height=\"80dp\"\n" +
                        "   android:layout_margin=\"20dp\"\n" +
                        "   android:background=\"#fff\"\n" +
                        "   android:timeZone=\"dhaka\" />\n\n" +
                        "<DigitalClock\n" +
                        "   android:layout_width=\"wrap_content\"\n" +
                        "   android:layout_height=\"80dp\"\n" +
                        "   android:layout_margin=\"20dp\">\n" );

                builder.setView(view);

                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });
    }



}