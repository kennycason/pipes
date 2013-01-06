package pipe.pipes;


public class OutputPipe extends AbstractPipe {

	@Override
	public void flow() {
		System.out.println(flowable.value());
	}

	public void connect(IPipe pipe) {
		
	}

}
