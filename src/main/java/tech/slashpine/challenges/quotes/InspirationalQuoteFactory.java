package tech.slashpine.challenges.quotes;

import java.util.ArrayList;
import java.util.List;

/**
 * A factory which returns random, inspirational quotes.
 *
 * @author Steven Benitez
 */
public class InspirationalQuoteFactory extends RandomQuoteFactory {
    private static final List<String> QUOTES = new ArrayList<String>();

    /**
     * This is called a static initializer. It is invoked when the JVM loads
     * this class. It allows me to place several values in my quotes list.
     */
    static {
        QUOTES.add("I have never in my life learned anything from any man who agreed with me. -- Dudley Field Malone");
        QUOTES.add("If the facts don't fit the theory, change the facts. -- Albert Einstein");
        QUOTES.add("The trouble with not having a goal is that you can spend your life running up and down the field and never score. -- Bill Copeland");
        QUOTES.add("It is never too late to be what you might have been. -- George Eliot");
        QUOTES.add("If opportunity doesn't knock, build a door. -- Milton Berle");
        QUOTES.add("I haven't failed. I've just found 10,000 ways that won't work. -- Thomas Edison");
    }

    /**
     * Constructs a new instance of InspirationalQuoteFactory using the
     * (inspirational) quotes above.
     */
    public InspirationalQuoteFactory() {
        super(QUOTES);
    }
}
