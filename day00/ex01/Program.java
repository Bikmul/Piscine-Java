package Java.Piscine.day00.ex01;

import java.util.Scanner;
public class Program {
    public static boolean bol(int a) {
        int i = 2;
        while(i*i<a){
            if(a % i != 0){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static int iter(int a) {
        int iter = 1;
        int i = 2;
        while(i*i < a){
            if(a % i != 0){
                iter++;
                i++;
            }
            else{
                 break;
            }
        }
        return iter;
    }
    public static void main(String[] args){
        int i;
        int iter = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите число: ");
        i = scan.nextInt();
        if (i > 1){
            iter = iter(i);
            if(bol(i)){
                System.out.println("False: " + iter);
            }
            else{
                System.out.println("True: " + iter);
            }
        }
        else{
            System.out.println("IllegalArgument");
        }
        System.exit(0);
    }
}