public class Main {

    public static void main(String[] args) throws InterruptedException {
        Toy toy = new Toy();
        Bipedal vasyok = new Bipedal(toy);

	    Thread toyThread = new Thread(null, toy::checkOn,"Игрушка");
        Thread vasyaThread = new Thread(null, vasyok::turnOn, "Васёк");

        toyThread.start();
        vasyaThread.start();
        vasyaThread.join();
        toyThread.interrupt();
    }
}
