import java.util.ArrayList;
import java.util.Scanner;

public class ProduzioneLibro{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int nLibri= 0;

        ThreadStampaPagine stampa;
        ThreadRilegatura rilegatura;

        ArrayList<Thread> libro;

        //input numero libri
        do{
            System.out.println("Quanti libri vuoi produrre?");
            nLibri = scanner.nextInt();

            if (nLibri < 1)
                System.out.println("devi produrre almeno un libro");
        } while (nLibri < 1);

        //Produzione
        for(int i=0; i<nLibri; i++){
            libro= new ArrayList<>();

            stampa= new ThreadStampaPagine();
            libro.add(stampa);

            rilegatura= new ThreadRilegatura();
            libro.add(rilegatura);

            //Avvio thread
            for(Thread t: libro){
                t.start();
            }
            //join dei thread
            for(Thread t: libro){
                try{
                    t.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                System.out.println("\nAssemblaggio del libro numero "+ (i + 1));
            System.out.println("produzione dei libri terminata.");
        }
    }
}

