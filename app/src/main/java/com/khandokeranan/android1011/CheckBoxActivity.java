package com.khandokeranan.android1011;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_activity);
        getSupportActionBar().hide();

        Button nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(CheckBoxActivity.this, RadioGroupActivity.class);
                startActivity(next);
            }
        });

        Button showBtn = findViewById(R.id.showBtn);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(CheckBoxActivity.this);
                LayoutInflater inflater = LayoutInflater.from(CheckBoxActivity.this);
                View view = inflater.inflate(R.layout.custom_alert_dialog, null);
                TextView TitleText = view.findViewById(R.id.titleTextView);
                TitleText.setText("CheckBox Code");
                TextView messageTextView = view.findViewById(R.id.messageTextView);
                messageTextView.setText("<CheckBox\n" +
                        "   android:layout_width=\"wrap_content\"\n" +
                        "   android:layout_height=\"wrap_content\"\n" +
                        "   android:text=\"Black\" />");

                builder.setView(view);

                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });
    }


}