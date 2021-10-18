import org.junit.Test;

public class Exercise {
    public static void main(String[] args){


    } 
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null) {
            String reverseStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            reverseStr+=str.substring(endIndex+1);
            return reverseStr;
        }
        return null;
    }
    @Test
    public void Test(){
        String str="aaaqwerbbb";
        String reverse=reverse(str,3,6);
        System.out.println(reverse);
    }
}