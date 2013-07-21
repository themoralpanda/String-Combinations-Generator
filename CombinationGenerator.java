import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Map.Entry;
import java.util.*;

public class CombinationGenerator {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String input;
        System.out.println("Enter a string to find its :");
        Scanner inp = new Scanner(System.in);
        input = inp.nextLine();
        combination_generator(input);
    }
     public static void combination_generator(String input)
     {
        HashMap hm = new HashMap();
        String first="";
        String last="";
        int start,end;
        for(int i=0;i<(input.length());i++)
        {
            hm.put(i+1,new Character(input.charAt(i)));
        }
        
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        
        while(itr.hasNext())
        {
        Map.Entry obj = (Map.Entry)itr.next();
        
        first=first.concat(String.valueOf(obj.getKey()));

        }
        
        start = Integer.parseInt(first);
        last=reverse(first);
        
        end = Integer.parseInt(last);

        //generate numbers from start to end and perform the logic
        int current;
        System.out.println("The permutations are as follows. :");
        for(int i=start;i<=end;i++)
        { 
          boolean temp;
          temp= digit_check(i,input.length());
          if(temp == true ){
            temp = repetition_check(i,input.length());
            if(temp == true)
                {
                    System.out.println();
                    construct_string(i,hm);
            }
            else
                continue;
            }     
           else 
                continue;
          }

    }
    
//function to construct string from the integer pattern
    public static void construct_string(int val ,HashMap hm){
        int k;
        String temp="";
        while(val!=0){
            k=val%10;
            temp = temp.concat(String.valueOf(hm.get(k)));
            val=val/10;
        }
        System.out.println(String.valueOf(temp));

    }

//function to check if any repetition occurs or not.
    public static boolean repetition_check(int val, int length){
        boolean digit_verify[]= new boolean[length];

        int k;
        for(k=0;k<length;k++){
            digit_verify[k]=false;
            }
        while(val!=0)
        {
            k=val%10;
            val=val/10;
            if(digit_verify[k-1] != true){
                digit_verify[k-1]=true;
                continue;
            }
            else{
                return false;  
            }
         
         }
         return true;
    }


//function to check if all the digits falls under the length 
     public static boolean digit_check(int val,int length){
        int k;
        while(val!=0)
        {
            k=val%10;
            val=val/10;
            if(k>=1 && k<=length)
                continue;
            else
                return false;
         }
         return true;
    }



    public static String reverse(String input)
    {
        String temp="";
        for(int i=(input.length())-1;i>=0;i--)
           temp=temp.concat(String.valueOf(input.charAt(i)));

        //System.out.println("The reversed string is " +":"+ temp);
        return temp;   
    }

}