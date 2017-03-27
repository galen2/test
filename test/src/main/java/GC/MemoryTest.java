package GC;

import java.util.HashMap;
import java.util.Map;

public class MemoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.gc();
		long total = Runtime.getRuntime().totalMemory(); // byte
		long m1 = Runtime.getRuntime().freeMemory();
		System.out.println("before:" + (total - m1));
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("2", "3");
//		for(int i=0; i < 100; i++){
//			map.put(new Object(), new Object());
//		}
		long total1 = Runtime.getRuntime().totalMemory();
		long m2 = Runtime.getRuntime().freeMemory();
		System.out.println("after:" + (total1 - m2));
		System.out.println(map.toString());
	}

}

