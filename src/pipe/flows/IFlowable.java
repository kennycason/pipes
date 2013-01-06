package pipe.flows;


/**
 * Representation of content that can flow through and {@link pipe.pipes.IPipe}
 * @author Kenny Cason
 *
 */
public interface IFlowable {
	
	Object value();
	
	void value(Object value);
	
}
