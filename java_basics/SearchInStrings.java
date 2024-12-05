package java.java_basics;
public class SearchInStrings {
    public static void main(String[] args){
     String name = "Shravani";
     char c1 = 'h';
     boolean ans = ispresent(name, c1);
     System.out.println(ans);
    }
    

 static boolean ispresent(String s , char c ){
    int n = s.length();
    if (n==0){
        return false;
    }
    for(int i =0 ; i <n ; i++){
        if(c == s.charAt(i)){
            return true;
        }
}
    
    return false;

 }
}
