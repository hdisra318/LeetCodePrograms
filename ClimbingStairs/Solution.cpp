/* Problem 70: Climbing Stairs */
class Solution {
public:
    int climbStairs(int n) {
        
        // n-1 position  n posistion on the stairs
        int oneStep = 1, twoStep = 1;
        
        int temp;
        
        for(int i = 0; i<n-1; ++i){
            
            temp = oneStep;
            //Adding the step 1 plus the step 2
            oneStep += twoStep;
            twoStep = temp;
        }
        
        return oneStep;
    }
};
