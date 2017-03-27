package ym.test;

import j.m.JSON;
import j.u.XMap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.ByteOrder;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@org.junit.Test
	public void te(){
//		String r = "放假哦我";

		XMap map = new XMap();
		map.put("a", "wolrd");
		System.out.println(map.toJSON());
		String j = "{\"a\n\":\"wolrd\"}";
		System.out.println(JSON.parse(j));
	}
	
	@org.junit.Test
	public void readFile(){
		try {
			File file = new File("/Users/yourmall/Documents/aa.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String content = reader.readLine();
			System.out.println(content);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void run(){
		System.out.println(ByteOrder.nativeOrder());
	}
	
	
}
