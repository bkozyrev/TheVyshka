package com.dtd.thevyshka.Activities;

import android.os.Bundle;

import com.dtd.thevyshka.R;

/**
 * Created by 123 on 03.11.2015.
 */
public class CreateMeetingActivity extends BaseActivity {

    @Override
    protected int getLayoutResourceIdentifier() {
        return R.layout.activity_create_meeting;
    }

    @Override
    protected boolean getDisplayHomeAsUp() {
        return true;
    }

    @Override
    protected boolean getHomeButtonEnabled() {
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mToolBar.setTitle(R.string.create_meeting);
    }
}
