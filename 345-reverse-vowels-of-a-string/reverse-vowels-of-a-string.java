class Solution {
    public String reverseVowels(String s) {
        char []name=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!isVowels(name[left])){
                left++;
            }
            else if(!isVowels(name[right])){
                right--;
            }
            else{
                
                char temp=name[left];
                name[left]=name[right];
                name[right]=temp;
                left++;
                right--;
            }
        }
        return new String(name);
    }
    private boolean isVowels(char c){
            return "AEIOUaeiou".indexOf(c)!=-1;
        }
    
}