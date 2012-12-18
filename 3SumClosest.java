/**
3Sum Closest
	Given an array S of n integers, find three integers in S such that 
	the sum is closest to a given number, target. Return the sum of the 
	three integers. You may assume that each input would have exactly one solution.

	For example, given array S = {-1 2 1 -4}, and target = 1.
	The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/

import java.util.Arrays;
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num.length<3)
            return Integer.MAX_VALUE;
        
        Arrays.sort(num);
        int closest = Integer.MAX_VALUE;
        int targetSum = 0;
        
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                int k=num.length-1;
                while(j<k){
                    int t= num[i]+num[j]+num[k]-target;
                    if(closest > java.lang.Math.abs(t)){
                        closest = java.lang.Math.abs(t);
                        targetSum = t+target;
                    }
                    
                    if(t==0)
                        return target;
                    else if(t>0)
                        k--;
                    else
                        j++;
                }
            }
        }
        return targetSum;
    }
}