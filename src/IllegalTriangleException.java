import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter a:");
        a = scanner.nextInt();
        System.out.println(" enter b:");
        b = scanner.nextInt();
        System.out.println("enter c:");
        c = scanner.nextInt();
        System.out.println("enter c:");



        try {
            if (a<=0 || b<=0 || c<=0 || a+b<=c|| a+c<=b|| b+c<=a) {
                int temp =0/0;
            }else {
                System.out.println("nhap vao 3 canh cua tam giac la :" + a + " " + b + " " + c);

            }

        } catch (Exception n) {

            System.out.println("ngoai le ");
        }
    }
}

