import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi istiyorsun: ");
        n = scan.nextInt();

        int list[]= new int [n];
        int duplicate[]= new int[list.length];
        int startIndex=0;
        for(int i = 0;i<n;i++){
            list[i]=scan.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i!=j)&&(list[i]==list[j])){
                    if(list[i] % 2 == 0){
                        duplicate[startIndex++]=list[i];
                    }
                }
            }

        }

        System.out.println(Arrays.toString(duplicate));

    }
}
