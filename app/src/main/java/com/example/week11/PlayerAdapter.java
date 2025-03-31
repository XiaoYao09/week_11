package com.example.week11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    private List<Player> players;

    public PlayerAdapter(List<Player> players) {
        this.players = players;
    }

    public void updateList(List<Player> newList) {
        players = newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_player, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player p = players.get(position);
        holder.nameText.setText(p.getName());
        holder.infoText.setText(p.getPosition() + " • " + p.getTeam());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    static class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView nameText, infoText;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.playerName);
            infoText = itemView.findViewById(R.id.playerInfo);
        }
    }
}


