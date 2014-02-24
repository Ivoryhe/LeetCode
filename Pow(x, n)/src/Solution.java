/**
 * Feb-23-2014
 * @author Ivoryhe
 * Pow(x, n) 
 * 
 * Implement pow(x, n).
 */
public class Solution {
    public double pow(double x, int n) {
        double result = 0;
        if(n == 0) {return 1;}
        
        if(n<0){
            if(n%2 == 0){
                double temp = pow(x,n/2);
                result = temp*temp;
            }
            else{
                result = pow(x,n+1)/x;
            }
        }
        else{
            if(n%2 == 0){
                double temp = pow(x,n/2);
                result = temp*temp;
            }
            else{
                result = pow(x,n-1)*x;
            }
        }
        return result;
    }
}