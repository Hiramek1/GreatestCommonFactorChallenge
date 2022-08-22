/*
Math Challenge
Have the function MathChallenge(num1,num2) take both parameters being passed and return the Greatest Common Factor. That is, return the greatest number that evenly goes into both numbers with no remainder. For example: 12 and 16 both are divisible by 1, 2, and 4 so the output should be 4. The range for both parameters will be from 1 to 10^3.
Examples
Input: 7 & num2 = 3
Output: 1
Input: 36 & num2 = 54
Output: 18
*/
import java.util.*;
import java.io.*;

class Main {

  public static int MathChallenge(int num1, int num2) {
    // code goes here
    int largestFactor = 1;
    int smallerNum;

    if (num1 > num2)
    {
      smallerNum = num2;
    } else {
      smallerNum = num1;
    }

    for (int i = 1; i <= smallerNum; i++)
    {
      if ((num1 % i == 0) && (num2 % i == 0) && (i > largestFactor))
      {
        largestFactor = i;
      }
    }

    return largestFactor;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(MathChallenge(s.nextLine()));
  }

}