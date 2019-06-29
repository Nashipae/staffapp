package com.staff.staffapp.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.staff.staffapp.ui.ChatChatFragment;
import com.staff.staffapp.ui.ChatContactFragment;
import com.staff.staffapp.ui.ChatGroupFragment;

public class ChatTabsAccessorAdapter extends FragmentPagerAdapter {


    public ChatTabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                ChatChatFragment chatChatFragment = new ChatChatFragment();
                return chatChatFragment;

            case 1:
                ChatContactFragment chatContactFragment = new ChatContactFragment();
                return chatContactFragment;

            case 2:
                ChatGroupFragment chatGroupFragment = new ChatGroupFragment();
                return chatGroupFragment;
                default:
                    return null;

        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "Chats";


            case 1:
                return "Contacts";


            case 2:
                return "Groups";
                default:
                    return null;

        }

    }
}
