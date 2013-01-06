package pipe.parallel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	
	private ExecutorService executor;
	
	private final int size;
	
	public ThreadPool(int size) {
		this.size = size;
		executor = Executors.newFixedThreadPool(size);
	}
	
	public void task(Runnable task) {
		executor.execute(task);
	}
	
	public int size() {
		return size;
	}

}
