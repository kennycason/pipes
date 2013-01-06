package pipe.flows;

public class IntegerFlow implements IFlowable {

	private Integer value;
	
	public IntegerFlow(int value) {
		this.value = value;
	}
	
	@Override
	public Object value() {
		return value;
	}

	@Override
	public void value(Object value) {
		this.value = (Integer)value;
	}

}
