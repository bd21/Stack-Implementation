/* Blake Denniston
 * Kevin Quinn
 * CSE 373
 * 10/9/15
 * 
 * Homework 1 - SoundBlaster!
 * ListStackNode.java represents a single node of the LinkedList implementation
 * of the ListStack class.  It has two constructors and fields for the double
 * stored and the next node it points toward.
 */
public class ListStackNode {
	public double data;
	public ListStackNode next;
	
	public ListStackNode(double data) {
		this(data, null);
	}
	public ListStackNode(double data, ListStackNode next) {
		this.data = data;
		this.next = next;
	}
	
}