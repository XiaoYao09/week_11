package com.example.week11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<Team> teams;

    public TeamAdapter(List<Team> teams) {
        this.teams = teams;
    }

    public void updateList(List<Team> newTeams) {
        this.teams = newTeams;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.nameText.setText(team.getName());
        holder.infoText.setText(team.getCountry() + " • " + team.getLeague());
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }

    static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView nameText, infoText;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.teamName);
            infoText = itemView.findViewById(R.id.teamInfo);
        }
    }
}

