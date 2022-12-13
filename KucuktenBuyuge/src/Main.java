import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi istiyorsunu:  ");
        n= inp.nextInt();
        int list[]= new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz: ");
        for (int i=0;i<n;i++){
            System.out.println(i+".Elemanı: ");
            list[i]=inp.nextInt();
        }

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));



    }
}