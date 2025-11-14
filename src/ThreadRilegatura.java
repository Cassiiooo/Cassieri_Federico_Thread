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
