package buoi_bon;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiMot {
    static int soNguyen;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số lượng số: ");
        soNguyen = input.nextInt();
        System.out.println("Vui lòng nhập " + soNguyen +" số nguyên và thực");
       
        // khai báo mảng bằng ArrayList của package util có cấu trúc:
        // ArrayList<DataType> variableName = new ArrayList<DataType>(Data truyền vào
        // mảng)
        // Data truyền vào mảng là optional , ko truyền sẽ là mảng rỗng
        ArrayList<Double> arr = new ArrayList<Double>();
    
        for(int i = 0; i < soNguyen;i++) {
            System.out.println("Nhap so nguyen thứ " + (i+1) + ": ");
            arr.add(input.nextDouble());;
        }

        double max = 0;
        for(double item: arr) {
            if(max < item) {
                max = item;
            }
        }
        
        double min = arr.get(0);

        for(double item: arr) {
            if(min > item) {
                min = item;
            }
        }

        System.out.println("Số nhỏ nhất là " + min);
        System.out.println("Số lớn nhất là " + max);
    }
}
