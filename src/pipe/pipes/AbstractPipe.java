package pipe.pipes;

import pipe.Pipes;
import pipe.flows.IFlowable;

public abstract class AbstractPipe implements IPipe {

	protected IFlowable flowable;
	
	@Override
	public void push(IFlowable flowable) {
		this.flowable = flowable;
		Pipes.manager.add(this);
	}

}
