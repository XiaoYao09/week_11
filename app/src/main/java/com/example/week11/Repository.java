package com.example.week11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Repository<T> {
    protected List<T> items = new ArrayList<>();

    public void add(T item) {
        if (item != null) {
            items.add(item);
        }
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }

    public List<T> filter(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}


