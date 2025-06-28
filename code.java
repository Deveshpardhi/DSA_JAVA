import java.util.*;

public class code
{
    
  public static void subsets1(String str,String ans,int i){
    //basecase
    if(i==str.length()){
        if(ans.length()==0){
            System.out.println("null");
        }else{
            System.out.println(ans);
        }
    }

    //recursion
    subsets1(str, ans+str.charAt(i), i+1);
    subsets1(str, ans, i+1);
}

public static void main(String[] args) {
    //subsets1("abc", "", 0);
    System.out.println("Hello");
}
}