package com.blaj;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SquareActivity extends AppCompatActivity {
    private final List<Button> buttonList = new ArrayList<>();
    private boolean isStarted = false;
    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        this.addButtons();
    }

    private void addButtons() {
        buttonList.add(findViewById(R.id.button_1));
        buttonList.add(findViewById(R.id.button_2));
        buttonList.add(findViewById(R.id.button_3));
        buttonList.add(findViewById(R.id.button_4));
        buttonList.add(findViewById(R.id.button_5));
        buttonList.add(findViewById(R.id.button_6));
        buttonList.add(findViewById(R.id.button_7));
        buttonList.add(findViewById(R.id.button_8));
        buttonList.add(findViewById(R.id.button_9));

        this.recolorButtons();
    }

    private void recolorButtons() {
        for (Button crtButton : buttonList) {
            crtButton.setBackgroundColor(Color.BLUE);
        }
    }

    public void startGame(View view) {
        isStarted = !isStarted;

        Button startBtn = findViewById(R.id.start_btn);

        if (isStarted) {
            startBtn.setText(R.string.stop_btn);
            handler.postDelayed(editTiles, 1000);
        } else {
            startBtn.setText(R.string.start_btn);
            handler.removeCallbacks(editTiles);
            this.recolorButtons();
        }
    }

    private final Runnable editTiles = new Runnable() {
        @Override
        public void run() {
            recolorButtons();

            int randomBtn = (int)(Math.random() * 1000) % buttonList.size();

            buttonList.get(randomBtn).setBackgroundColor(Color.GREEN);

            handler.postDelayed(this, 1000);
        }
    };
}