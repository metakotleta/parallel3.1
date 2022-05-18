public class Toy {
    private volatile boolean switcher;
    private boolean runningFlag = true;

    public void checkOn() {
        while (runningFlag) {
            if (switcher) {
                System.out.printf("%s выключает тумблер\n", Thread.currentThread().getName());
                switcher = false;
            }
        }
    }

    public void switchOn() {
        switcher = true;
    }

    public boolean getState() {
        return switcher;
    }

    public void stopThread() {
        runningFlag = false;
    }

}
