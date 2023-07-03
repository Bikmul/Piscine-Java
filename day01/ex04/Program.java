package Java.Piscine.day01.ex04;

public class Program {
    public static void main(String[] args) throws Exception {

    TransactionsService service = new TransactionsService();
    
    service.addUser("Kolya", 2500);
    service.addUser("Vasya", 10000);
    service.addUser("Amir", 50000);
    service.addUser("Gleb", 50000);
    service.addUser("Adolf ", 100000);
    service.addUser("Iosif", 100000);

    service.printallUsers();
    
    service.makeTransaction(3, 1, 1000, "DEBIT");
    service.makeTransaction(2, 1, 1000, "DEBIT"); 
    service.makeTransaction(1, 2, 1000,"DEBIT");
    service.makeTransaction(3, 0, 10000,"DEBIT");
    service.makeTransaction(2, 3, 20000,"DEBIT");

    service.makeTransaction(4, 2, 10000,"KREDIT");
    service.makeTransaction(5, 4, 50000,"KREDIT");

    service.getUserTransactions(4);
    service.getUserTransactions(2);
    service.getUserTransactions(5);

    service.printallTransactions();
    
    service.printallUsers();

    }
}
