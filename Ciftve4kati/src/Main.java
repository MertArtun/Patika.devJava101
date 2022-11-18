import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int toplam = 0,sayı;
        boolean x = true;
        Scanner inp = new Scanner(System.in);


        while (x){
            System.out.println("Bir sayı giriniz: ");
            sayı = inp.nextInt();
            if(sayı%2==1){
                System.out.printf("Girdiğiniz sayılar içerisinde 2 ye ve 4 tam bölünen sayıların toplamı:%d",toplam);
                break;
            }
            else if (sayı%4==0){
                toplam+=sayı;

            }
        }


    }
}