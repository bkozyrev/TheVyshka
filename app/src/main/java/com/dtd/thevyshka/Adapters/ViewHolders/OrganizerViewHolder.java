package com.dtd.thevyshka.Adapters.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class OrganizerViewHolder extends RecyclerView.ViewHolder {

    public OrganizerViewHolder(View itemView, View.OnClickListener listener) {
        super(itemView);

        itemView.setOnClickListener(listener);
    }
}