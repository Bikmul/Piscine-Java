package Java.Piscine.day00.ex03;

import java.util.Scanner;

public class Program {
    private static final String WEEK_TITLE = "Week";
    private static final String EXIT = "42";
    static int WEEKS = 18;
     
    private static int summa(int a){
        int sum = (a/10000) + ((a/1000)%10) + ((a/100)%10) + ((a/10)%10) + (a%10);
        return sum;
    }
    private static String appendtoString(String str, int sum, int week) {
        String c = "=";
        str = str + WEEK_TITLE+ " " + Integer.toString(week);
        for(int i = 0; i < sum;i=i+5){
            str = str + c;
        }
        str = str + ">\n" ;
        return str;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = "";
        int sum;
        int weeknumber = 0;
        int weekn = 0;

        while(weeknumber < WEEKS){
            System.out.println("Введите неделю в формате - Week x: ");
            String i = scan.nextLine();
            if(i.startsWith(WEEK_TITLE)){
                i = i.replace(WEEK_TITLE, "").replace(" ", "");
                weeknumber = Integer.parseInt(i);
                // System.out.println(i);
                System.out.println("Введите в следующей стрке пять оценок до 9: ");
                String n = scan.nextLine();
                n = n.replace(" ", "");
                weekn = Integer.parseInt(n);
                sum = summa(weekn);
                str = appendtoString(str, sum, weeknumber);
                // System.out.println(sum);
            }
            else if(i.startsWith(EXIT)){
                break;
            }
            else{
                System.out.println("IllegalArgument");
                System.exit(-1);
            }
        }
        System.out.println("=============================\n" + str + "=============================");
        System.exit(0);
    }
}