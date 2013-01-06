package pipe.parallel;

import java.util.concurrent.ConcurrentLinkedQueue;

import pipe.pipes.IPipe;

public class FlowManager {

	private ConcurrentLinkedQueue<IPipe> flows;
	
	public FlowManager() {
		flows = new ConcurrentLinkedQueue<IPipe>();
	}
	
	public void manage() {
		IPipe pipe = flows.poll();
		System.out.println(pipe);
		pipe.flow();
	}
	
	public void add(IPipe pipe) {
		flows.add(pipe);
	}
	
	public boolean empty() {
		return flows.size() == 0;
	}
	
}
