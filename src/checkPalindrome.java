import java.util.Stack;

/**
 * Created by somutha on 11/5/2016.
 */
public class checkPalindrome {

    String data;
    char[] charArray;
    Stack palindrome = new Stack();
    int i = 0;

    public checkPalindrome(String data){
        this.data=data;
        this.charArray = this.data.toCharArray();
        this.pushPal();
        this.checkPal();
    }

    public void pushPal(){
        while (!(charArray[i] == 'X')){
            palindrome.push(charArray[i]);
            i++;
        }
    }

    public boolean checkPal(){
        i++;
        System.out.println("palindrome first elemsnt:"+ palindrome.toString());
        System.out.println("character array after X:" + charArray[i] + palindrome.lastElement());
        while (i<charArray.length){
            if (charArray[i] == palindrome.lastElement()) {
                palindrome.pop();
                i++;
            }

            else{
                System.out.println("not a palindrome");
                return false;

            }

        }
        if (palindrome.empty()){
            System.out.println("Palindrome");
            return true;
        }
        else{
            System.out.println("Not a Palindrome");
            return false;
        }

    }

    public static void main(String args[]){
        String pal="ababXbaba";
        checkPalindrome cp = new checkPalindrome(pal);
    }

}
