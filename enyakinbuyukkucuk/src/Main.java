import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int arr[]={1,3,67,-12,-32,290};
     Scanner inp=new Scanner(System.in);
     int number,min=arr[0], max=arr[0];

     System.out.println("Lütfen Bir Sayı Giriniz: ");
     number=inp.nextInt();
     int Arr[]={1,3,67,-12,-32,290,number};
     Arrays.sort(Arr);
     min=Arr[Arrays.binarySearch(Arr,number)-1];
     max=Arr[Arrays.binarySearch(Arr,number)+1];

        System.out.println("En küçük: "+min);
        System.out.println("En büyük: "+max);

    }
}