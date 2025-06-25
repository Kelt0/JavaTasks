package ru.invx.tasks.autocompleteTask;

import java.util.concurrent.ExecutionException;

@FunctionalInterface
public interface AutocompleteService {
    String autocomplete(String prefix) throws ExecutionException, InterruptedException;
}
