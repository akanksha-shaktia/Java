/* Problem hosted by leetcode 
 * Efficiency : O(n)
 * Runtime of this code beats 50.21% of java submissions.
 * Reverse digits of an integer.
   Example1: x = 123, return 321
   Example2: x = -123, return -321
   Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. 
   For the purpose of this problem, assume that your function returns 0 
   when the reversed integer overflows.
 */
public class ReverseInteger {

	public static void main(String[] args) {		
		        int x = -1563847412; // sample variable		        
		        boolean sign = false;
		        if(x<0){
		        	sign = true;
		        	x = x*-1;
		        }
		        long sol = 0;
		        while(x/10!=0){
		            sol = sol*10 + x%10;
		            x = x/10;
		        }
		        sol = sol*10 + x;
		        if(sign){
		        	sol = sol*-1;
		        }
		        if(sol<Integer.MIN_VALUE || sol>Integer.MAX_VALUE){
		        	System.out.print(0);
		        }else{
		        	System.out.print(sol);
		        }        
		    }
	
}
