/**
*@author Federico Cassieri 
*@version 1.0
*
*<p> 
*Thread che simula la fase di stanpa delle pagine del libro.
<\p>
*/
public class ThreadStampaPagine extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Stampa pagine 0%");
            sleep(500);

            System.out.println("Stampa pagine 50%");
            sleep(500);

            System.out.println("Stampa pagine 100%");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
