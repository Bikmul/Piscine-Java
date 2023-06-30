package Java.Piscine.day01.ex00;

public class Program {
    public static void main(String[] args){
    User Kolya = new User(0, "Kolya", 2500);
    User Vasya = new User(1, "Vasya", 10000);
    Transaction first = new Transaction(Kolya, Vasya, 1000);
    
    Kolya.Printinfo();
    Vasya.Printinfo();
    first.makeTransaction("DEBIT"); 
    Kolya.Printinfo();
    Vasya.Printinfo();
    }
}
