import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Üçgenin Alanını Hesaplamak İçin Aşağıya Değerleri Girin...");


        double a, b, c,ucgencevre, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("A Kenarının Uzunluğunu Giriniz :");
        a = input.nextDouble();
        System.out.print("B Kenarının Uzunluğunu Giriniz :");
        b = input.nextDouble();
        System.out.print("C Kenarının Uzunluğunu Giriniz :");
        c = input.nextDouble();

        ucgencevre = (a + b + c);


        alan = Math.sqrt( (ucgencevre/2)*((ucgencevre/2) - a)*((ucgencevre/2) - b)*((ucgencevre/2) - c));

        System.out.println("");
        System.out.println("Üçgenin Çevresi : " + ucgencevre);
        System.out.println("Üçgenin Alanı   : " + alan);

    }
}