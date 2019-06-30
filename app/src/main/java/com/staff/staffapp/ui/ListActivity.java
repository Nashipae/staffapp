package com.staff.staffapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import com.github.abdularis.civ.AvatarImageView;
import com.google.android.material.tabs.TabLayout;
import com.staff.staffapp.R;
import com.staff.staffapp.adapter.MChatTabsAccessorAdapter;
//import com.staff.staffapp.databinding.ActivityListBinding;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {


    private Toolbar mToolbar;
    private ViewPager myViewPager;
    private TabLayout myTabLayout;
    private MChatTabsAccessorAdapter myTabsAccessorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //chat_page_toolbar

        mToolbar = (Toolbar) findViewById(R.id.chat_main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Chat");

        //chat_tabs_pager
        myViewPager = (ViewPager) findViewById(R.id.chat_main_tabs_pager);
        myTabsAccessorAdapter = new MChatTabsAccessorAdapter(getSupportFragmentManager());

        myViewPager.setAdapter(myTabsAccessorAdapter);

        //chat_main_tabs
        myTabLayout = (TabLayout) findViewById(R.id.chat_main_tabs);
        myTabLayout.setupWithViewPager(myViewPager);

    }

}