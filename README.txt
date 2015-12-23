1. I had a test file which was composed of 11 lines of music so that the resize function was called once.  I checked the values by hand for each implementation.  I wrote another testing file to test what happens when push or pop were called when the stack was empty, and it threw the correct EmptyStackException.  See #6 for more answers about testing.

2. "The scent of bitter almonds always reminded him of the fate of unrequited love."

3. 17 times.  The default capacity is 10 for the array.  It takes 10 to be doubled 17 times to reach over one million.  10 * 2^17 = 1,310,720. 
27 times for 1 billion. 10 * 2^27 = 1,342,177,280
37 times for 1 trillion. 10 * 2^37 = 1,374,389,534,720

4. It would not be very efficient, but here we go.  There are two queues, Q1 and Q2
push - very efficient
	enqueue in Q1
pop - less efficient
	while Q1.size() > 1 {
		Q2.enqueue(Q1.dequeue)
	}
	variable  = Q1.dequeue()
	rename Q2 as Q1
	return variable

5. It was O(1) to push but O(n) to pop and took up little space, where as with the array implementation of the stack took up more space because it had to keep track of where in the array we are.  The double queue implementation of stack could be also made so that push was O(n) and pop was O(1).  Overall, I would choose the array implementation because the space tradeoff is worth the faster runtime.

6. Regarding the first extra credit point - I basically said that when the index (the spot of the array currently waiting to be written to) was less than a quarter of the size that the array size would be halved.  To test this I had each pop and push and resize function write to the console what was going on, and I could see from the log that resizing up and down were happening at the correct places.

7. I liked that this assignment was relatively well thought out and easy enough to follow.  I did not enjoy trying to figure out sox's command line interface.  I could have done the Karplus Strong algorithm better - I worked for hours on it but I could never get it to actually produce sound when compiled into a .wav.

8.  I have nothing else I would like to include.