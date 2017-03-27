package lock;

import java.util.concurrent.locks.ReentrantLock;

public class Walk {
	public static int num = 100;
	public static Object walk = new Object();
	// 静态
	public    int run(){
//		synchronized (walk) {
			int i = 0;
			while (i < 10) {
				try {
					num --;
					i++;
					System.out.println(Thread.currentThread().getName()+":"+num);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return num ;
//		}
	}
	// 非静态
	public  synchronized int  walk(){
			int i = 0;
			while (i < 10) {
				try {
					num --;
					i++;
					System.out.println(Thread.currentThread().getName()+":"+num);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return num ;
	}
	
	static ReentrantLock lock = new ReentrantLock(true);
	
	public  static void test2(){
		
//		synchronized (walk.getClass()) 
//		{
			int i = 0;
			while (i < 5) {
				try {
					num --;
					i++;
					System.out.println(Thread.currentThread().getName()+":"+num);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
//		}
			System.out.println(Thread.currentThread().getName()+"begin print");
//		lock.lock();
		print();
//		lock.unlock();
	}
	
	public synchronized static void print(){
		int i = 0;
		while (i < 5) {
			try {
				num --;
				i++;
				System.out.println(Thread.currentThread().getName()+":print"+num);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
