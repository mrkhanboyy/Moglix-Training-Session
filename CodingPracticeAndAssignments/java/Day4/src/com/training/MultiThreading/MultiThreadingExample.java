package com.training.MultiThreading;


//class Multithreading extends Thread{
//	private static Object obj=new Object();
//	public void run() {
//		try {
//			System.out.println("Before Sleep");
//			Thread.sleep(4000);
//			System.out.println("Thread"+Thread.currentThread()+" ID"+Thread.currentThread().getId());
//			synchronized (obj) {
////				obj.wait();
//				System.out.println("After wait");
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//public class MultiThreadingExample {
//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {			
//			new Multithreading().start();
//		}
//	}
//}

//-------------------------------------------------------------------------

//
//class MyClass implements Runnable{
//
//	Thread t1;
//	private String name;
//	MyClass(String name){
//		this.name=name;
//	}
//	
//	@Override
//	public void run() {
//		System.out.println("Current Thread "+Thread.currentThread().getId());
//		for(int i=0;i<4;i++) {
//			System.out.println(i);
//			System.out.println(name);
//			try {
//				Thread.sleep(1000);
//			}
//			catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
//		
//	}
//
//	public void start() {
//		System.out.println("Start is called");
//		t1=new Thread(this,name);
//		
//	}
//	
//}
//
//
//public class MultiThreadingExample {
//	public static void main(String[] args) {
//		MyClass m1=new MyClass("Eshan");
//		m1.start();	
//		
//		Thread t1=new Thread(m1);
//		t1.start();
//			
//	}
//}



//----------------------------------------------------------------------------------------



class Counter extends Thread{

	Thread myThread;
	
	Counter(){
		super("Super thread");
		myThread=new Thread(this,"My running thread");
		System.out.println("My THread is created");
		start();
	}
	
	public void run()  {
		for (int i = 0; i < 10; i++) {
			System.out.println("Counter"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread is over");
	}
}

public class MultiThreadingExample {
	public static void main(String[] args) {
		Counter c1=new Counter();
		try {
			
			while(c1.isAlive()) {
				System.out.println("Main Thread will be alive till the child thread is live");
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main thread is over now");
	}
}


