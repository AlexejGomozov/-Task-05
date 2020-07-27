package by.htp.onedimensionalarrays.logic;

/* Даны действительные числа a1,a2,...,an . Найти
   max(a1 +a2n,a2 +a2n−1,...,an +an+1). 
    You are given real numbers a1, a2, ..., an. To find
    max (a1 + a2n, a2 + a2n − 1, ..., an + an + 1). */

    public class Task16 {
	
	public static int maxSum(int [] x) {     //метод по нахождению max сумм первого и последнего ячеек, второй и предпоследней и т.д. 
		
	    int max = x[0] + x[x.length-1];
		
		for(int i = 1; i <= x.length-1 - i; i++) {
			
	            max = Math.max(max, x[i] + x[x.length - 1 - i]);
			
		      }
		
		         return max;
	                   }
		
	                     public static void main(String[] args) {
		
		                int [] y = {36, 4555, 68, 37, 450, 28, 73, 45, 87, 36, 480, 27, 50, 82, 73, 65, 23, 750};
				
		                   System.out.print(maxSum(y));
	                              }
                                         }
                                            // 4578
