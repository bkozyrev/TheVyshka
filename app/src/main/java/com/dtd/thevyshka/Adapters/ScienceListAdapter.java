package com.dtd.thevyshka.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dtd.thevyshka.Adapters.ViewHolders.ScienceViewHolder;
import com.dtd.thevyshka.R;

public class ScienceListAdapter extends RecyclerView.Adapter<ScienceViewHolder> {

    View.OnClickListener listener;

    public ScienceListAdapter(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public ScienceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_science, viewGroup, false);
        return new ScienceViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(final ScienceViewHolder holder, final int i) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
