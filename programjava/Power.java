package programjava;
public class Power {
    public static void main(String[] args) {
        int num = 5, p = 4;
        int powerOf = (int) Math.pow(num, p);
        System.out.print(num + "^" + p +" ="+powerOf);
    }
}