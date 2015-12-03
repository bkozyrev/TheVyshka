package com.dtd.thevyshka.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dtd.thevyshka.Fragments.TabScience;

public class MeetingsFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private FragmentManager fm;
    private int pageNumber;

    public MeetingsFragmentPagerAdapter(FragmentManager fm, int pageNumber) {
        super(fm);
        this.fm = fm;
        this.pageNumber = pageNumber;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return TabScience.newInstance();
            case 1:
                return TabScience.newInstance();
            case 2:
                return TabScience.newInstance();
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
                    str = "Развлечения";
                    break;
                case 1:
                    str = "Наука";
                    break;
                case 2:
                    str = "Культура";
                    break;
            }
            return str;
    }
}
