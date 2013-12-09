package com.data.structures;

/**
 * Created with IntelliJ IDEA.
 * User: bazinga
 * Date: 11/30/13
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindPrimeNumber {


      private static boolean isPrimeNumber(int num)
      {
          for ( int i=2; i < num ; i++)
          {
              if((num % i) == 0 )
              {
                  return false;
              }
          }

          return  true;
      }


      public static void main(String[] args)
      {

              System.out.println("5: " + isPrimeNumber(5));
              System.out.println("4: " + isPrimeNumber(4));
              System.out.println("16908799:  " + isPrimeNumber(16908799));

              System.out.println("23:  " + isPrimeNumber(23));
              System.out.println("36:  " + isPrimeNumber(36));
              System.out.println("bingo");
      }
}
