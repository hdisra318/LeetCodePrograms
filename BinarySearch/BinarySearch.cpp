/*
  Implementation of Binary Search Algorithm
*/
#include<iostream>
#include<vector>
#include<math.h>

using namespace std;

int binarySearch(vector<int>&, int, int, int);
int search(vector<int>&, int);

int main(){

  // [-1,0,3,5,9,12]
  vector<int> nums;

  nums.push_back(-1);
  nums.push_back(0);
  nums.push_back(3);
  nums.push_back(5);
  nums.push_back(9);
  nums.push_back(12);
  
  cout << "-> Pos 4 == "<<search(nums, 9)<<endl;  

}

/*
  nums - set of numbers
  target - number to search in nums
*/
int search(vector<int>& nums, int target) {
      
  int a = 0, b = nums.size()-1;
        
  return binarySearch(nums, a, b, target);
}
    
int binarySearch(vector<int>& v, int a, int b, int n){
        
  int mid;
        
  if(a>b)
    return -1;
        
  mid = floor((a+b)/2);
        
  if(n == v[mid])
    return mid;
        
  if(n < v[mid])
    return binarySearch(v, a, mid-1, n);
  else
    return binarySearch(v, mid +1, b, n);
            
}
