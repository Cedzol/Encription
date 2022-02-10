package org.launchcode;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class enigma {

    public static void main(String[] args) {
        //linkTogether();
        //enigmaNumbers("z");
        test();
    }


    public static void linkTogether() {
        String sentence = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Sentence");
        try {
            if (!input.hasNextInt()) {
                try {
                    sentence = input.nextLine();
                } catch (java.util.InputMismatchException e) {
                    input.nextInt();
                }
            }
        } catch (java.util.InputMismatchException e) {
            input.nextLine();
        }

        assert sentence != null;

        ArrayList<Character> charList = new ArrayList<Character>();


        String a = sentence;
        System.out.println("Result: ");
        for (int i = 0; i < a.length(); i++) {
            charList.add(a.charAt(i));
        }

        int countDialone = 0;
        int countDialtwo = 0;
        int countDialthree = 0;

        int[] dialone = {17, 8, 21, 19, 20, 9, 16, 2, 6, 18, 25, 14, 22, 12, 26, 7, 1, 10, 4, 5, 3, 13, 24, 23, 11, 15};

        int[] dialtwo = {23, 9, 16, 19, 6, 5, 20, 26, 2, 13, 24, 15, 10, 25, 12, 3, 21, 22, 4, 7, 17, 18, 1, 11, 14, 8};

        int[] dialthree = {11, 13, 9, 22, 17, 21, 26, 24, 3, 19, 1, 20, 2, 23, 18, 25, 25, 5, 15, 10, 12, 6, 4, 14, 8, 16, 7};

        if (countDialthree > 26){
            countDialthree = 0;
            countDialtwo = 0;
            countDialone = 0;
        }

        String character = "a";

        String characterOut = null;


        int[] ar = {17, 8, 21, 19, 20, 9, 16, 2, 6, 18, 25, 14, 22, 12, 26, 7, 1, 10, 4, 5, 3, 13, 24, 23, 11, 15};
        int[] result = new int[ar.length];
        System.arraycopy(ar, 0, result, 1, ar.length - 1);
        result[0] = ar[ar.length - 1];
        System.out.println(Arrays.toString(result));

        /*
        String character = null;
        for (Character value : charList) {
            character = enigmaNumbers(Character.toString(value));
            System.out.println(character);
        }

         */

    }




    public static String enigmaNumbers(String input) {


//                        a  b  c   d    e  f   g  h  i  j    k  l   m   n    o  p  q  r   s  t  u  v   w    x   y   z
        int[] dialone = {17, 8, 21, 19, 20, 9, 16, 2, 6, 18, 25, 14, 22, 12, 26, 7, 1, 10, 4, 5, 3, 13, 24, 23, 11, 15};

        int[] dialtwo = {23, 9, 16, 19, 6, 5, 20, 26, 2, 13, 24, 15, 10, 25, 12, 3, 21, 22, 4, 7, 17, 18, 1, 11, 14, 8};

        int[] dialthree = {11, 13, 9, 22, 17, 21, 26, 24, 3, 19, 1, 20, 2, 23, 18, 25, 25, 5, 15, 10, 12, 6, 4, 14, 8, 16, 7};


        String character = input;

        String characterOut = null;


        int dialoneIndex = 0;
        int dialtwoIndex;
        int dialthreeIndex;
        int dialfourIndex;
        int dialfiveIndex;
        int dialsixIndex;
        int characterIntAfterEnigmma;


        switch (character) {
            case "a", "A" -> dialoneIndex = 0;
            case "b", "B" -> dialoneIndex = 1;
            case "c", "C" -> dialoneIndex = 2;
            case "d", "D" -> dialoneIndex = 3;
            case "e", "E" -> dialoneIndex = 4;
            case "f", "F" -> dialoneIndex = 5;
            case "g", "G" -> dialoneIndex = 6;
            case "h", "H" -> dialoneIndex = 7;
            case "i", "I" -> dialoneIndex = 8;
            case "j", "J" -> dialoneIndex = 9;
            case "k", "K" -> dialoneIndex = 10;
            case "l", "L" -> dialoneIndex = 11;
            case "m", "M" -> dialoneIndex = 12;
            case "n", "N" -> dialoneIndex = 13;
            case "o", "O" -> dialoneIndex = 14;
            case "p", "P" -> dialoneIndex = 15;
            case "q", "Q" -> dialoneIndex = 16;
            case "r", "R" -> dialoneIndex = 17;
            case "s", "S" -> dialoneIndex = 18;
            case "t", "T" -> dialoneIndex = 19;
            case "u", "U" -> dialoneIndex = 20;
            case "v", "V" -> dialoneIndex = 21;
            case "w", "W" -> dialoneIndex = 22;
            case "x", "X" -> dialoneIndex = 23;
            case "y", "Y" -> dialoneIndex = 24;
            case "z", "Z" -> dialoneIndex = 25;

        }


        dialtwoIndex = dialone[dialoneIndex];


        dialthreeIndex = dialtwo[dialtwoIndex - 1];

        dialfourIndex = dialthree[dialthreeIndex - 1];

        dialfiveIndex = dialtwo[dialfourIndex - 1];

        dialsixIndex = dialone[dialfiveIndex - 1];


        characterIntAfterEnigmma = dialone[dialsixIndex - 1];

        /*

        System.out.println(dialoneIndex + 1);
        System.out.println(dialtwoIndex  );
        System.out.println(dialthreeIndex );
        System.out.println(dialfourIndex );
        System.out.println(dialfiveIndex );
        System.out.println(dialsixIndex );

         */


        if (characterIntAfterEnigmma == 1) {
            characterOut = "a";
        } else if (characterIntAfterEnigmma == 2) {
            characterOut = "b";
        } else if (characterIntAfterEnigmma == 3) {
            characterOut = "c";
        } else if (characterIntAfterEnigmma == 4) {
            characterOut = "d";
        } else if (characterIntAfterEnigmma == 5) {
            characterOut = "e";
        } else if (characterIntAfterEnigmma == 6) {
            characterOut = "f";
        } else if (characterIntAfterEnigmma == 7) {
            characterOut = "g";
        } else if (characterIntAfterEnigmma == 8) {
            characterOut = "h";
        } else if (characterIntAfterEnigmma == 9) {
            characterOut = "i";
        } else if (characterIntAfterEnigmma == 10) {
            characterOut = "j";
        } else if (characterIntAfterEnigmma == 11) {
            characterOut = "k";
        } else if (characterIntAfterEnigmma == 12) {
            characterOut = "l";
        } else if (characterIntAfterEnigmma == 13) {
            characterOut = "m";
        } else if (characterIntAfterEnigmma == 14) {
            characterOut = "n";
        } else if (characterIntAfterEnigmma == 15) {
            characterOut = "o";
        } else if (characterIntAfterEnigmma == 16) {
            characterOut = "p";
        } else if (characterIntAfterEnigmma == 17) {
            characterOut = "q";
        } else if (characterIntAfterEnigmma == 18) {
            characterOut = "r";
        } else if (characterIntAfterEnigmma == 19) {
            characterOut = "s";
        } else if (characterIntAfterEnigmma == 20) {
            characterOut = "t";
        } else if (characterIntAfterEnigmma == 21) {
            characterOut = "u";
        } else if (characterIntAfterEnigmma == 22) {
            characterOut = "v";
        } else if (characterIntAfterEnigmma == 23) {
            characterOut = "w";
        } else if (characterIntAfterEnigmma == 24) {
            characterOut = "x";
        } else if (characterIntAfterEnigmma == 25) {
            characterOut = "y";
        } else if (characterIntAfterEnigmma == 26) {
            characterOut = "z";
        }


        return characterOut;

    }

    public static void test(){
        int countDialone = 0;
        int countDialtwo = 0;
        int countDialthree = 0;

        int[] dialone = {17, 8, 21, 19, 20, 9, 16, 2, 6, 18, 25, 14, 22, 12, 26, 7, 1, 10, 4, 5, 3, 13, 24, 23, 11, 15};

        int[] dialtwo = {23, 9, 16, 19, 6, 5, 20, 26, 2, 13, 24, 15, 10, 25, 12, 3, 21, 22, 4, 7, 17, 18, 1, 11, 14, 8};

        int[] dialthree = {11, 13, 9, 22, 17, 21, 26, 24, 3, 19, 1, 20, 2, 23, 18, 25, 25, 5, 15, 10, 12, 6, 4, 14, 8, 16, 7};


        String character = "a";

        String characterOut = null;


        int[] ar = {17, 8, 21, 19, 20, 9, 16, 2, 6, 18, 25, 14, 22, 12, 26, 7, 1, 10, 4, 5, 3, 13, 24, 23, 11, 15};
        int[] result = new int[ar.length];
        System.arraycopy(ar, 0, result, 1, ar.length - 1);
        result[0] = ar[ar.length - 1];
        System.out.println(Arrays.toString(result));


    }


}
