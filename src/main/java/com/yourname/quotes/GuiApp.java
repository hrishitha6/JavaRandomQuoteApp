package com.yourname.quotes;

import javax.swing.*;
import java.awt.*;

public class GuiApp {
    public static void main(String[] args) {
        QuoteProvider provider = new QuoteProvider();

        JFrame frame = new JFrame("Random Quote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JTextArea area = new JTextArea(provider.getRandomQuote());
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
        area.setFont(new Font("Serif", Font.PLAIN, 16));

        JButton button = new JButton("New Quote");
        button.addActionListener(e -> area.setText(provider.getRandomQuote()));

        frame.add(new JScrollPane(area), BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
