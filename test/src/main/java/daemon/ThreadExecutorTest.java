package daemon;

import java.io.IOException;
import java.util.concurrent.Executors;

public class ThreadExecutorTest {
	java.util.concurrent.ExecutorService executor = Executors.newFixedThreadPool(4);

	public void thread(){
		DaemonThread thread = new DaemonThread();
//		executor.shutdownNow();
		thread.setDaemon(true);
		executor.execute(thread);
		
		try {
			System.out.println("请输入");
			System.in.read();
			System.out.println("main is fnish");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ThreadExecutorTest test = new ThreadExecutorTest();
		test.thread();
	}
}
