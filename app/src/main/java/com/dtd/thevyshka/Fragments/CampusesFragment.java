package com.dtd.thevyshka.Fragments;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtd.thevyshka.Adapters.CampusesListAdapter;
import com.dtd.thevyshka.R;

/**
 * Created by 123 on 01.11.2015.
 */
public class CampusesFragment extends BaseFragment implements View.OnClickListener {

    private RecyclerView mList;

    public CampusesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_campuses, container, false);

        mToolBarFragment.setTitle(R.string.campus);

        mList = (RecyclerView) view.findViewById(R.id.campuses_list);
        mList.setHasFixedSize(true);
        mList.setItemAnimator(new DefaultItemAnimator());
        mList.setLayoutManager(new LinearLayoutManager(mContext));
        mList.setAdapter(new CampusesListAdapter(CampusesFragment.this));

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }

    @Override
    public void onClick(View view){

    }
}
