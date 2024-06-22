package ArraysAndStrings;

import java.util.*;
public class ChangeCase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st= sc.nextLine();
        System.out.println(reverse(st));
    }
    public static String reverse( String str){
        StringBuilder s =new StringBuilder(str);

        for ( int i=str.length()-1 ;i>=0; i--){
            s.append(i);
        }
        return s.toString();
    }
}