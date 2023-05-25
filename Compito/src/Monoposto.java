public class Monoposto extends Thread{
    private String scuderia;
    private String id;
    private String pilota;
    private Semaforo semaforo;
    private Box box;
    private int giri;

    public Monoposto(String scuderia, String id, String pilota, Semaforo semaforo, Box box){
        this.scuderia = scuderia;
        this.id = id;
        this.pilota = pilota;
        this.semaforo = semaforo;
        this.box = box;
        giri = 10;
    }

    @Override
    public void run() {
        try{
            for(int i = 1; i <= giri; i++){
                System.out.println(pilota + " inizia il giro " + i);
                int t = (int) ((Math.random() * 3 + 1) * 1000);
                sleep(t);
                System.out.println(pilota + " finisce il giro " + i);
                if(i % 3 == 0){
                    semaforo.entra();
                    box.usa(pilota);
                    t = (int) ((Math.random() * 4 + 1) * 1000);
                    sleep(t);
                    box.lascia(pilota);
                    semaforo.libera();
                }
                
            }
        }catch(Exception e){
            System.out.println("errore");
        }
    } 
}