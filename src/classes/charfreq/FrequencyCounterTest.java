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

public class FrequencyCounterTest {
    public static void main(String[] args) {
        FrequencyCounter freq_obj = new FrequencyCounter();

        String input = "aaa bbb cdef g";

        // clean input to remove space
        String input_data = input.replace(" ", "");

        char[] charList = new char[input_data.length()];
        charList = input_data.toCharArray();

        for (int i=0; i<charList.length; i++) {
            CharData currentCharObj =
                    freq_obj.isCharObjectFound(charList[i]);

            if (currentCharObj != null) {
                currentCharObj.increment_frequency();
            }
            else {
                CharData newCharObj = new CharData(charList[i]);
                freq_obj.addCharObject(newCharObj);
            }
        } // end of for

        freq_obj.printCharFrequency();

    } // end of main
} // end of FrequencyCounterTest class
