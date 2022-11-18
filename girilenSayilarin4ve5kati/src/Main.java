import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      int sayı;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sınır Sayısını giriniz: ");
        sayı=inp.nextInt();

        for(int i=1;i<=sayı;i*=4){
            System.out.println(i);

        }

        for(int j=1;j<=sayı;j*=5){
            System.out.println(j);
        }



    }
}