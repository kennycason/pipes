package pipe.pipes;


public class SingleStartPipe extends AbstractPipe implements IStartPipe {

	private IPipe next;

	@Override
	public void flow() {
		if(flowable != null && next != null) {
			next.push(flowable);
		}
	}

	public void connect(IPipe pipe) {
		next = pipe;
	}

}
