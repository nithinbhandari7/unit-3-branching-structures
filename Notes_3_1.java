public class Notes_3_1 {

}
/*
 * Arithmetic Expression vs. Boolean Expression
 * 
 * Arithmetic Expression - 
 * 		Operands - numeric
 * 		Operators - arithmetic operators (+, -, *, / %)
 * 		Evaluates to - numeric
 * 
 * Boolean Expression - 
 * 		evaluates to - boolean (true/false)
 * 		operators
 * 			1. Relational (<, >, <=, >=, ==, !=)
 * 				operands - numeric
 * 			2. Logical (&&, ||, ^, !)
 * 				operands - boolean			  
 * **look at truth tables
 * 
 * short circuit evaluation - boolean expressions are evaluated 
 * 		until the truth value is known
 * 
 * examples:  T || ____ is T, so the evaluation stops after the ||
 * 			  F && ____ is F, so the evaluation stops after the &&
 * 
 * test to see if den divides evenly into num - how can we do this?
 * 
if((den != 0) && (num % den == 0))	//den divides evenly into num

boolean truthValue;
int x = 5, y = 0, z = -1;

truthValue = x < y;
System.out.println(truthValue);	//F

truthValue = x == x;
System.out.println(truthValue);	//T

truthValue = !(x != y);
System.out.println(truthValue);	//F

truthValue = x < y && y < z;
System.out.println(truthValue);	//F

truthValue = y < x || x == y;
System.out.println(truthValue);	//T

truthValue = y < x || (x / y < 0);
System.out.println(truthValue); 	//T


Practice writing boolean expressions:
write an expression to represent:

1. x is greater than 5                                                 x > 5
2. y is less than or equal to 2                                        x <= 2
3. weight is equal to 0                                                weight == 0
4. cost is between 0 and 80 inclusive                                  0 <= cost <= 80
5. input is less than 0 (inclusive) or greater than 10 (inclusive)     input <= 0 || input >= 10
6. age is not between 13 and 19 (inclusive)                            !(age >= 13 && age <= 19)
7. numStudents is between 1 and classroomCapacity (inclusive)          numStudents >= 1 && numStudents <= classroomCapacity


Write the expression that represents the OPPOSITE 
of the expression given
1. x > 0								x <= 0																		
2. y == 8								y != 8				
3. age <= 100							age > 100	
4. weight > 100 || weight < 30			weight >= 30 && weight <= 100
5. height >= 50 && height < 75			height < 50 || height >= 75
6. !(input < 90 && input > 45)	        input < 90 && input > 45
*/