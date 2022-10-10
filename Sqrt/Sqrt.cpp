/*
  Solution of problem 69. Sqrt(x)
*/
class Solution {
public:
    int mySqrt(int x) {
        
        double m = 0.00001;
        double e = 1.0;
        
        while(absoluteValue((e*e)-x)>=m){
            
            double c = x / e;
            double a = (c + e) / 2;
            
            e = a;
        }
        
        return e;
    }
    
    long long absoluteValue(long long x){
        
        if(x < 0){
            
            x *= -1;
        }
        
        return x;
    }
};
