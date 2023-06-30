package Java.Piscine.day01.ex01;
import java.util.UUID;

public class Transaction {
    private UUID uuid;
    private User sender;
    private User recipient;
    private int amount;
    private String type;

    public Transaction( User sender, User recipient, int amount) {
        uuid = UUID.randomUUID();
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }
    public int makeTransaction(String type){
        if(type.equals("DEBIT")){
            if (sender.getmoney() - amount < 0){
                System.out.println("No balance");
                return 0;
            }
            else{
                recipient.setmoney(recipient.getmoney()+amount);
                sender.setmoney(sender.getmoney()-amount);
                return 1;
            }
        }
        else if(type.equals("KREDIT")){
            if (recipient.getmoney() - amount < 0){
                System.out.println("No balance");
                return 0;
            }
            else{
                sender.setmoney(sender.getmoney()+amount);
                recipient.setmoney(recipient.getmoney() - amount);
                return 1;
            }
        }
        else
            return 0;
    }
    
    void setUuid(UUID uuid){
        this.uuid = uuid;
    }
    void setSender(User sender){
        this.sender = sender;
    }
    void setRecipient(User recipient){
        this.recipient = recipient;
    }
    void amount(int amount){
        this.amount = amount;
    }
    void type(String type){
        this.type = type;
    }
    User getSender(){
        return sender;
    }
    User getRecipient(){
        return recipient;
    }
    int getamount(){
        return  amount;
    }
    UUID getUuid(){
        return uuid;
    }
    String gettype(){
        return type;
    }
}
