import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int x_guess,b_months=1,i,m,l=1;
        x_guess= 24*60*60*1000;

        for(i=1;l<=x_guess;i++)
        {
            l=l*i; 
        }
        i--;
        for(m=i+1;b_months<=180;m++)
        {
            b_months=b_months*m;
            i++;       }
     System.out.println("The minimum length required will be "+i);
    }
}