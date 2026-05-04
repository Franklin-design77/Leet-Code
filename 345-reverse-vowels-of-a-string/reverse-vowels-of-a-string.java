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
        return String.valueOf(name);
    }
    private boolean isVowels(char c){
            return "AEIOUaeiou".indexOf(c)!=-1;
            //return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
              
        }
    
}



/*class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

           
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
*/
