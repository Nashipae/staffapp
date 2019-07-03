package com.staff.staffapp.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import com.github.abdularis.civ.AvatarImageView;
import com.google.android.material.tabs.TabLayout;
import com.staff.staffapp.R;
import com.staff.staffapp.adapter.ChatTabsAccessorAdapter;
//import com.staff.staffapp.databinding.ActivityListBinding;
import androidx.databinding.DataBindingUtil;

import com.github.abdularis.civ.AvatarImageView;
import com.staff.staffapp.R;
import com.staff.staffapp.databinding.ActivityListBinding;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {


    private Toolbar mToolbar;
    private ViewPager myViewPager;
    private TabLayout myTabLayout;
    private ChatTabsAccessorAdapter myTabsAccessorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //chat_page_toolbar

//        mToolbar = (Toolbar) findViewById(R.id.chat_main_page_toolbar);
//        setSupportActionBar(mToolbar);
//        getSupportActionBar().setTitle("Chat");

        //chat_tabs_pager
        myViewPager = (ViewPager) findViewById(R.id.chat_main_tabs_pager);
        myTabsAccessorAdapter = new ChatTabsAccessorAdapter(getSupportFragmentManager());

        myViewPager.setAdapter(myTabsAccessorAdapter);

        //chat_main_tabs
        myTabLayout = (TabLayout) findViewById(R.id.chat_main_tabs);
        myTabLayout.setupWithViewPager(myViewPager);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.main_logout_option) {
            mAuth.signOut();
            SendUserToLoginActivity():

        }

        if (item.getItemId() == R.id.main_settings_option) {

        }

        if (item.getItemId() == R.id.main_find_friends_option) {
        }
        return true;
    }
}



    // @Override
    // protected void onCreate(Bundle savedInstanceState) {
    //     super.onCreate(savedInstanceState);
    //     ActivityListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list);
    //     binding.setMyName("Mikey");
    //     binding.setBgColor(Color.BLUE);
    // }
    // public void onCircleImageClick(View view){
    //     Toast.makeText(this,"Hi Mykii",Toast.LENGTH_SHORT).show();
    // }
    // public void onAClick(View view){
    //     AvatarImageView a = (AvatarImageView) view;
    //     if(a.getState() == AvatarImageView.SHOW_INITIAL){
    //         a.setState(AvatarImageView.SHOW_IMAGE);
    //     }else {
    //         a.setState(AvatarImageView.SHOW_IMAGE);
    //     }

    // }

    // public void onGotoListSampleClick(View view){
    //     //Modified
    //     Intent i = new Intent(this, ChatJoinActivity.class);
    //     startActivity(i);
    // }

