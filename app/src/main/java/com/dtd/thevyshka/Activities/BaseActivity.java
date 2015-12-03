package com.dtd.thevyshka.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.crashlytics.android.Crashlytics;
import com.dtd.thevyshka.R;

import io.fabric.sdk.android.Fabric;


public abstract class BaseActivity extends AppCompatActivity {

    protected Toolbar mToolBar;
//    protected View mShadowView;
    protected Context mContext;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(getLayoutResourceIdentifier());
        loadComponents();
        loadInfoView();
        initializeToolBar();
    }

    private void loadComponents() {
        mContext = getApplicationContext();
        //mShadowView = findViewById(R.id.shadow);
        mToolBar = (Toolbar)findViewById(R.id.toolbar);
    }

    private void loadInfoView() {
        if (mToolBar != null) {
            setSupportActionBar(mToolBar);
        }
    }

    protected void initializeToolBar() {
        if (mToolBar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(getDisplayHomeAsUp());
            getSupportActionBar().setHomeButtonEnabled(getHomeButtonEnabled());
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    protected abstract int getLayoutResourceIdentifier();

    public Toolbar getToolBar() {
        return mToolBar;
    }

//    public View getShadowView() { return mShadowView;}

    protected abstract boolean getDisplayHomeAsUp();

    protected abstract boolean getHomeButtonEnabled();

}