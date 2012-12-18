/**
	4Sum
	Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

	Note:
	Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ¡Ü b ¡Ü c ¡Ü d)
	The solution set must not contain duplicate quadruplets.
	    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
	    A solution set is:
	    (-1,  0, 0, 1)
	    (-2, -1, 1, 2)
	    (-2,  0, 0, 2)
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> sums = new ArrayList<ArrayList<Integer>>();
        if(num.length<4)
            return sums;
            
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i=0; i<num.length-3; i++)
            for(int j=i+1; j<num.length-2; j++){
                int m=j+1, n=num.length-1;
                while(m<n){
                    int s = num[i]+num[j]+num[m]+num[n];
                    if(s==target){
                        ArrayList<Integer> sum = new ArrayList<Integer>();
                        sum.add(num[i]);
                        sum.add(num[j]);
                        sum.add(num[m]);
                        sum.add(num[n]);
                        if(!set.contains(sum))
                            set.add(sum);
                        m++;
                        n--;
                    }else if(s<target)
                        m++;
                    else
                        n--;
                }
            }
    
        for(ArrayList<Integer> t:set)
            sums.add(t);
            
        return sums;
    }
}