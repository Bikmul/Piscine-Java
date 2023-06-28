package Java.Piscine.day00.ex02;
import java.util.Scanner;

public class Program {
    public static int calc(int a) {
        int sum = 0;

        while(a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static boolean bol(int a) {
        int i = 2;
        while((i*i)-1<a){
            if(a % i != 0){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int i;
        int count = 0;
        do{
            i = scan.nextInt();
            if(!bol(calc(i))) {
                count++;
            }
            // System.out.println(calc(i));
            // System.out.println(bol(calc(i)));            
        }
        while(i != 42);
        System.out.println("Count of coffee request - " + count);
        System.exit(0);
    }
}
