package daemon;

import java.io.IOException;

public class DarmonApp {
	public static void main(String[] args) {
		DaemonThread daemonThread = new DaemonThread();
		// 设置为守护线程
//		daemonThread.setDaemon(true);
		daemonThread.start();
		System.out.println("isDaemon = " + daemonThread.isDaemon());
		try {
			System.out.println("请输入结束:");
			System.in.read(); // 接受输入，使程序在此停顿，一旦接收到用户输入，main线程结束，守护线程自动结束
			System.out.println("main is fnish");
			 Runtime.getRuntime().exit(0);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}