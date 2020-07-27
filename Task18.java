package by.htp.onedimensionalarrays.logic;

/* «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, 
 * в которые надо вставить игральные кубики. Но дверь открывается только в том случае,
 *  когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
 *   (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая
 *     разгадывает код замка при условии, что два кубика уже вставлены в ячейки.  */

        public class Task18 {

	    public static int thirdСell () {                                        //not done yet
		
		int third;
		
		   int a = (int) (Math.random()*6 + 1);          //  random от 1 до 6 включительно
		 
		     int b = (int) (Math.random()*6 + 1); 
		
		        if ((a + b) > 9) return thirdСell();     //возврат если больше "9", чтобы третье число было минимум "1"
		
		          third = 10 - (a + b);                    //можно так же random, до тех пор пока сумма 3-х не станет 10
		
		             if(third > 6) return thirdСell();
		          
		                int sum = third + a +b;
		
		                  System.out.println(a +", "+  b + ", " + third);
		
		                    return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		//int x = (int) (Math.random()*6 + 1);           // т.к. по условию задачи задано два числа то они 
		                                                // могут быть в сумме не более "9" и не менее "4"
		//int y = (int) (Math.random()*6 + 1);          // поэтому одно из них м.б. не более "3"
		                                                // а второе не более "6" и не менее "2" каждое из них
		//int sum = x + y + thirdСell(x, y);            // чтобы в сумме трех чисел было "10"
		
		//System.out.print(x + " + " + y + " + " + thirdСell(x, y) + " = " + sum);
		
		System.out.print(thirdСell());
		
	}
}
//6, 1, 3
//10
