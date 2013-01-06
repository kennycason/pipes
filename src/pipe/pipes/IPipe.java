package pipe.pipes;

import pipe.flows.IFlowable;

public interface IPipe {

	void push(IFlowable flowable);
	
	void flow();
	
}
