import java.util.*;

public class main {

    public  static void main(String[] args){
        if(args.length == 0){
            System.out.println("false");
        }else{
            String s1 = args[0];
            String s2 = args[1];
            if (oneToOneString(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean oneToOneString(String s, String t){
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }else{
                    map.put(s.charAt(i),t.charAt(i));
                }
            }
        }
        return true;
    }
}
