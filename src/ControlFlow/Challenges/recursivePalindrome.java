package ControlFlow.Challenges;

import java.util.Scanner;

public class recursivePalindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word:");
        String word = input.next();
        if (isPalindrome(word)) {
            System.out.print("Word is palindrome");
        } else {
            System.out.print("Word is not palindrome");
        }
    }

    static boolean isPalindrome(String word) {
        if(word.length()<=1){
            return true;
        }
        int lastPosition=word.length()-1;
        if (word.charAt(0)
                !=word.charAt(lastPosition)){
            return false;
        }
        String newWord=word.substring(1,lastPosition);
        return isPalindrome(newWord);
    }
}

