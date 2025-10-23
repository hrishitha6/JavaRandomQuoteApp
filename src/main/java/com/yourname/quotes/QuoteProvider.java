package com.yourname.quotes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteProvider {
    private final List<String> quotes = new ArrayList<>();
    private final Random random = new Random();

    public QuoteProvider() {
        loadQuotes("/quotes.txt");
    }

    private void loadQuotes(String resourcePath) {
        try (InputStream is = getClass().getResourceAsStream(resourcePath);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) quotes.add(line);
            }
        } catch (Exception e) {
            System.err.println("Could not load quotes: " + e.getMessage());
        }
    }

    public String getRandomQuote() {
        if (quotes.isEmpty()) return "No quotes available.";
        return quotes.get(random.nextInt(quotes.size()));
    }
}
