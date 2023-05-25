public class App {
    public static void main(String[] args) throws Exception {
        Semaforo semaforo = new Semaforo();
        Box box = new Box();
        Monoposto m1 = new Monoposto("fiat", "001", "cioimpo", semaforo, box);
        Monoposto m2 = new Monoposto("ferrari", "002", "chinga", semaforo, box);
        Monoposto m3 = new Monoposto("Ducati", "003", "Jasir", semaforo, box);
        m2.start();
        m1.start();
        m3.start();
        m1.join();
        m2.join();
        m3.join();
        System.out.println("---- GARA TERMINATA ----");
    }
}
