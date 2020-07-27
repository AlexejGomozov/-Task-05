package by.htp.onedimensionalarrays.logic;

/* «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, 
   в которые надо вставить игральные кубики. Но дверь открывается только в том случае,
   когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
    (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая
      разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
          "Super lock". The secret lock for the safe consists of 10 cells arranged in a row,
          into which you need to insert dice. But the door opens only when in any three adjacent 
          cells the sum of points on the front faces of the dice is 10. (A dice has on each face
          from 1 to 6 points). Write a program that solves the lock code, provided that two cubes
          are already inserted into the cells.  */

    public class Task18 {

	public static int  thirdСell () {                                                         // т.к. по условию задачи задано два числа то они
		                                                                                  // могут быть в сумме не более "9" и не менее "4"
            int [] triNumbers = new int [3];                                                      // поэтому одно из них м.б. не более "3"
		                                                                                  // а второе не более "6" и не менее "2" каждое из них
		int sum = 0;                                                                      // чтобы в сумме трех чисел было "10"       
		
		  triNumbers[0] = (int) (Math.random()*6 + 1);                                     //  random от 1 до 6 включительно
		                                                                  
		      triNumbers[1] = (int) (Math.random()*6 + 1);                      
		                                                                  
		         if ((triNumbers[0] + triNumbers[1]) > 9) return thirdСell();              //возврат если больше "9", чтобы третье число было минимум "1"
		
		            triNumbers[2] = 10 - (triNumbers[0] + triNumbers[1]);                  //можно так же random, до тех пор пока сумма 3-х не станет 10
		
		               if(triNumbers[2] > 6) return thirdСell();                           //возврат если больше "6"
		          
		                  for(int i = 0; i< triNumbers.length; i++)
		             
		                      sum = sum + triNumbers[i];
		
		                         System.out.println(triNumbers[0] +", "+  triNumbers[1] + ", " + triNumbers[2]);
		
		                            return sum;		
	                                      }
		
	                                      public static void main(String[] args) {
				
		                                System.out.print(thirdСell());	
	                                           }
  							}

							//6, 1, 3
							//10
