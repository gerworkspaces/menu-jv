package ShapeCalculateMenu;

public class Circle {
    public static final float _SO_PI = 3.14f;

    public static float perimeterCircle(float r){
        return 2 * r * _SO_PI;
    }
    public static float areaCircle(float r){
        return _SO_PI * r * r;
    }
    public static void main(String[] args) {
        System.out.println("Area:\t" + areaCircle(10));
        System.out.println("Perimeter:\t" + perimeterCircle(20));
    }
}
