package buoi_bon;

import java.util.Scanner;

class BaiBon {
    static int soNguyen;
    static int total = 0;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(total < 100) {
            System.out.println("Nhập số lượng số nguyên: ");
            soNguyen = input.nextInt();
            System.out.println("Vui lòng nhập " + soNguyen +" số nguyên");
           
            for(int i = 0; i < soNguyen;i++) {
                System.out.println("Nhap so nguyen thứ " + (i+1) + ": ");
                total += input.nextInt();
            }
            
            if (total < 100) {
                System.out.println("Total: "+total+ '\n' + "Vui lòng nhập lại");
            }
        }
        
        System.out.println("Total: " + total);
        input.close();
    }
}