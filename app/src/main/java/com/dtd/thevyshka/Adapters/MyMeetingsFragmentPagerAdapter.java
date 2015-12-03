package com.dtd.thevyshka.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dtd.thevyshka.Fragments.TabOrganizer;
import com.dtd.thevyshka.Fragments.TabParticipant;

/**
 * Created by 123 on 31.10.2015.
 */
public class MyMeetingsFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private FragmentManager fm;
    private int pageNumber;

    public MyMeetingsFragmentPagerAdapter(FragmentManager fm, int pageNumber) {
        super(fm);
        this.fm = fm;
        this.pageNumber = pageNumber;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return TabParticipant.newInstance();
            case 1:
                return TabOrganizer.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return pageNumber;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String str = "";
        switch(position){
            case 0:
                str = "Участник";
                break;
            case 1:
                str = "Организатор";
                break;
            default:
                break;
        }
        return str;
    }
}
