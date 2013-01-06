package pipe.pipes;


public class YPipe extends AbstractPipe {
	
	private IPipe left;
	
	private IPipe right;
	
	@Override
	public void flow() {
		if(this.left != null) {
			left.push(flowable);
		}
		if(this.right != null) {
			right.push(flowable);
		}
	}

	public void left(IPipe pipe) {
		left = pipe;
	}
	
	public void right(IPipe pipe) {
		right = pipe;
	}
	
}
