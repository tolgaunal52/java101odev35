import java.util.Scanner;
/**
 * usluSayi
 */
public class odev35 {

    static int result = 1;
    static int ss(int a, int b){
        if (a == 0){
            return 1;
        }

        result *= b;
        ss(a-1,b);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Tabandaki sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("Usteki sayiyi giriniz: ");
        b = input.nextInt();
        System.out.println("Sonuç : ");
        System.out.println(ss(a,b));
    }
}