package com.santosh;

public class ValidPalindrome {



    public boolean isPalindrome(String s){


        int left =0;
        int right = s.length()-1;

        while (left <  right){

            // Skip left special characters


            if (!Character.isLetterOrDigit(s.charAt(left))){

                left++;
                continue;


            }



            // Skip right special characters


            if (!Character.isLetterOrDigit(s.charAt(right))){

                right--;
                continue;
            }


            return false;
        }


        return true;

    }

    /*


    Interview Answer (Brute Force)

"First, I create a new string by removing all non-alphanumeric characters and converting everything to lowercase. Then I compare the cleaned string with its reverse. If both are equal, it's a palindrome; otherwise, it is not."

Example:

Input:

"A man, a plan, a canal: Panama"

Clean it:

amanaplanacanalpanama

Reverse it:

amanaplanacanalpanama

Compare:

Equal ✅

Return:

true

Complexity
Time

Cleaning string

O(n)

Reverse string

O(n)

Compare

O(n)

Total

O(n)
Auxiliary Space

We create another string.

O(n)



Optimal
-Two pointers
Complexity
Time: O(n) (each character is visited at most once)
Auxiliary Space: O(1) (no extra string is created)
     */







}
