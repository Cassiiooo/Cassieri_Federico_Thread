/**
*@author Federico Cassieri 
*@version 1.0
*
*<p> 
*Thread che simula la fase di rilegatura del libro.
<\p>
*/
public class ThreadRilegatura extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Rilegatura: 0%");
            sleep(600);

            System.out.println("Rilegatura: 50%");
            sleep(600);

            System.out.println("Rilegatura: 100%");

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
