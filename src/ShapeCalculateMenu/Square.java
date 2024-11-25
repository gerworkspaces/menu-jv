package ShapeCalculateMenu;

public class Square {
    public static double perimeterSquare(double edge){
        return edge * 2;
    }
    public static double areaSquare(double edge){
        return  edge *  edge ;
    }
    public static void main(String[] args) {
        System.out.println(perimeterSquare(10));
        System.out.println(areaSquare(10));
    }
}
