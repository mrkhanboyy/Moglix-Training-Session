package com.training.MultiThreading;

	public class ThreadPriorityDemo extends Thread {
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.getName() + ": " + i);
			}
		}
	
	public static void main(String args[]) {
			ThreadPriorityDemo pd1 = new ThreadPriorityDemo();
			ThreadPriorityDemo pd2 = new ThreadPriorityDemo();
	
			// setting priorities
			pd1.setPriority(Thread.MAX_PRIORITY - 2); // 8
			pd2.setPriority(Thread.MIN_PRIORITY + 2); // 3
	
			// setting the names
			pd1.setName("More"); // for 8 thread
			pd2.setName("Less"); // for 3 thread
	
			// to retrieve the priorities
			System.out.println("More Priority is " + pd1.getPriority()); // prints 8
	
			System.out.println("Less Priority is " + pd2.getPriority()); // prints 3
	
			pd2.start(); // Wontedly pd2 is started first
			pd1.start();
		}
	} // you can use join() method also
