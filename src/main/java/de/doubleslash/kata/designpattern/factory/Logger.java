package de.doubleslash.kata.designpattern.factory;

public interface Logger {

    /**
     * Loggt die ├╝bergebene Nachricht.
     *
     * @param message die zu loggende Nachricht.
     */
    public void log(String message);

}
