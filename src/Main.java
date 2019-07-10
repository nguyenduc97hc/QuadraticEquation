import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //code below here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();

        GiaiPhuongTrinh giaiPhuongTrinh = new GiaiPhuongTrinh(a,b,c);
        if(giaiPhuongTrinh.getDiscriminant()>=0) {
            System.out.println("Nghiem 2: " + giaiPhuongTrinh.getRoot1());
            System.out.println("Nghiem 1: " + giaiPhuongTrinh.getRoot2());
        }
        else System.out.println("The equation has no roots");
    }
}
