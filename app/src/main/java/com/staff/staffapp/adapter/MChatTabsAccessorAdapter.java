package com.staff.staffapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.staff.staffapp.ui.MChatContactsFragment;
import com.staff.staffapp.ui.MChatGroupsFragment;

public class MChatTabsAccessorAdapter extends FragmentPagerAdapter {
    public MChatTabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (i)
        {
            case 0:
                MChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1:
                MChatGroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;

            case 2:
                MChatContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;

            case 3:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            default:
                return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
