package com.dtd.thevyshka.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtd.thevyshka.Adapters.ViewHolders.OrganizerViewHolder;
import com.dtd.thevyshka.R;

public class OrganizerListAdapter extends RecyclerView.Adapter<OrganizerViewHolder> {

    View.OnClickListener listener;

    public OrganizerListAdapter(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public OrganizerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_organizer, viewGroup, false);
        return new OrganizerViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(final OrganizerViewHolder holder, final int i) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
