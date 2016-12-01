package Other;

import java.io.*;
import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int val = 'a';
        boolean f[]= new boolean[26];
        boolean check=true;
        String sent =sc.nextLine();
        sent =sent.toLowerCase();
        int size = sent.length();
        for(int i=0;i<26;i++)
        {
                f[i] = false;
        }
        for(int i=0;i<size;i++)
        {
                if(!(sent.charAt(i)==' '))
                {
                	int ind = sent.charAt(i);
                	f[ind-val] = true;
                }
                
                
        }
        for(int i=0;i<26;i++)
        {
            if(!f[i])
            {
                 check = false;
                break;
            }
        }
        if(check)
        {
            System.out.println("pangram");    
        }
        else
            System.out.println("not pangram");
        
    }
}
