class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;    
    
        }
        if(x<0||x%10==0){
            return false;
        }
        int temp=x;
        int rev=0;
        while(temp!=0){
            int digit=temp%10;
            temp=temp/10;
            rev=(rev*10)+digit;
        }
        if(rev==x){
            return true;
        }else{
            return false;
        }      
    }
}
