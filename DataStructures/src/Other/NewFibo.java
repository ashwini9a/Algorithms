package Other;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class NewFibo {

	    public static BigInteger fibo(BigInteger no, BigInteger n1,BigInteger n2)
	    {
	        if(no == n1)
	            return n1;
	        else if(no == n2)
	            return n2;
	        
	        BigInteger b2 = new BigInteger("2");
	        return (fibo(no.subtract(BigInteger.ONE),n1,n2).multiply(fibo(no.subtract(BigInteger.ONE),n1,n2))).add(fibo(no.subtract(b2),n1,n2));
	    }
	      
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        BigInteger n1 = sc.nextBigInteger();
	        BigInteger n2 = sc.nextBigInteger();
	        BigInteger no = sc.nextBigInteger();
	        BigInteger res = fibo(no.subtract(BigInteger.ONE) , n1,n2);
	        
	        System.out.println(res.toString());
	    
	    
	    }
}