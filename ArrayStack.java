/* Blake Denniston
 * Kevin Quinn
 * CSE 373
 * 10/9/15
 * 
 * Homework 1 - SoundBlaster!
 * ArrayStack.java represents an array implementation of a stack.
 * It's public methods include isEmpty, push, pop and peek.
 */

import java.util.EmptyStackException;

public class ArrayStack implements DStack {
	public static final int DEFAULT_CAPACITY = 10;//default capacity of stack
	private double[] data;
	private int index;//marks the top of the stack, also the next spot in the
											//array waiting to be written to
	
	//constructs an empty stack with a size of the DEFAULT_CAPACTIY constant
	public ArrayStack() {
		data = new double[DEFAULT_CAPACITY];
		index = 0;
	}
	
	//returns true if the stack is empty, false if it is not empty
	public boolean isEmpty() {
		return index == 0;
	}

	//adds a double to the top of the stack
	//resizes the capacity to be twice as large if needed
	public void push(double d) {
		if(index >= data.length) {//array full
			resize();		
		}
		data[index] = d;
		index++;
	}
	
	//helper method
	//creates a new array with twice the length of the old one
	//and copies the values from the old array over
	private void resize() {
		double[] newData = new double[2 * data.length];
		for(int i = 0; i < index; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}
	
	//pre: throws an EmptyStackException if the stack is empty
	//   : when pop() is called
	//takes one value off of the top of the stack and returns it as a double
	//resizes the stack to be half it's original size if the array is 3/4 empty
	//or more
	public double pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		} else if (index <= data.length / 4) {
			double[] newData = new double[data.length / 2];	
			for(int i = 0; i < index; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		index--;
		return data[index];
	}
	//pre: throws an EmptyStackException if the stack is empty
	//   : when peek() is called
	//returns the double value on the top of the stack
	public double peek() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		} else {
			return data[index - 1];
		}
	}
}
