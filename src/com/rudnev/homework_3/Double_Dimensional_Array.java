package com.rudnev.homework_3;

public class Double_Dimensional_Array {

    public static void main(String[] args) {
        String s = new String("Руднев Александр");
        char[][] ddarray = new char[4][4];
        char[] charArrayOfString = new char[s.length()];
        int k = 0;
        for (char letter : s.toCharArray()) {
            charArrayOfString[k] = letter;
            k++;
        }
        int q = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ddarray[i][j] = charArrayOfString[q];
                q++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ddarray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
