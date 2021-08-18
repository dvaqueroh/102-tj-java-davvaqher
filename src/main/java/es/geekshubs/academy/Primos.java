package es.geekshubs.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Primos {

  /**
   * Apply Method
   * @param input
   * @return
   */
	

public List<Integer> apply(final Integer input) {

	  List primos = new ArrayList();
	  for (int i = 1; i <= input; i++) {
		  if(i!=1) {
			  if (input%i==0) { // comprueba si es primo
				  //System.out.println(i+" es primo");
				  primos.add(i);  
			  }
		  }
		  else {
			  primos.add(null); 
		  }
		  
		
	  }// fin for
	  System.out.println(primos);
	  return primos;
  }// fin aplly

}// fin clase
