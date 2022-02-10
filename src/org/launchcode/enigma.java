package org.launchcode;


import java.text.ParseException;

public class enigma {

    public static void main(String[] args) {
        enigmaNumbers();
    }
    

    public static void enigmaNumbers() {


        int[] dialone = {17, 8, 21, 19, 20, 9, 16, 2, 6, 18, 25, 14, 22, 12, 26, 7, 1, 10, 4, 5, 3, 13, 24, 23, 11, 15};

        int[] dialtwo = {23, 9, 16, 19, 6, 5, 20, 26, 2, 13, 24, 15, 10, 25, 12, 3, 21, 22, 4, 7, 17, 18, 1, 11, 14, 8};

        int[] dialthree = {8, 26, 18, 11, 20, 23, 13, 1, 25, 19, 4, 2, 7, 17, 25, 21, 14, 2, 10, 5, 16, 12, 6, 15, 9, 2};

        String character = "b";
        
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
            case "b", "B" -> dialoneIndex = 2 -1;
            case "c", "C" -> dialoneIndex = 3 -1;
            case "d", "D" -> dialoneIndex = 4 -1;
            case "e", "E" -> dialoneIndex = 5 -1;
            case "f", "F" -> dialoneIndex = 6 -1;
            case "g", "G" -> dialoneIndex = 7 -1;
            case "h", "H" -> dialoneIndex = 8 -1;
            case "i", "I" -> dialoneIndex = 9 -1;
            case "j", "J" -> dialoneIndex = 10 -1;
            case "k", "K" -> dialoneIndex = 11 -1;
            case "l", "L" -> dialoneIndex = 12 -1;
            case "m", "M" -> dialoneIndex = 13 -1;
            case "n", "N" -> dialoneIndex = 14 -1;
            case "o", "O" -> dialoneIndex = 15 -1;
            case "p", "P" -> dialoneIndex = 16 -1;
            case "q", "Q" -> dialoneIndex = 17 -1;
            case "r", "R" -> dialoneIndex = 18 -1;
            case "s", "S" -> dialoneIndex = 19 -1;
            case "t", "T" -> dialoneIndex = 20 -1;
            case "u", "U" -> dialoneIndex = 21 -1;
            case "v", "V" -> dialoneIndex = 22 -1;
            case "w", "W" -> dialoneIndex = 23 -1;
            case "x", "X" -> dialoneIndex = 24 -1;
            case "y", "Y" -> dialoneIndex = 25 -1;
            case "z", "Z" -> dialoneIndex = 26 -1;


        }


        dialtwoIndex = dialone[dialoneIndex];


        dialthreeIndex = dialtwo[dialtwoIndex];

        dialfourIndex = dialthree[dialthreeIndex];

        dialfiveIndex = dialtwo[dialfourIndex];

        dialsixIndex = dialone[dialfiveIndex];



        characterIntAfterEnigmma = dialone[dialsixIndex-1];

        
        if (characterIntAfterEnigmma == 1){
            characterOut = "a";
        } else if (characterIntAfterEnigmma == 2){
            characterOut = "b";
        } else if (characterIntAfterEnigmma == 3){
            characterOut = "c";
        } else if (characterIntAfterEnigmma == 4){
            characterOut = "d";
        } else if (characterIntAfterEnigmma == 5){
            characterOut = "e";
        } else if (characterIntAfterEnigmma == 6){
            characterOut = "f";
        } else if (characterIntAfterEnigmma == 7){
            characterOut = "g";
        } else if (characterIntAfterEnigmma == 8){
            characterOut = "h";
        } else if (characterIntAfterEnigmma == 9){
            characterOut = "i";
        } else if (characterIntAfterEnigmma == 10){
            characterOut = "j";
        } else if (characterIntAfterEnigmma == 11){
            characterOut = "k";
        } else if (characterIntAfterEnigmma ==  12){
            characterOut = "l";
        } else if (characterIntAfterEnigmma == 13){
            characterOut = "m";
        } else if (characterIntAfterEnigmma == 14){
            characterOut = "n";
        } else if (characterIntAfterEnigmma == 15){
            characterOut = "o";
        } else if (characterIntAfterEnigmma == 16){
            characterOut = "p";
        } else if (characterIntAfterEnigmma == 17){
            characterOut = "q";
        } else if (characterIntAfterEnigmma == 18){
            characterOut = "r";
        } else if (characterIntAfterEnigmma == 19){
            characterOut = "s";
        } else if (characterIntAfterEnigmma == 20){
            characterOut = "t";
        } else if (characterIntAfterEnigmma == 21){
            characterOut = "u";
        } else if (characterIntAfterEnigmma == 22){
            characterOut = "v";
        } else if (characterIntAfterEnigmma == 23){
            characterOut = "w";
        } else if (characterIntAfterEnigmma == 24){
            characterOut = "x";
        } else if (characterIntAfterEnigmma == 25){
            characterOut = "y";
        } else if (characterIntAfterEnigmma == 26){
            characterOut = "z";
        }

        System.out.println(characterOut);
 
    }
    
    

}
