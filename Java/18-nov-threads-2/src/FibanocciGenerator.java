public class FibanocciGenerator extends Thread {

    private int limit;   // how many numbers to generate

    public FibanocciGenerator(String name, int limit) {
        super(name);     // set thread name
        this.limit = limit;
    }

    @Override
    public void run() {
        try {
            long a = 0, b = 1;

            for (int i = 0; i < limit; i++) {
                System.out.println(getName() + ": " + a);

                long next = a + b;
                a = b;
                b = next;

                Thread.sleep(1000);  // 1 second interval
            }

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted");
        }
    }
}
