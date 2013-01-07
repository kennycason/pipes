package pipe.pipes;

import pipe.flows.NumberFlow;


public class PixelOutputPipe extends AbstractPipe {
	
	private int x;
	
	private int y;
	
	public PixelOutputPipe(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void flow() {
		if(flowable instanceof NumberFlow) {
			Integer i = ((Double)flowable.value()).intValue();
			if(i > 0) {
				System.out.println("(" + ((i >> 16) & 0xFF) + ", " + ((i >> 8) & 0xFF) + ", " + (i & 0xFF) + ")");
			}
		}
	}

	public void connect(IPipe pipe) {
		
	}

}
