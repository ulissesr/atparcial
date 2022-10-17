import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo();

            for (int i=0; i<10; i++){
                System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
            }

    }
}