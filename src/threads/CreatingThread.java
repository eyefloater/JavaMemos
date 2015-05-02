package threads;

public class CreatingThread {

	
	//creating a thread using Runnable
	public void threadTest(){
		new Thread(new Runnable() {

			@Override
			public void run() {

			}

		}).start();
		
	}
}
