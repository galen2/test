package serialization;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Person implements Serializable {
	//类版本号
	private static final long serialVersionUID = -4377820862232402359L;
	private String userName; 
	//为了安全，声明为transient
	private transient String password; 
	//类实现字段，不需要被序列化
	private transient String realizeDetail="类本身实现细节";
	public Person(String userName, String password) { 
		this.userName = userName; 
		this.password = password; 
	} 
	
	private void writeObject(ObjectOutputStream out) throws IOException { 
		//这一行是必须的。他会调用默认序列化机制。默认序列化化保存所有没有声明transient字段
		out.defaultWriteObject(); 
		//为了保证密码安全，对字段加密然后手动序列化
		String salt = "23";
		out.writeObject(salt+password); //序列化transient字段 
	} 
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { 
		//这一行是必须的。他会调用默认反序列化机制。
		in.defaultReadObject();            
		String pwd = (String)in.readObject(); //反序列化transient字段 
		password = pwd.substring(2);; //反序列化transient字段 
	} 
	
	/**
	 * 方法在方法区，不被序列化
	 */
	public void print(){
		System.out.println("hello world two");
	}
	
	public String toString() { 
		return "userName:" + userName + "  password:" + password; 
	} 
}
