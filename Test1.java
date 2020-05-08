//package nmsu.cs.re;

import org.apache.log4j.Logger;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Test1 {
	
	/* Get actual class name to be printed on */
	
	static Logger log = Logger.getLogger(Test1.class.getName());
	   
	   
	public static void main(String[] args){
	      
	      System.out.println(Test1.class.getName());
              
	      log.debug("Hello this is a debug message");
	      log.info("Hello this is an info message");
	      
	      System.out.println("Hello World !!");
	      
	      Multimap<String, String> hashMap = HashMultimap.create();
	      hashMap.put("1", "2");
	      
	      System.out.print(hashMap.size());
	}

}
