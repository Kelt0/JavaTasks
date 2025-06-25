package ru.invx.tasks.autocompleteTask;
import java.util.Arrays;

public class BinarySearchAutocompleteService implements AutocompleteService {
    String[] towns;

    public BinarySearchAutocompleteService(String[] towns) {
        this.towns = towns;
    }

    @Override
    public String autocomplete(String prefix) {
        Arrays.sort(towns);
        int index = Arrays.binarySearch(towns, prefix);
        if (index < 0) {
            index = -index - 1;
        }
        if(index < towns.length && towns[index].startsWith(prefix)) {
            return towns[index];
        }
        return "Слово не найдено";
    }

}
