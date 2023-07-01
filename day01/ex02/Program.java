package Java.Piscine.day01.ex02;

public class Program {
    public static void main(String[] args) throws Exception {
    User Kolya = new User( "Kolya", 2500);
    User Vasya = new User( "Vasya", 10000);
    User Amir  = new User( "Amir", 50000);
    User Gleb  =new User( "Gleb", 50000);
    UsersList list = new UsersList();
    list.add(Kolya);
    list.add(Vasya);
    list.add(Gleb);
    list.add(Amir);
    Transaction first = new Transaction(Kolya, Vasya, 1000);
    Transaction second = new Transaction(Amir,Gleb,  10000);
    System.out.println(list.getamount());
    System.out.println(list.findbyid(3).getname());
    System.out.println(list.findbyindex(3).getname());
    first.makeTransaction("DEBIT");
    second.makeTransaction("DEBIT");
    list.printer();
    }
}
