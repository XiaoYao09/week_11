package com.example.week11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {

    private List<Match> matches;

    public MatchAdapter(List<Match> matches) {
        this.matches = matches;
    }

    public void updateList(List<Match> newList) {
        matches = newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_match, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        Match m = matches.get(position);
        holder.titleText.setText(m.getHomeTeam() + " vs " + m.getAwayTeam());
        holder.detailText.setText(m.getScore() + " • " + m.getDate() + " • " + m.getLocation());
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    static class MatchViewHolder extends RecyclerView.ViewHolder {
        TextView titleText, detailText;

        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.matchTitle);
            detailText = itemView.findViewById(R.id.matchDetail);
        }
    }
}

