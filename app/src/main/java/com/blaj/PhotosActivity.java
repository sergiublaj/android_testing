package com.blaj;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PhotosActivity extends AppCompatActivity {
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);

        this.setUpGrid();
    }

    private void setUpGrid() {
        GridView gridView = findViewById(R.id.gridy);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            if (null != mToast) {
                mToast.cancel();
            }
            mToast = Toast.makeText(PhotosActivity.this, "Clicked photo " + (position + 1), Toast.LENGTH_SHORT);
            mToast.setDuration(Toast.LENGTH_SHORT);
            mToast.show();
        });
    }
}