import java.util.Scanner;

public class Main {


    static int i, temp, exponent,result=1;

    public static void main(String[] args) {

        System.out.println("Sonuc : "+usHesaplama(temp));
    }


    static int usHesaplama(int x) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Taban degerini giriniz: ");
        temp=scan.nextInt();
        System.out.println("Us degerini giriniz: ");
        exponent=scan.nextInt();


        for (i = 0; i < exponent; i++) {
            result*= temp;
        }

        return result;
    }
}