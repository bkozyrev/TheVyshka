package com.dtd.thevyshka.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtd.thevyshka.Adapters.ViewHolders.ParticipantViewHolder;
import com.dtd.thevyshka.R;

public class ParticipantListAdapter extends RecyclerView.Adapter<ParticipantViewHolder> {

    View.OnClickListener listener;

    public ParticipantListAdapter(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public ParticipantViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_participant, viewGroup, false);
        return new ParticipantViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(final ParticipantViewHolder holder, final int i) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
