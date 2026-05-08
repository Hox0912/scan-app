package com.example.scanapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button startScanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startScanButton = findViewById(R.id.startScanButton);

        startScanButton.setOnClickListener(view -> {
            Toast.makeText(this, "Camera screen coming soon", Toast.LENGTH_SHORT).show();
        });
    }
}