import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double result=0.0;
        Scanner inp = new Scanner(System.in);
        System.out.println("N değerini girniz: ");
        n = inp.nextInt();

        for(int i=1;i<=n;i++){
            result+=(1.0/i);

        }
        System.out.println(result);
    }
}