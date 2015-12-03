package com.dtd.thevyshka.Fragments;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.support.v7.widget.Toolbar;

import com.dtd.thevyshka.Activities.MainActivity;

public abstract class BaseFragment extends Fragment {

    protected Context mContext;
    protected Toolbar mToolBarFragment;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mContext = getActivity();
        mToolBarFragment = ((MainActivity)getActivity()).getToolBar();
    }
}
