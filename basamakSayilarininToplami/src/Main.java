import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        int sayı,a,toplam=0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayı = inp.nextInt();

        while(sayı!=0){
            a=sayı%10;
            toplam+=a;
            sayı=sayı/10;

        }
        System.out.println("Girdiğiniz Sayıların Basamakları Toplamı: "+toplam);
    }
}