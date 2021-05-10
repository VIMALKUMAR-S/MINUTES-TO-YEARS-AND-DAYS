/*
PROGRAM TASK: TO CONVERT APPROXIMATELY THE GIVEN MINUTES TO YEARS AND DAYS
AUTHOR      :VIMALKUMAR S
 */
package minutestotime;

import java.util.Scanner;

public class MinutesToYears {


    public static void main(String[] args) {
      
       Scanner sc= new Scanner(System.in);
       int minutes= sc.nextInt();//GET INPUT FROM THE USER
       int b = minutes/(365*24*60);
       int c=minutes%(365*24*60);
       c=c/(24*60);
       System.out.println(""+minutes+" minutes is approximately "+b+" years and "+c+" days");
        
    }
    
}
