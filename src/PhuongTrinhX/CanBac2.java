package PhuongTrinhX;

import java.util.Scanner;

public class CanBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = sc.nextDouble();
        System.out.println("Nhap b:");
        double b = sc.nextDouble();
        System.out.println("Nhap c:");
        double c = sc.nextDouble();

        double x = 0;
        if (a > 0) {
            double delta = (b*b - 4*a*c);
            System.out.println("Delta: " + delta);
            if (delta > 0){
                x = (-b - Math.sqrt(delta) / 2*a);
                System.out.println("x1 = " + x);
                x = (-b + Math.sqrt(delta) / 2*a);
                System.out.println("x2 = " + x);
            } else if (delta == 0) {
                x = (-b / 2*a);
                System.out.println("Có 1 nghiệm");
            }
            else
                System.out.println("Phuong trinh vo nghiem");
        } else if (a == 0) {
            System.out.println("Chi co 1No:\t" + (-c/b));
        }
    }
}
