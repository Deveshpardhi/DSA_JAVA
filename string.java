
import java.util.*;
import java.util.Scanner;


public class string {

    public static void printchar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void palindrom(String str) {
        int flag=0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                flag=1;
            }else{
                flag=0;
                break;
            }
        }
        if (flag==1) {
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }

    public static void directions(String str){
        int n=str.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            char dir=str.charAt(i);
            if(dir == 'E'){ 
                x=x+1;
            }else if(dir == 'W'){
                x=x-1;
            }else if(dir == 'N'){
                y=y+1;
            }else if(dir == 'S'){
                y=y-1;
            }else{
                x=x;
                y=y;
            }
        }
        System.out.println("Displacenment:"+ Math.sqrt(x*x+y*y));
    }

    public static void substring(String str,int st,int end){
        System.out.println(str.substring(st,end));
    }
    public static String f_uppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compression(String str){
        String str1="";
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            char ch=str.charAt(i);
            while (i<str.length()-1 && ch==str.charAt(i+1)) {
                count++;
                i++;
            }
            str1+=ch;
            if(count>1){
                str1+=count.toString();
            }
        }
        return str1;
    }





    public static void main(String []args){
        String str="Jai shree RAM";
        System.out.println(str);
        
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        //printchar(str1);
        //String str2=sc.nextLine();
        //System.out.println(str1);
        //substring(str1,10,13);
        compression(str1);
        System.out.println(compression(str1));
        //System.err.println(str2);


    } 
}
