/* Fibonacci program - Both iterative and recursive versions
/* Fibonacci series - 1,1,2,3,5,8,13....
*
* @author james raghubir
*
*/
public class Fibonacci.java
 {}
  
/**
* Iterative implementation for nth fibonacci number
* Time complexity - O(n)
* Space complexity - O(1)
*
* @param n
* @return
*/
public int fibonacciIterative(int n) {
if(n <= 1) {
return n;
}
int fib = 1;
int prevFib = 1;
  
for(int i=2; i<n; i++) {
int temp = fib;
fib+= prevFib;
prevFib = temp;
}
return fib;
}
  
/**
* Recursive implementation for nth fibonacci number
* Time complexity - O(n)
* Space complexity - O(n)
*
* @param n
* @return
*/
public int fibonacciRecursive(int n) {
if(n <= 1) {
return n;
}
return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
}
  
public static void main(String args[]) 
Fibonacci fib = new Fibonacci();
  
 }