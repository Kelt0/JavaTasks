package ru.invx.tasks.autocompleteTask;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSearchAutocompleteService implements AutocompleteService {
    String[] towns;

    public TreeSearchAutocompleteService(String[] towns) {
        this.towns = towns;
    }

    @Override
    public String autocomplete(String prefix) {
       TreeSet<String> townSet = Arrays.stream(towns).collect(Collectors.toCollection(TreeSet::new));
       String res = townSet.stream().filter(word -> word.startsWith(prefix)).findFirst().orElse("Значение на найдено");
        return res;
    }
}
