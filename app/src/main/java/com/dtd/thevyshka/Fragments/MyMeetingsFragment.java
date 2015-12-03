package com.dtd.thevyshka.Fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtd.thevyshka.Adapters.MyMeetingsFragmentPagerAdapter;
import com.dtd.thevyshka.R;
import com.dtd.thevyshka.Utils.SlidingTabLayout;

/**
 * Created by 123 on 31.10.2015.
 */
public class MyMeetingsFragment extends BaseFragment{

    public MyMeetingsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mToolBarFragment.setTitle(R.string.my_meeting);
        return inflater.inflate(R.layout.fragment_my_meetings, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        int mTabCount = 2;

        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setOffscreenPageLimit(mTabCount);
        mViewPager.setAdapter(new MyMeetingsFragmentPagerAdapter(((FragmentActivity) mContext).getSupportFragmentManager(), mTabCount));

        SlidingTabLayout mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setTabCount(mTabCount);
        mSlidingTabLayout.setViewPager(mViewPager);
        mSlidingTabLayout.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorPrimary));
        mSlidingTabLayout.setSelectedIndicatorColors(ContextCompat.getColor(mContext, R.color.colorAccent));
        //mSlidingTabLayout.setDividerColors(ContextCompat.getColor(mContext, R.color.md_black_1000));
        //mSlidingTabLayout.setDividerColors(ContextCompat.getColor(mContext, R.color.white));
    }
}
