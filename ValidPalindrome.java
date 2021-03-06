/**
	Valid Palindrome
	Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

	For example,
	"A man, a plan, a canal: Panama" is a palindrome.
	"race a car" is not a palindrome.

	Note:
	Have you consider that the string might be empty? This is a good question to ask during an interview.
	For the purpose of this problem, we define empty string as valid palindrome.
*/

public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length()==0)
            return true;
        
        int start = 0, end = s.length()-1, d = 'A'-'a';
        while(start<end){
            char left = s.charAt(start), right = s.charAt(end);
// alphanumeric characters
            while(!((left>='a' && left<='z') || (left>='A'&& left<='Z') || (left>='0' && left<='9'))){
                start++;
                if(start == s.length())
                    return true;
                left = s.charAt(start);
            }
            if(left>='A' && left<='Z')
                left = (char)(left - d);
            
// alphanumeric characters
            while(!((right>='a' && right<='z') || (right>='A'&& right<='Z') || (right>='0' && right<='9'))){
                end--;
                if(end == -1)
                    return true;
                right = s.charAt(end);
            }
            if(right>='A' && right<='Z')
                right = (char)(right-d);
            
            
            if(left != right)
                return false;
            start++;
            end--;
        }
        return true;
    }
}