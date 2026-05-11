package com.example.scanapp;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewActivity extends AppCompatActivity {

    public static final String EXTRA_IMAGE_URI = "image_uri";

    private ImageView capturedImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        capturedImageView = findViewById(R.id.capturedImageView);

        String imageUriString = getIntent().getStringExtra(EXTRA_IMAGE_URI);

        if(imageUriString != null) {
            Uri imageUri = Uri.parse(imageUriString);
            capturedImageView.setImageURI(imageUri);
        }
    }
}