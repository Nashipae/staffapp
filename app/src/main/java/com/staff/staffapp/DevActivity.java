package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DevActivity extends AppCompatActivity {
    PDFView dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);

        dev = (PDFView) findViewById(R.id.pdfData);

        dev.fromAsset("dev.pdf").load();
    }
}
