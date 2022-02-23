package org.launchcode;



import java.util.ArrayList;
import java.util.Scanner;


public class enigma {

    static int countDialone = 0;
    static int countDialtwo = 0;
    static int countDialthree = 0;

    public static void main(String[] args) {
        linkTogether();
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

        ArrayList<Character> charList = new ArrayList<>();


        String a = sentence;
        System.out.println("Result: ");
        for (int i = 0; i < a.length(); i++) {
            charList.add(a.charAt(i));
        }


        for (Character value : charList) {
            checkChar(Character.toString(value));
        }



    }

    public static void checkChar(String input){
        switch (input) {
            case " " -> System.out.println(" ");
            case ",", ", " -> System.out.println(", ");
            case ".", ". " -> System.out.println(". ");
            default -> enigmaNumbers(input);
        }
    }

    //                        a  b  c   d    e  f   g  h  i  j    k  l   m   n    o  p  q  r   s  t  u  v   w    x   y   z
    static int[] dialone = {17, 8, 21, 19, 20, 9, 16, 2, 6, 18, 25, 14, 22, 12, 26, 7, 1, 10, 4, 5, 3, 13, 24, 23, 11, 15};

    static int[] dialtwo = {23, 9, 16, 19, 6, 5, 20, 26, 2, 13, 24, 15, 10, 25, 12, 3, 21, 22, 4, 7, 17, 18, 1, 11, 14, 8};

    static int[] dialthree = {11, 13, 9, 22, 17, 21, 26, 24, 3, 19, 1, 20, 2, 23, 18, 25, 25, 5, 15, 10, 12, 6, 4, 14, 8, 16, 7};


    public static void enigmaNumbers(String input) {

        String characterOut = null;

        int dialoneIndex = 0;
        int dialtwoIndex;
        int dialthreeIndex;
        int dialfourIndex;
        int dialfiveIndex;
        int dialsixIndex;
        int characterIntAfterEnigmma;


        switch (input) {
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

        if (countDialone < 27){
            countDialone++;

            int[] result = new int[dialone.length];
            System.arraycopy(dialone, 0, result, 1, dialone.length - 1);
            result[0] = dialone[25];

            dialone = result;
        }
        if (countDialone == 26 && countDialtwo < 27) {
            countDialone = 0;
            countDialtwo++;
            int[] result = new int[dialtwo.length];
            System.arraycopy(dialtwo, 0, result, 1, dialtwo.length - 1);
            result[0] = dialtwo[25];

            dialtwo = result;
        }
        if (countDialtwo == 26 && countDialthree < 27) {
            countDialtwo = 0;
            countDialthree++;
            int[] result = new int[dialthree.length];
            System.arraycopy(dialthree, 0, result, 1, dialthree.length - 1);
            result[0] = dialthree[25];

            dialthree = result;
        }
        System.out.println(characterOut);

    }

}
