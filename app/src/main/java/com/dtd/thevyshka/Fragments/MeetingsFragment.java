package com.dtd.thevyshka.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtd.thevyshka.Activities.CreateMeetingActivity;
import com.dtd.thevyshka.Adapters.MeetingsFragmentPagerAdapter;
import com.dtd.thevyshka.R;
import com.dtd.thevyshka.Utils.SlidingTabLayout;

public class MeetingsFragment extends BaseFragment {

    public MeetingsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mToolBarFragment.setTitle(R.string.meeting);
        return inflater.inflate(R.layout.fragment_meetings, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.fab);

        int mTabCount = 3;

        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setOffscreenPageLimit(mTabCount);
        mViewPager.setAdapter(new MeetingsFragmentPagerAdapter(((FragmentActivity) mContext).getSupportFragmentManager(), mTabCount));

        SlidingTabLayout mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setTabCount(mTabCount);
        mSlidingTabLayout.setViewPager(mViewPager);
        mSlidingTabLayout.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorPrimary));
        mSlidingTabLayout.setSelectedIndicatorColors(ContextCompat.getColor(mContext, R.color.colorAccent));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, CreateMeetingActivity.class);
                startActivity(intent);
            }
        });
    }
}
