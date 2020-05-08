package src.nmsu.cs.re;

import org.apache.log4j.Logger;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Test2 {
	
	/* Get actual class name to be printed on */
	
	static Logger log = Logger.getLogger(Test2.class.getName());
	   
	   
	public static void main(String[] args){
	      
	      System.out.println(Test2.class.getName());
              
	      log.debug("Hello this is a debug message");
	      log.info("Hello this is an info message");
	      
	      System.out.println("Hello World !!");
	      
	      Multimap<String, String> hashMap = HashMultimap.create();
	      hashMap.put("1", "2");
	      
	      System.out.print(hashMap.size());
	}

}
