import java.util.Scanner;

class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a%100;
        a=b%10;
        b=b-a;
        b=b/10;
        System.out.println(b);

    }
}