package com.osowski;

/**
 * Klasa A.
 *
 * @author John Smith
 * @version 0.1
 */
public class ClassASeven {
    /** Prywatne, domyslnie niewidoczne w dokumentacji */
    private int n;
    /** Liczba p */
    public double p;
    /**
     * Zmienia n.
     *
     * @param i nowa wartosc
     * @return stara wartosc
     */
    public int changeValue(int i) {
        int k = n;
        n = i;
        return k;
    }
}
