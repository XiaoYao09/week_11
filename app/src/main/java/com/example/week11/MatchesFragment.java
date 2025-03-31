package com.example.week11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MatchesFragment extends Fragment {

    private RecyclerView recyclerView;
    private MatchAdapter adapter;
    private SearchView searchView;
    private MatchRepository repository;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_matches, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.recyclerView);
        searchView = view.findViewById(R.id.searchView);

        repository = new MatchRepository();
        for (Match m : DataProvider.createSampleMatches()) {
            repository.add(m);
        }

        adapter = new MatchAdapter(repository.getAll());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override public boolean onQueryTextSubmit(String query) { return false; }

            @Override public boolean onQueryTextChange(String newText) {
                List<Match> filtered = repository.filter(
                        m -> m.getHomeTeam().toLowerCase().contains(newText.toLowerCase()) ||
                                m.getAwayTeam().toLowerCase().contains(newText.toLowerCase()));
                adapter.updateList(filtered);
                return true;
            }
        });
    }
}

