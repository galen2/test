package lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	// 测试方法
		public static void main(String[] args) {
			Thread t1 = new  Thread(new T1());
			Thread t3 = new  Thread(new T3());
			t1.start();
			t3.start();
			
			Thread t11 = new  Thread(new T1());
			Thread t33 = new  Thread(new T3());
			t11.start();
			t33.start();
			
			Thread t111 = new  Thread(new T1());
			Thread t333 = new  Thread(new T3());
			t111.start();
			t333.start();
////			System.out.println("333");
//			final Walk walk = new Walk();
//			Thread r1 = new Thread(){
//				@Override
//				public void run() {
//					
//					//Walk walk = Walk.walk;
//					// 这里我依然用的new
//					
//					walk.test2();
//				}
//			};
//			Thread r2 = new Thread(){
//				@Override
//				public void run() {
//					//Walk walk = Walk.walk;
//					// 这里我依然用的new
//					
//					walk.test2();
//				}
//			};
//			r1.start();
//			r2.start();
	}

}
