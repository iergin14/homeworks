package chapter5;

public class PrimeNumber {


	public static void main(String[] args) {
		Integer num1 = 2;
		Integer num2 = 50;
		Boolean result = isPrime(num2);
		System.out.println("50 is a prime number ? " +result);		
		System.out.println("2 is a prime number ? " + isPrime(num1));
		primeNumbers(num2);
		
	}
	
	public static Boolean isPrime(Integer n) {
		int i,m=0,flag=0;      
		  m=n/2;      
		  if(n==0||n==1){  
		   return false;   
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     return false;     
		    }      
		   }      
		   return true;
		  } 

	}
	
	public static void primeNumbers(Integer n) {
		for (int i = 2; i < n; i++) {
			if(isPrime(i)) {
				System.out.println(i + " is a prime number");
			}
		}
	}

}

