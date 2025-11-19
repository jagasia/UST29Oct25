public class FibanocciGenerator{
	String name;
    private int limit;   // how many numbers to generate

    public FibanocciGenerator(String name, int limit) {
    	this.name=Thread.currentThread().getName();
        this.limit = limit;
    }

    
    public synchronized void generate(String tname) {
    	System.out.println(tname+" entered generate method now");
        try {
            long a = 0, b = 1;

            int j=0;
            while(j<10) {
            	System.out.println("while loop :"+tname+" j is "+j++);
            	Thread.sleep(1000);
            }
            
            System.out.println(tname+" going to enter the for loop now");
//            synchronized (this) {
                for (int i = 0; i < limit; i++) {
                    System.out.println(tname + ": " + a);

                    long next = a + b;
                    a = b;
                    b = next;
                    

                    Thread.sleep(1000);  // 1 second interval
                }
//			}

        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted");
        }
        System.out.println(tname+" exited generate method now");
    }
}
