public class code1 {

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

    public static String decription(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0' ||str.charAt(i)=='1' ||str.charAt(i)=='2' ||str.charAt(i)=='3' ||str.charAt(i)=='4' ||str.charAt(i)=='5' ||str.charAt(i)=='6' ||str.charAt(i)=='7' ||str.charAt(i)=='8' ||str.charAt(i)=='9'){
                int n = Character.getNumericValue(str.charAt(i));
                for(int k=0;k<n-1;k++){
                    str1+=str.charAt(i-1);
                }
            }else{
                str1+=str.charAt(i);
            }
        }
        return str1;
    }

    public static int rotate_arr(int arr[]){
        int a=0;
        for(int i=1;i<arr.length-2;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                a=i;
            }
        }
        return arr[a];
    }
    public static void main(String[] args) {
       //System.out.println( compression("m2a2n2d2"));
       int arr[]={2,3,6,5,4,9,11};
       System.out.println(rotate_arr(arr));
    }
}
