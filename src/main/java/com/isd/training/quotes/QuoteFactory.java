package com.isd.training.quotes;

/**
 * A factory for obtaining quotes.
 *
 * @author Steven Benitez
 */
public interface QuoteFactory {
    /**
     * Returns a quote. Implementations are free to choose whichever mechanism
     * they want to return quotes (e.g., serial, random, etc.)
     *
     * @return A quote.
     */
    String getQuote();
}
