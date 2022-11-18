import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s,k;
        int total=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Üssünü almak istediğiniz sayıyı giriniz: ");
        s = inp.nextInt();
        System.out.println("Kaçıncı kuvvetini almak istiyorsun?");
        k = inp.nextInt();

        for(int i=1;k>=i;i++){
            total*=s;
        }
        System.out.println(total);



    }
}