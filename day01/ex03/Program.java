package Java.Piscine.day01.ex03;

public class Program {
    public static void main(String[] args) throws Exception {
    User Kolya = new User( "Kolya", 2500);
    User Vasya = new User( "Vasya", 10000);
    User Amir  = new User( "Amir", 50000);
    User Gleb  =new User( "Gleb", 50000);
    UsersList list = new UsersList();
    TransactionsLinkedList Fulllist = new TransactionsLinkedList();
    list.add(Kolya);
    list.add(Vasya);
    list.add(Gleb);
    list.add(Amir);
    Transaction first = new Transaction(Kolya, Vasya, 1000);
    Transaction second = new Transaction(Amir,Gleb,  10000);
    Transaction third = new Transaction(Amir,Gleb,  25000);
    first.makeTransaction("DEBIT");
    second.makeTransaction("DEBIT");
    third.makeTransaction("KREDIT");
    Fulllist.add(first);
    Fulllist.add(second);
    Fulllist.add(third);
    Fulllist.printer();
    list.printer();
    Amir.addtoList(third);
    Amir.addtoList(second);
    Amir.printlistofTrans();
    }
}
