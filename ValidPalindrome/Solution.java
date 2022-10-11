/**
 * Problem 125. Valid Palindrome
 */
class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.equals(" "))
            return true;
        s = s.toLowerCase();
        s = removeNoLetters(s);
        
        String reverse = reverseOf(s);
        
        if(s.equals(reverse))
            return true;
        else
            return false;
    }
    
    private String reverseOf(String s){
        
        String reverse = "";
        
        for(int i = s.length()-1; i>=0; i--){
            
            reverse += s.charAt(i);
        }
        
        return reverse;
    }
    
    private String removeNoLetters(String s){
        
        String newWord = "";
        
        for(int i = 0; i<s.length(); ++i){
            
            switch(s.charAt(i)){
                    
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                case '0':
	            case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    newWord += s.charAt(i);
                    
            }
        }
        
        return newWord;
    }
}
