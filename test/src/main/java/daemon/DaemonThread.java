package daemon;
/**
 * 守护线程 说明：守护线程在没有用户线程可服务时自动离开
 * 此程序在启动后，守护线程一直在运行，当用户从键盘输入字符并按回车后，main线程结束，守护线程自动结束
 * 守护线程一般是为其他线程提供服务的，当其他线程结束时，守护线程没有服务的对象了，所以也就自动结束了生命周期
 * 
 * @author zhq
 * 
 */
public class DaemonThread extends Thread {
	
	public DaemonThread() {
	}

	/**
	 * 线程的run方法，它将和其他线程同时运行
	 */
	public void run() {
		while (true) {
			for (int i = 1; i <= 100; i++) {
				this.setSleep(200);
				System.out.println(i);
			}
			this.setSleep(2000);
		}
	}
	
	public void setSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}