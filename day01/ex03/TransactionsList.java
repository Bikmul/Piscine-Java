package Java.Piscine.day01.ex03;
import java.util.UUID;

public interface TransactionsList {
    public void add(Transaction transaction);
    public void removebyuuid(UUID id) throws Exception;
    public Transaction[] toarray();
    public void printer();
}
