/**
  Add Binary
	Given two binary strings, return their sum (also a binary string).

	For example,
	a = "11"
	b = "1"
	Return "100".
*/

import java.lang.StringBuffer;
public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(a.length() == 0)
            return b;
        
        if(b.length() == 0)
            return a;
        
        int i=a.length()-1, j=b.length()-1;
        int more = 0;
        StringBuffer res = new StringBuffer();
        while(i>=0 && j>=0){
            int ai=a.charAt(i)-'0';
            int bj=b.charAt(j)-'0';
            int t = (ai+bj+more)%2;
            res.insert(0,t);
            more = (ai+bj+more)/2;
            i--;
            j--;
        }
        
        while(i>=0){
            int ai=a.charAt(i)-'0';
            int t = (ai+more)%2;
            res.insert(0,t);
            more = (ai+more)/2;
            i--;
        }
        
        while(j>=0){
            int bj=b.charAt(j)-'0';
            int t = (bj+more)%2;
            res.insert(0,t);
            more = (bj+more)/2;
            j--;
        }
        
        if(more==1)
            res.insert(0,more);
            
        return new String(res);
    }
}