package pipe.pipes;


public class SinglePipe extends AbstractPipe {
	
	private IPipe connection;
	
	@Override
	public void flow() {
		if(this.connection != null) {
			connection.push(flowable);
		}
	}

	public void connect(IPipe pipe) {
		connection = pipe;
	}

}
