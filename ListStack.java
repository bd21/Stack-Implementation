/* Blake Denniston
 * Kevin Quinn
 * CSE 373
 * 10/9/15
 * 
 * Homework 1 - SoundBlaster!
 * ListStack.java represents an LinkedList implementation of a stack.
 * It's public methods include isEmpty, push, pop and peek.
 */

import java.util.EmptyStackException;

public class ListStack implements DStack {
	private ListStackNode front;
	
	//constructor which creates an empty stack
	public ListStack() {
		front = null;
	}
	
	//returns true if the stack is empty, false if it is not empty
	public boolean isEmpty() {
		return front == null;
	}

	//adds a double to the top of the stack
	public void push(double d) {
		ListStackNode newValue = front;
		front = new ListStackNode(d, newValue);
	}

	//pre: throws an EmptyStackException if the stack is empty
	//   : when pop() is called
	//removes and returns the double on the top of the stack
	public double pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		double result = front.data;
		front = front.next;
		return result;
	}

	//pre: throws an EmptyStackException if the stack is empty
	//   : when peek() is called
	//returns the double value on the top of the stack
	public double peek() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		return front.data;
	}

}
