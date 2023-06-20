package com.khandokeranan.android1011;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {
    String[] courses = { "Operating System", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        getSupportActionBar().hide();

        Spinner spino = findViewById(R.id.coursesspinner);
        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                R.layout.spinner_item,
                courses);
        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);
        spino.setAdapter(ad);


        Button nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(SpinnerActivity.this, MainActivity.class);
                startActivity(next);
            }
        });

        Button showBtn = findViewById(R.id.showBtn);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(SpinnerActivity.this);
                LayoutInflater inflater = LayoutInflater.from(SpinnerActivity.this);
                View view = inflater.inflate(R.layout.custom_alert_dialog, null);
                TextView TitleText = view.findViewById(R.id.titleTextView);
                TitleText.setText("Spinner Code");
                TextView messageTextView = view.findViewById(R.id.messageTextView);
                messageTextView.setText("<Spinner\n" +
                        "   android:id=\"@+id/coursesspinner\"\n" +
                        "    android:layout_height=\"50dp\"\n" +
                        "   android:background=\"#f5f5f5\"\n" +
                        "   android:layout_width=\"200dp\" />");

                builder.setView(view);

                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });
    }
}