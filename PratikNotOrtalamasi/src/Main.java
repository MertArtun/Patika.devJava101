
import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
        double toplam, sonuc;
        String S;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        Matematik = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        Fizik = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        Kimya = input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        Türkçe = input.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        Tarih = input.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        Müzik = input.nextInt();

        toplam= (Matematik+Fizik+Kimya+Tarih+Türkçe+Müzik);
        sonuc = toplam/6;

        S = sonuc>60? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
        System.out.println(S);



    }
}