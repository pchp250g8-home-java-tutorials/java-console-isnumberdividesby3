/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.isnumberdividesby3;
import java.io.*;

/**
 *
 * @author PC
 */
public class IsNumberDividesBy3 
{

    public static void main(String[] args) 
    {
        System.out.println("Input an Integer number:");
        try
        {
            var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
            var strNum = bufStdIn.readLine();
            var iNum = Long.parseLong(strNum);
            var iVal = Math.abs(iNum);
            var nSumDigits = 0;
            while(iVal > 0)
            {
                nSumDigits += iVal % 10;
                iVal /= 10;
            }
            System.out.printf
            (
                "The sum of digits of the number %d is %d\r\n", 
                iNum,nSumDigits
            );
            if(nSumDigits % 3 == 0)
            {
               System.out.printf("The number %d divides by 3\r\n", iNum);
            }
            else
            {
               System.out.printf("The number %d does not divide by 3\r\n", iNum); 
            }
        }
        catch(Exception ex)
        {
            System.out.println("Convertion Number Error. No Result.");
        }
    }
}
