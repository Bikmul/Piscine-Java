

public class Program {
    public static void main(String[] args) {
        int n = 479598;
        
        int number = (n/100000) + ((n/10000)%10) + ((n/1000)%10) + ((n/100)%10)  + ((n/10)%10) + (n%10);
        System.out.println(number);
        System.exit(0);
    }
}