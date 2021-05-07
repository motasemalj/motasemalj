public class Clock implements Runnable {


	private static Clock inst = null;
	
	 private Clock(){
		Thread t = new Thread(this);
		t.start();
	}
	
	 public static Clock getInstance()
	    {
			if (inst == null)
	        	inst = new Clock();
	  
	        return inst;
	    }

	public void run() {

		int count = 0;
		
		System.out.println("\n-- 3 minute timer started! --\n");

		while (true) {
			try {
				Thread.sleep(1000);	
				count++;				
				if(count == 30) {
				 System.out.println("\n-- 30 seconds have passed! --\n");
				} else if (count == 60) {
					 System.out.println("\n-- 1 minute has passed! --\n");
				} else if (count == 90) {
					 System.out.println("\n-- 1 minute and 30 seconds have passed! --\n");
				} else if (count == 120) {
					 System.out.println("\n-- 2 minutes have passed! --\n");
				} else if (count == 150) {
					 System.out.println("\n-- 2 minutes and 30 seconds have passed! --\n");
				} else if (count == 180) {
					 System.out.println("\n3 minutes passed...Hide map contents before you get caught!\n");
				} else if (count == 190) {
					System.out.println("\nVoldemort has caught you... \nThe end.. ");
					System.exit(1);
				}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}