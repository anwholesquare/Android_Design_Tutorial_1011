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

public class RadioGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        getSupportActionBar().hide();

        Button nextBtn = findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(RadioGroupActivity.this, TimePickerActivity.class);
                startActivity(next);
            }
        });

        Button showBtn = findViewById(R.id.showBtn);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(RadioGroupActivity.this);
                LayoutInflater inflater = LayoutInflater.from(RadioGroupActivity.this);
                View view = inflater.inflate(R.layout.custom_alert_dialog, null);
                TextView TitleText = view.findViewById(R.id.titleTextView);
                TitleText.setText("RadioGroup Code");
                TextView messageTextView = view.findViewById(R.id.messageTextView);
                messageTextView.setText("<RadioGroup>\n" +
                        "   android:layout_width=\"match_parent\"\n" +
                        "   android:layout_height=\"wrap_content\"\n" +
                        "   android:orientation=\"vertical\">\n\n" +
                        "       <RadioButton\n" +
                        "           android:id=\"@+id/burger\"\n" +
                        "           android:text=\"Burger\"\n\n" +
                        "       <RadioButton\n" +
                        "           android:id=\"@+id/pizza\"\n" +
                        "           android:text=\"Pizza\">\n\n" +
                        "<RadioGroup>\n");

                builder.setView(view);

                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.white:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.black:
                if (checked)
                    // Ninjas rule
                    break;


            case R.id.red:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.blue:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}