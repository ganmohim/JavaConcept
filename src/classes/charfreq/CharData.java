/**
 * Purpose: Shows usage of class and ArrayList to count frequency of
 * character. The same implementation can be done using HashMap.
 * However, intentionally we used ArrayList and class to show
 * non-trivial application of Java classes.
 *
 * Author: GAN MOHIM.
 *
 * Copyright (c) 2019, Waterlootec, Canada. All rights reserved.
 */
package classes.charfreq;

public class CharData {
    private char char_data;
    private int frequency_counter;

    public CharData(char char_data) {
        this.char_data = char_data;
        this.frequency_counter = 1;
    }

    public void increment_frequency() {
        this.frequency_counter += 1;
    }

    public int getFrequency() {
        return this.frequency_counter;
    }

    public char getCharacter() {
        return this.char_data;
    }

}
