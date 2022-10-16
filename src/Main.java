import java.util.*;
public class Main {
    static boolean checkPalindrome(String str, int s, int e)
    {
        if (s == e)    // If there is only one character
            return true;
        // If first and last characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        // If there are multiple characters, check if
        // middle substring is also palindrome or not.
        if (s < e + 1)
            return checkPalindrome(str, s + 1, e - 1);
        return true;
    }
    static boolean isPalindrome(String str)
    {
        int n = str.length();
        // If string is empty,then it is palindrome
        if (n == 0)
            return true;
        return checkPalindrome(str, 0, n - 1);
    }
    public static void main(String[] args) {
                int r,sum=0,temp,choice;
                Scanner sc=new Scanner(System.in);
                System.out.println("1.for integer palindrome\n2.for string palindrome\nEnter choice:");
                choice=sc.nextInt();
                if(choice==1) {
                    int n = sc.nextInt();
                    temp = n;
                    while (n > 0) {
                        r = n % 10;
                        sum = (sum * 10) + r;
                        n = n / 10;
                    }
                    if (temp == sum)
                        System.out.println("palindrome number ");
                    else
                        System.out.println("not palindrome");
                }
                if(choice==2)
                {
                    System.out.println("Enter the String :");
                    String str = sc.nextLine();   //Input the string
                    //Check whether palindrome or not
                    if (isPalindrome(str))
                        System.out.println(str+" is palindrome");
                    else
                        System.out.println(str+ " is not a palindrome");

                }
    }
}