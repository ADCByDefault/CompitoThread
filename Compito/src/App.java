public class App {
    public static void main(String[] args) throws Exception {
        Semaforo semaforo = new Semaforo();
        Box box = new Box();
        Monoposto m1 = new Monoposto("fiat", "001", "cioimpo", semaforo, box);
        Monoposto m2 = new Monoposto("ferrari", "002", "chinga", semaforo, box);
        m2.start();
        m1.start();
        m1.join();
        m2.join();
        System.out.println("---- GARA TERMINATA ----");
    }
}
