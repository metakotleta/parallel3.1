public class Bipedal {
    private static final long SLEEP = 3000;
    private static final long COUNT = 3000;
    private Toy toy;

    public Bipedal(Toy toy) {
        this.toy = toy;
    }

    public void turnOn() {
        for (int i = 0; i < COUNT; i++) {
            try {
                Thread.sleep(SLEEP);
                if (!toy.getState()) {
                    System.out.printf("%s включает тумблер\n", Thread.currentThread().getName());
                    toy.switchOn();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
