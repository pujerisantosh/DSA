package com.santosh.twoPointers;

public class validPalindromesolving {

public boolean validPalindrome(String s){

    int left =0;
    int right = s.length()-1;


    while (left < right){

        //skip the left character

        if (!Character.isLetterOrDigit(s.charAt(left))){
            left++;
            continue;
        }

        // skip the right Character

        if (!Character.isLetterOrDigit(s.charAt(right))){

            right--;
            continue;
        }


        // Compare characters


        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){

            return false;
        }


        // Move both pointers
        left++;
        right--;
    }


    return true;
}

    static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        validPalindromesolving vd = new validPalindromesolving();

        System.out.println(vd.validPalindrome(s));
    }

}
