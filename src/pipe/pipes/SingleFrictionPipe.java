package pipe.pipes;

import pipe.flows.IntegerFlow;


public class SingleFrictionPipe extends AbstractPipe {
	
	private IPipe connection;
	
	@Override
	public void flow() {
		if(this.connection != null) {
			if(flowable instanceof IntegerFlow) {
				Integer i = (Integer) flowable.value();
				if(i > 0) {
					flowable.value(i - 1);
					connection.push(flowable);
				}
			}
		}
	}

	public void connect(IPipe pipe) {
		connection = pipe;
	}

}
