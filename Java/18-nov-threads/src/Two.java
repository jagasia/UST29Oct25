class Two implements Runnable{
	public void run(){
		for(int i=0;;i++){
			System.out.println(Thread.currentThread().getName()+"\t"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

