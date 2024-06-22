package ArraysAndStrings;

import java.util.*;
public class reverse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st= sc.nextLine();
        System.out.println(rev(st));
    }
    public static String rev( String str){
        String s= "";

        for ( int i=str.length()-1 ;i>=0; i--){
            s+=str.charAt(i);
            
        }
        return s.toString();
    }
}