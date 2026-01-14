package io.github.rjlarberg;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        int[] arrayOfInts = {5, 4, 7, 2};
        String[] arrayOfStrings = {"Hello", "My name is Ray", "Good Bye"};

        int i = 0;
        while(i < arrayOfInts.length) {
            arrayOfInts[i] = 2 * i;
            System.out.println(arrayOfInts[i]);
            i++;
        }
        System.out.println();

        for(String word : arrayOfStrings) System.out.println(word);

        ArrayList<String> dynamicArrayOfStrings = new ArrayList<>();
        dynamicArrayOfStrings.add("My name is Ray");
        dynamicArrayOfStrings.add("My last name is Larberg");
        dynamicArrayOfStrings.add("My friend's name is Robert");

        System.out.println();
        for(String phrase : dynamicArrayOfStrings) System.out.println(phrase);

        dynamicArrayOfStrings.remove(1);

        System.out.println();
        for(String phrase : dynamicArrayOfStrings) System.out.println(phrase);

    }
}
