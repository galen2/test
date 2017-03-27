package ym.test;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
//    	HashMap<K, V>
    	ThreadLocal<String>  local =  new ThreadLocal<String>();
    	System.out.println(null==local.get());
    	local.set("1");
    	System.out.println(local.get());
    	local.set("2");
    	System.out.println(local.get());
    	
    	person.dog d1 = new person.dog();
    	person.dog d2 = new person.dog();
    	System.out.println(d1);
    	System.out.println(d2);

    }
}
