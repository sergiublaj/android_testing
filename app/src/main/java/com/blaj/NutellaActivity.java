package com.blaj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class NutellaActivity extends AppCompatActivity {
    private boolean isShown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutella);
    }

    public void showNutella(View view) {
        isShown = !isShown;

        SwitchCompat switchCompat = findViewById(R.id.switch1);
        ImageView imageView = findViewById(R.id.imageView);

        if (isShown) {
            switchCompat.setText(R.string.hide_nutella);
            imageView.setVisibility(View.VISIBLE);
        } else {
            switchCompat.setText(R.string.show_nutella);
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}