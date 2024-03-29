package com.blaj;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
    }

    public void enteringName(View view) {
        EditText editText = findViewById(R.id.enterName);

        editText.setHint(R.string.name_placeholder);

        TextView textView = findViewById(R.id.textView);

        textView.setVisibility(View.INVISIBLE);
    }

    public void buttonClicked(View view) {
        EditText editText = findViewById(R.id.enterName);

        TextView textView = findViewById(R.id.textView);

        if (!editText.getText().toString().isEmpty()) {
            textView.setText(String.format("Ești cool, %s =)", editText.getText().toString()));

            textView.setVisibility(View.VISIBLE);
        }
        editText.clearFocus();

        editText.setText("");
    }
}