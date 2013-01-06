package pipe;

import pipe.flows.IntegerFlow;
import pipe.parallel.FlowManager;
import pipe.pipes.IStartPipe;
import pipe.pipes.OutputPipe;
import pipe.pipes.SingleFrictionPipe;
import pipe.pipes.SinglePipe;
import pipe.pipes.SingleStartPipe;
import pipe.pipes.YPipe;

public class Pipes {
	
	public static FlowManager manager;
	
	private IStartPipe start; // entry point into program;

	public static void main(String[] args) {
		Pipes pipe = new Pipes();
		pipe.setup();
		pipe.start();
	}
	
	public Pipes() {
		manager = new FlowManager();
		start = new SingleStartPipe();
	}
	
	public void setup() {
		YPipe ypipe = new YPipe();
		SingleFrictionPipe frictionPipe = new SingleFrictionPipe();
		SinglePipe single = new SinglePipe();
		OutputPipe out = new OutputPipe();
		
		single.connect(frictionPipe);
		ypipe.left(single);
		ypipe.right(out);
		
		frictionPipe.connect(ypipe);
		
		start.connect(frictionPipe);
		
		start.push(new IntegerFlow(5));
	}
	
	public void start() {
		while(!manager.empty()) {
			manager.manage();
		}
	}
	
}
