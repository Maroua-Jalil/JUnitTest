package org.mql.test.junit;

public class MaClasse {

	 public static int maMethode(int a, int b)
	 {
		 int res= a + b;
		  if(a == 0) {
			  res = b * b;
			  
		  }
		  else if (b == 0) {
			  res = a * a;
		  }
		  return res;
	 }
}
