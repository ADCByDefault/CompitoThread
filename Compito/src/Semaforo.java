public class Semaforo {
    private int valore;

    public Semaforo(){
        valore = 2;
    }

    synchronized public void entra(){
        while(valore == 0){
            try{
                wait();
            }catch(Exception e){
                System.out.println("AHIA INCIDENTE NEL BOX");
            }
        }
        valore = valore -1;
    }

    synchronized public void libera(){
        valore = valore +1;
        notify();
    }
}
