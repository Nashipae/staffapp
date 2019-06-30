package com.staff.staffapp.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.staff.staffapp.ui.MChatContactsFragment;
import com.staff.staffapp.ui.MChatGroupsFragment;
import com.staff.staffapp.ui.MChatRequestsFragment;
import com.staff.staffapp.ui.MChatsFragment;

public class MChatTabsAccessorAdapter extends FragmentPagerAdapter {
    public MChatTabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MChatsFragment chatsFragment = new MChatsFragment();
                return chatsFragment;

            case 1:
                MChatGroupsFragment groupsFragment = new MChatGroupsFragment();
                return groupsFragment;

            case 2:
                MChatContactsFragment contactsFragment = new MChatContactsFragment();
                return contactsFragment;

            case 3:
                MChatRequestsFragment requestsFragment = new MChatRequestsFragment();
                return requestsFragment;

            default:
                return null;
        }
    }

        @Override
        public int getCount () {
            return 4;
        }

         @Nullable
    @Override
    public CharSequence getPageTitle(int position){

             switch (position)
             {
                 case 0:
                     return "Chats";

                 case 1:
                     return "Groups";

                 case 2:
                     return "Contacts";

                 case 3:
                     return "Requests";

                 default:
                     return null;
             }

         }
    }


