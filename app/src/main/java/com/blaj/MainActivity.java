package com.blaj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNutella(View view) {
        Intent nutellaIntent = new Intent(this.getApplicationContext(), NutellaActivity.class);

        this.startActivity(nutellaIntent);
    }

    public void openName(View view) {
        Intent nameIntent = new Intent(this.getApplicationContext(), NameActivity.class);

        this.startActivity(nameIntent);
    }

    public void openSquares(View view) {
        Intent squaresIntent = new Intent(this.getApplicationContext(), SquareActivity.class);

        this.startActivity(squaresIntent);
    }

    public void openPhotos(View view) {
        Intent photosIntent = new Intent(this.getApplicationContext(), PhotosActivity.class);

        this.startActivity(photosIntent);
    }
}