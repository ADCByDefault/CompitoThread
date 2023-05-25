public class Semaforo {
    
    
    /**
     * variabile int valore che contiene il valore del semaforo
     */
    private int valore;

    /**
     * funzione per inizializzare la classe e il valore e 1
     */
    public Semaforo(){
        valore = 1;
    }

    /**
     * syncronized per non far interrompere il blocco di codice
     * serve per fermare i thred quando il valore del semaforo è 0
     * e se il valore è 1 lo mette a 0 cosi altri non possono
     * accedre alla stessa risorsa
     */
    synchronized public void entra(){
        while(valore == 0){
            try{
                wait();
            }catch(Exception e){
                System.out.println("AHIA INCIDENTE NEL BOX");
            }
        }
        valore = 0;
    }
    /**
     * syncronized per non far interrompere il blocco di codice
     * quando un thread ha finito il valore del semaforo viene messo a 1
     */
    synchronized public void libera(){
        valore = 1;
        notify();
    }
}
