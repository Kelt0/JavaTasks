package ru.invx.tasks.autocompleteTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchAutocompleteServiceTest {
    private BinarySearchAutocompleteService service;

    @BeforeEach
    void setUp() {
        String[] towns = {"New York", "Moscow", "Oslo", "Minsk", "Berlin", "Volgograd",
                "Novgorod", "Oslo", "Elizovo", "Krasnodar", "Perm", "Astana", "Kursk", "Washington", "Madrid"};
        service = new BinarySearchAutocompleteService(towns);
    }

    @Test
    public void test() throws ExecutionException, InterruptedException {
        String prefix = "Nov";
        String result = service.autocomplete(prefix);
        System.out.println("Поиск по префиксу "+ prefix + " ...");
        Thread.sleep(5000);
        System.out.println("Результат по поиску: " + result);
        assertNotNull(result);
        assertTrue(result.startsWith(prefix));
    }
}
