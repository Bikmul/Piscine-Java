package Java.Piscine.day01.ex01;

public class Program {
    public static void main(String[] args){
    User Kolya = new User( "Kolya", 2500);
    User Vasya = new User( "Vasya", 10000);
    User Amir  = new User( "Amir", 50000);
    User Gleb  =new User( "Gleb", 50000);
    Transaction first = new Transaction(Kolya, Vasya, 1000);
    Transaction second = new Transaction(Amir,Gleb,  10000);
    Kolya.Printinfo();
    Vasya.Printinfo();
    first.makeTransaction("DEBIT");
    Kolya.Printinfo();
    Vasya.Printinfo();
    second.makeTransaction("DEBIT");
    Amir.Printinfo();
    Gleb.Printinfo();
    }
}
