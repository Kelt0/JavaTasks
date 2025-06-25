package ru.invx.tasks.autocompleteTask;

import java.util.Arrays;
import java.util.concurrent.*;

public class ParallelAutocompleteService implements AutocompleteService {

    String[] towns;

    public ParallelAutocompleteService(String[] towns) {
        this.towns = towns;
    }

    @Override
    public String autocomplete(String prefix) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Callable<String> task = () -> {
          return Arrays.stream(towns).filter(x -> x.startsWith(prefix)).findFirst().orElse("Нет Совпадений");
        };
        Future<String> future = executor.submit(task);
        String result = future.get();
        executor.shutdown();
      return result;
    }

}
