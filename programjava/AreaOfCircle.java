package programjava;
/*
* Java program to calculate area of circle and radius of circle
* area of circle = 3.14 * r * r
* circumference of circle = 2 * 3.14 * r
    
    Let's Code

*/

public class AreaOfCircle {
    public static void main(String[] args) {
        int r = 10;
        double area = 3.14 * r * r;
        double cf = 2 * 3.14 * r;
        System.out.println("Area of circle= "+area);
        System.out.println("circumference of circle= "+cf);
    }
}