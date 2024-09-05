package Controller;

public class controller extends Thread {
	private int threadID;
	
	public controller(int thread) {
		
	}

	@Override
	public void run() {
		int threadID = 0;
		this.threadID = threadID;
		System.out.println(threadID);
	}
}
