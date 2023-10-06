package Main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static Main.Algorithms.*;
public class Main {
    private static void zad4_a() throws IOException {
        ArrayList<Integer> content = readFileArr(new File("cyfry.txt"));
        int evenNumbers = 0;
        for(Integer i : content) {
            if((i & 2) == 0)
                evenNumbers++;
        }
        System.out.println(evenNumbers);
    }

    private static void zad4_b() throws IOException {
        ArrayList<Integer> content = readFileArr(new File("cyfry.txt"));
        int highestSum = 0;
        int highestSumIndex = 0;

        int lowestSum = Integer.MAX_VALUE;
        int lowestSumIndex = 0;

        int index = 0;
        for(Integer i : content) {
            String s = String.valueOf(i);
            int sum = 0;
            for(char c : s.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            if(sum > highestSum) {
                highestSum = sum;
                highestSumIndex = index;
            }
            if(sum < lowestSum) {
                lowestSum = sum;
                lowestSumIndex = index;
            }

            index++;
        }
        System.out.println("Najwyższa suma: " + highestSum + "\tLiczba: " + content.get(highestSumIndex));
        System.out.println("Najniższa suma: " + lowestSum + "\tLiczba: " + content.get(lowestSumIndex));
    }

    public static void main(String[] args) throws IOException {
        zad4_b();
    }
}