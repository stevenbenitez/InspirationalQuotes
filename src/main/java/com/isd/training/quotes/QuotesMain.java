package com.isd.training.quotes;

/**
 * A command-line class which prints a quote.
 *
 * @author Steven Benitez
 */
public class QuotesMain {
    public static void main(String[] args) {
        // create an instance of QuoteFactory. specifically, we're using an
        // InspirationalQuoteFactory, but we could use a MovieQuoteFactory
        // instead.
        QuoteFactory factory = new InspirationalQuoteFactory();

        // let's print out three quotes
        for (int i = 0; i < 3; i++) {
            System.out.println(factory.getQuote());
        }
    }
}
