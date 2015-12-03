package com.dtd.thevyshka.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtd.thevyshka.Adapters.ViewHolders.CampusesViewHolder;
import com.dtd.thevyshka.R;

public class CampusesListAdapter extends RecyclerView.Adapter<CampusesViewHolder> {

    View.OnClickListener listener;

    public CampusesListAdapter(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public CampusesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_campus, viewGroup, false);
        return new CampusesViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(final CampusesViewHolder holder, final int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
