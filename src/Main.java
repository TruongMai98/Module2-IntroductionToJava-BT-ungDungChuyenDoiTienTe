import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap so tien usd ");
        usd = scanner.nextDouble();
        double convert = usd * vnd;
        System.out.println("gia tri vnd la " + convert);
    }
}