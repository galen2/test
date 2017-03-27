package GC;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import j.u.XList;
import j.u.XMap;

public class GCTest {

	public static final int a = 3;
	
	public static  int b = 3;
	
	public static final int aaa = 3;
	
	public static GCTest SAVE_HOOK = null;
	
	static XList list = new XList();
	
	static int num = Integer.MAX_VALUE;

	public static void t2(){
		for(int i = 0 ; i < num;i++){
			XMap map = new XMap();
			list.add(map);
			System.out.println("runing:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void t3(){
//		LinkedList<E>
		
		for(int i = 0 ; i < num;i++){
			person map = new person();
			list.add(map);
			System.out.println("runing:"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		t2();
	}

}
