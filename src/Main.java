import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n=input.nextInt();
        System.out.println(n+" sayısının pozitif çarpanları: ");
        for (int i = 1; i <n ; i++) {
            if (n%i==0) {
                System.out.print(i + " ");
                total += i;
            }
        }
        System.out.println("");
        System.out.println(n+" sayısının pozitif çarpanlarının toplamı: "+total);
        if (n==total)
            System.out.println(n+" mükemmel sayıdır.");
        else
            System.err.println(n+" mükemmel sayı değildir.");
    }

}
