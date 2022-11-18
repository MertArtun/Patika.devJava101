import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ortalama;
        int sayi;
        int sayisayisi = 0,toplam=0;

        Scanner inp = new Scanner(System.in);


        System.out.print("Bir Sayı Giriniz: ");
        sayi = inp.nextInt();

        for(int i=1;sayi>=i;i++){
            if(i%4==0 && i%3==0){
                sayisayisi+=1;
                toplam+=i;

            }

        }
        ortalama=toplam/sayisayisi;
        System.out.println(ortalama);

    }
}

