package Java.Piscine.day02.ex02;
import java.io.IOException;

public class HandlingWrongPath extends IOException {
    @Override
    public String toString() {
        return new String ("Error: Wrong Path");
    }
}
