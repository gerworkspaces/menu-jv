package ShapeMenuMain;

import ShapeCalculateMenu.Circle;
import ShapeCalculateMenu.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Circle | 2 Square");
        int c = sc.nextInt();

        switch (c){
            case 1:
                System.out.println("Your choice is: " + 1);
                float r = sc.nextFloat();
                System.out.println("Your type is: " + r);
                System.out.println("Perimeter of Circle:\t" + Circle.perimeterCircle(r));
                System.out.println("Area of Circle:\t" + Circle.areaCircle(r));
                System.out.println("--------------------------------------------");
                break;
            case 2:
                System.out.println("Your choice is: " + 2);
                System.out.println("Your type is: ");
                double edge = sc.nextDouble();//edge: cạnh - by || side
                System.out.println("Perimeter of Square:\t" + Square.perimeterSquare(edge));
                System.out.println("Area of Square:\t" + Square.areaSquare(edge));
                System.out.println("--------------------------------------------");
                break;
            default:
                System.out.println("Choosing again bro\n");
        }

        if (c == 1){
            System.out.println("Your choice is: " + 1);
            float r = sc.nextFloat();
            System.out.println("Your type is: " + r);
            System.out.println("Perimeter of Circle:\t" + Circle.perimeterCircle(r));
            System.out.println("Area of Circle:\t" + Circle.areaCircle(r));
        } else if (c == 2) {
            System.out.println("Your choice is: " + 2);
            double edge = sc.nextDouble();//edge: cạnh - by || side
            System.out.println("Your type is: " + edge);
            System.out.println("Perimeter of Square:\t" + Square.perimeterSquare( edge));
            System.out.println("Area of Square:\t" + Square.areaSquare( edge));
        }
        else{
            System.out.println("END");
        }
    }
}
