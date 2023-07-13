package buoi_bon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BaiHai {
    public static void main(String[] args) {

        Random rand = new Random();

        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        int[] array = new int[int_random];

        // System.out.println(int_random);

        for (int i = 0; i < int_random; i++) {
            int random = rand.nextInt(upperbound);
            array[i] = random;
        }

        System.out.println(Arrays.toString(array) + '\n');

        ArrayList<Integer> mangChan = new ArrayList<Integer>();
        ArrayList<Integer> mangLe = new ArrayList<Integer>();

        for (int item : array) {
            switch (item % 2) {
                case 0:
                    mangChan.add(item);
                    break;
                default:
                    mangLe.add(item);
            }

        }

        System.out.println("Mảng chẵn: " + mangChan + '\n');
        System.out.println("Mảng lẻ: " + mangLe);
    }
}