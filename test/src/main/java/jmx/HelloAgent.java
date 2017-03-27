package jmx;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public class HelloAgent {

	Hello helloBean = new Hello();
	MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
	public void init() {
		try {
			ObjectName helloName = new ObjectName("FOO:name=HelloBean");
			mbs.registerMBean(helloBean, helloName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void waitForEnterPressed() {
		try {
			InputStream in = System.in;
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader bufr = new BufferedReader(isr);
			while (true) {
				System.out.println("Press  to continue:");
				String str = bufr.readLine();
				System.out.println("input value is:" + str);
				helloBean.setMessage(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String argv[]) {
		HelloAgent agent = new HelloAgent();
		agent.init();
		System.out.println("SimpleAgent is running...");
		agent.waitForEnterPressed();
	}

}
