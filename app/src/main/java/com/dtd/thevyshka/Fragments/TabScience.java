package com.dtd.thevyshka.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtd.thevyshka.Activities.SingleMeetingActivity;
import com.dtd.thevyshka.Adapters.ScienceListAdapter;
import com.dtd.thevyshka.R;

public class TabScience extends BaseFragment implements View.OnClickListener{

    private RecyclerView mList;

    public static TabScience newInstance() {
        return new TabScience();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_science, container, false);

        mList = (RecyclerView) view.findViewById(R.id.meetings_list);
        mList.setHasFixedSize(true);
        mList.setItemAnimator(new DefaultItemAnimator());
        mList.setLayoutManager(new LinearLayoutManager(mContext));
        mList.setAdapter(new ScienceListAdapter(TabScience.this));

        return view;
    }

    @Override
    public void onClick(View view){
        Intent intent = new Intent(mContext, SingleMeetingActivity.class);
        startActivity(intent);
    }
}
