package interFace;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int solve(String s){

        Set<Character> set = new HashSet<>();

        int left =0;
        int  maxlen =0;


        for (int right=0;right<s.length();right++){

            while(set.contains(s.charAt(right))){

                set.remove(s.charAt(left));

                left++;
            }

            set.add(s.charAt(right));
            maxlen = Math.max(maxlen, right-left+1);
        }


        return  maxlen;

    }
}

/*

time o(n), space 0(n)
 */