import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Lutfen Birbirinden Farkli 3 Sayi Giriniz !!! ");
        System.out.print("1. Sayiyi Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Sayiyi Giriniz : ");
        b = input.nextInt();
        System.out.print("3. Sayiyi Giriniz : ");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.print("1.Sayi < 2.Sayi < 3.Sayi");
            } else {
                System.out.print("1.Sayi < 3.Sayi < 2.Sayi");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.print("2.Sayi < 1.Sayi < 3.Sayi");
            } else {
                System.out.print("2.Sayi < 3.Sayi < 1.Sayi");
            }
        } else {
            if (a < b) {
                System.out.print("3.Sayi < 1.Sayi < 2.Sayi");
            } else {
                System.out.print("3.Sayi < 2.Sayi < 1.Sayi");
            }
        }
    }
}
