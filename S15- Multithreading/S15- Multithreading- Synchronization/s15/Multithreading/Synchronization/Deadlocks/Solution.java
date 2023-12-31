package s15.Multithreading.Synchronization.Deadlocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//there are some techniques we can use to prevent a deadlock
//we will see them here
public class Solution {

	public static void main(String[] args) {

		//firstly we want to use reentry locks as out lock structure
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				//secondly we could use some booleans to indicate the status of a lock
				//and try to lock and unlock using a try catch and finally block
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				//the loop will continue to try and use the locks if
				//initially unsuccesful
				while(true) {
					try {
						//trying to aquire the locks and waiting 10 miliseconds for it 
						//before timeout, if we dont wait the 10 milliseconds we could
						//acquire one lock and not the other lock causing a repeat
						//we can also prevent this by adding another flag
						//3 possibilities to account for in the finally block
						//1- Acquired lock 1, 2- Acquired lock 2, 3- Acquired both 
						//otherwise repeat the loop
						flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
						flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
					}catch(InterruptedException e){
						e.printStackTrace();
					}finally {
						if(flagLock1 && !doneFlag1) {
							System.out.println("Inside thread 1 on lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if(flagLock2 && !doneFlag2) {
							System.out.println("Inside thread 1 on lock 2");
							lock2.unlock();
							doneFlag2= true;
						}
						if(flagLock1 && flagLock2) {
							break;
						}
						
					}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;

				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while(true) {
					try {
						flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
						flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
					}catch(InterruptedException e){
						e.printStackTrace();
					}finally {
						if(flagLock2 && !doneFlag2) {
							System.out.println("Inside thread 2 on lock 2");
							lock1.unlock();
						}
						if(flagLock1 && !doneFlag1) {
							System.out.println("Inside thread 2 on lock 1");
							lock2.unlock();
						}
						if(flagLock1 && flagLock2) {
							break;
						}
						
					}
				}
			}
		});

		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("I am the main method");
	}

}