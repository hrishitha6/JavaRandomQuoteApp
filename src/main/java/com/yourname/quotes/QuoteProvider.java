package com.yourname.quotes;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class QuoteProvider {
    private final List<String> quotes = new ArrayList<>();
    private final Random random = new Random();

    public QuoteProvider() {
        quotes.add("Be yourself; everyone else is already taken.");
        quotes.add("Life is what happens when you're busy making other plans.");
        quotes.add("I have not failed. I've just found 10,000 ways that won't work.");
    }

    public String getRandomQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }
}
