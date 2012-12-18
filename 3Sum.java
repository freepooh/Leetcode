/**
	3Sum
	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

	Note:
	Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ¡Ü b ¡Ü c)
	The solution set must not contain duplicate triplets.
	    For example, given array S = {-1 0 1 2 -1 -4},

	    A solution set is:
	    (-1, 0, 1)
	    (-1, -1, 2)
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> sums = new ArrayList<ArrayList<Integer>>();
        if(num.length < 3)
            return sums;
            
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                int k=num.length-1;
                while(j<k){
                    if(num[i]+num[j]+num[k]==0){
                        ArrayList<Integer> sum = new ArrayList<Integer>();
                        sum.add(num[i]);
                        sum.add(num[j]);
                        sum.add(num[k]);
                        if(!set.contains(sum))
                            set.add(sum);
                        j++;
                        k--;
                    }else if(num[i]+num[j]+num[k]>0)
                        k--;
                    else 
                        j++;
                }
            }
        }
        
        for(ArrayList<Integer> s:set)
            sums.add(s);
        
        return sums;
    }
}