package pipe.flows;

public class NumberFlow implements IFlowable {

	private Double value;
	
	public NumberFlow(Double value) {
		this.value = value;
	}
	
	@Override
	public Object value() {
		return value;
	}

	@Override
	public void value(Object value) {
		this.value = (Double)value;
	}

}
