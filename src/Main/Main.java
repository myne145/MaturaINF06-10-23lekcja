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
    public static void main(String[] args) throws IOException {
        zad4_a();
    }
}