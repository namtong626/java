package buoi_bon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class BaiBa {
    public static void main(String[] args) {

        Random rand = new Random();

        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        int[] array = new int[int_random];

        System.out.println(int_random);

        for (int i = 0; i < int_random; i++) {
            int random = rand.nextInt(upperbound);
            array[i] = random;
        }

        System.out.println(Arrays.toString(array));

        Scanner input = new Scanner(System.in);

        int soNguyen = 0;

        boolean issetInArray = false;

        while (!issetInArray) {
            System.out.println("Nhap so nguyen:");
            soNguyen = input.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (soNguyen == array[i]) {
                    System.out.println("Sô nguyên ở vị trí " + (i+1) + " trong mảng");
                    issetInArray = true;
                }
            }

            if (!issetInArray) {
                System.out.println("Không tồn tại số nguyên này trong mảng");
            }
        } ;
    }
}
