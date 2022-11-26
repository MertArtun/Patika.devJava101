import java.util.Scanner;

public class Asalbul {



    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz: ");
        Scanner inp = new Scanner(System.in);
        int sayi = inp.nextInt();
        isAsal(sayi,2);


    }

    static boolean isAsal(int sayi,int i){
        if(i==0){
            System.out.println(sayi+"Asal sayıdır.");
            return true;
        }
        else if(sayi%i==0){
            System.out.println(sayi+"Asal sayı değildir.");
            return false;

        }
        return isAsal(sayi,i+1);
    }

}