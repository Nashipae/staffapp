package com.staff.staffapp;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class MarketingActivity extends AppCompatActivity {
    PDFView marketing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);

        marketing = (PDFView) findViewById(R.id.pdfMarketing);

        marketing.fromAsset("marketing.pdf").load();


    }

}
