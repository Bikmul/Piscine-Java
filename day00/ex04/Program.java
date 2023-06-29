package Java.Piscine.day00.ex04;
import java.util.Scanner;

public class Program {
    private static void swapint(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    private static void swapchar(char[] array, int ind1, int ind2) {
        char tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }  
    private static void printer(char[] chars, int[] ints)
    {
        char rechar[] = new char[chars.length];
        int reint[] = new int[ints.length];
        int n = 0;
        for(int i = ints.length - 1; i >= 0; i--){
            int flag = 0;
            for(int j = ints.length - 1; j >= i;j--){
                if(chars[j] == chars[i] && i != j)
                    flag = 1;
            }
            if(flag == 0){
                rechar[n] = chars[i];
                reint[n] = ints[i];
                n++;
            }
        }
        for (int i = 1; i < reint.length; i++) {
            if (reint[i] > reint[i - 1]) {
                swapint(reint, i, i-1);
                swapchar(rechar, i, i-1);
            }
        }
        for(int j = reint.length - 1; j >= 1;j--){
            if (reint[j] > reint[j - 1]) {
                swapint(reint, j, j-1);
                swapchar(rechar, j, j-1);
	        }
        }
        for(int i = 0; i < rechar.length; i++) {
            if(i == 10)
                break;
            for(int j = i; j != 0;j--)
                System.out.print("# ");
            System.out.println(reint[i]+ " ");
        }
        for(int i = 0; i < rechar.length; i++){
            if(i == 10)
                break;
            if (rechar[i] == '\n')
                System.out.print("/ ");
            else if (rechar[i] == ' ')
                System.out.print("_ ");
            else
                System.out.print(rechar[i] + " ");
        }
    }
    public static int counter(char[] a, char b){
        int n = 0;
        for(int i = 0;i<a.length;i++){
            if (a[i] == b){
                n++;
            }
        }
        return n;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);    
        System.out.println("Введите шифр");
        String line = scan.nextLine();
        char[] arr = line.toCharArray();
        int[] ints = new int[arr.length];
        char[] chars = new char[arr.length];

        for(int i = 0;i<arr.length;i++){
            chars[i] = arr[i];
            ints[i] = counter(arr, arr[i]);
        }
        printer(chars, ints);
        if(scan!=null)
            scan.close();
        System.exit(0);
    }
}