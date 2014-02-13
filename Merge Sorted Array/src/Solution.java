/**
 * Feb-12-2014
 * @author Ivoryhe
 * Merge Sorted Array
 * 
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Note:
 * You may assume that A has enough space to hold additional elements from B. 
 * The number of elements initialized in A and B are m and n respectively.
 */
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int all = m+n-1;
        int a=m-1;
        int b=n-1;
        while(a>=0 && b>=0){
            int tempA = A[a];
            int tempB = B[b];
            if(tempA > tempB){
                A[all] = A[a];
                a--;
                all--;
            }
            else{
                A[all] = B[b];
                b--;
                all--;
            }
        }
        if(b>=0){
            for(int i=b; i>=0; i--){
                A[i] = B[i];
            }
        }
    }
}