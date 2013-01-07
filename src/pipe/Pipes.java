package pipe;

import pipe.flows.NumberFlow;
import pipe.parallel.FlowManager;
import pipe.pipes.IStartPipe;
import pipe.pipes.OutputPipe;
import pipe.pipes.PixelOutputPipe;
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
		YPipe ypipe2 = new YPipe();
		OutputPipe out = new OutputPipe();
		PixelOutputPipe out2 = new PixelOutputPipe(0, 0);
		ypipe2.left(out);
		ypipe2.right(out2);
		
		single.connect(frictionPipe);
		ypipe.left(single);
		ypipe.right(ypipe2);
		
		frictionPipe.connect(ypipe);
		start.connect(frictionPipe);
		start.push(new NumberFlow(5.0));
	}
	
	public void start() {
		while(!manager.empty()) {
			manager.manage();
		}
	}
	
}
