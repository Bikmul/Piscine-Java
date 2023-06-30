package Java.Piscine.day00.ex05;
import java.util.Scanner;

public class Program {
    private static final Scanner scan = new Scanner(System.in);

    public static void print_table(String[] Students, String[] timelesson, int[][] graph){
        System.out.print('\t');
        for(int i=0; i< timelesson.length;i++){
            System.out.printf("%-4s",String.join("", timelesson[i]));
            System.out.print('|');
        }
        System.out.println("");
        for(int i=0; i< Students.length; i++){
            System.out.printf("%-8s",(String.join("", Students[i])));
            for(int j = 0; j < Students.length; j++){ 
                System.out.printf("%-4s", graph[i][j]);
                System.out.print('|');
            }
            System.out.println("");
        }
    }
    public static String[] Studentparser()
    {
        System.out.println("Введите студентов");
        String[] Students = new String[10];
        for(int i = 0; i< 10; i++){
            String line = scan.nextLine().replace("\n", "").replace(" ", "");
            if(line.startsWith("."))
                break;
            Students[i] = line;
        }
        return Students;
    }
    public static int[][] attendance(String[] timelesson, String[] students){
        int[][] attendance = new int[students.length][timelesson.length+1];
        System.out.println("Введите ученика, дату и присутствие(HERE/ NOT HERE) через пробел");
        scan.reset();
        for(int i = 0; i < students.length;i++){
            String[] newline = scan.nextLine().split(" ");
            if(String.join("", newline[0]).equals(".")){
                break;
            }
            int b = 10;
            int a = 10;
            for(int j = 0; j < students.length;j++){
                if(String.join("", newline[0]).equals(String.join("", students[j])))///////нашли студента
                    a = j;
                if(String.join("", newline[1]).equals(String.join("", timelesson[j])))///////нашли дату
                    b = j;
            }
            if(String.join("", newline[2]).equals("HERE") && a!=10 && b !=10)
                attendance[a][b] = 1;
            else if(a!=10 && b !=10)
                attendance[a][b] = -1;
        }
        return attendance;
    }


    public static void main(String[] args){
        String[] Stud = new String[10];
        Stud = Studentparser();

        System.out.println("Введите дату занятия и день недели ");
        String[] timelesson = new String[10];
        String[] namelesson = new String[10];
        for(int i = 0; i< 10; i++){
            String[] line1 = scan.nextLine().split(" ");
            if(String.join("", line1[0]).equals(".")){
                break;
            }
            timelesson[i] = String.join("", line1[0]);
            namelesson[i] = String.join("", line1[1]);
        }
        int[][] graph = attendance(timelesson, Stud);
        print_table(Stud, timelesson, graph);
        System.exit(0);
    }
}
