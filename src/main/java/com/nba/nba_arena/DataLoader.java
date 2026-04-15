package com.nba.nba_arena;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nba.nba_arena.service.CSVLoaderService;

@Component
public class DataLoader implements CommandLineRunner {

    private final CSVLoaderService csvLoader;

    public DataLoader(CSVLoaderService csvLoader){
        this.csvLoader = csvLoader;
    }

    @Override
    public void run(String... args) throws Exception {
        // This method will be executed after the application context is loaded and right before the Spring Application run method is completed.
        // You can use this method to load initial data into your database or perform any setup tasks.
        if (csvLoader.isDatabaseEmpty()) {
            System.out.println("Database empty. Importing CSV...");
            csvLoader.loadCSV("nba_data.csv");
        } else {
            System.out.println("Data already exists. Skipping import.");
        }
    }

}
