/**
 * Purpose: Shows usage of class and ArrayList to count frequency of
 * character. The same implementation can be done using HashMap.
 * However, intentionally we used ArrayList and class to show
 * non-trivial application of Java classes.
 *
 * Author: GAN MOHIM.
 *
 * Copyright (c) 2019, GAN MOHIM, Canada. All rights reserved.
 */
package classes.charfreq;

import java.util.ArrayList;

public class FrequencyCounter {
    private ArrayList<CharData> charList;

    public FrequencyCounter() {
        this.charList = new ArrayList<CharData>();
    }

    public void addCharObject(CharData charObj) {
        this.charList.add(charObj);
    }

    public CharData isCharObjectFound(char charToFind) {
        for (int i = 0; i < charList.size(); i++) {
            // Get the character from CharData object
            CharData charAtIndex = this.charList.get(i);

            if (charAtIndex.getCharacter() == charToFind){
                return this.charList.get(i);
            } // end of if
        } // end of for
        return null;
    }

    public void printCharFrequency() {
        for (int i=0; i < this.charList.size(); i++) {
            CharData charAtIndex = this.charList.get(i);
            System.out.println(charAtIndex.getCharacter() + " : " +
                    charAtIndex.getFrequency());
        }
    }

}