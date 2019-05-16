class Solution {
    public String toLowerCase(String str) {
        char [] arrayStr = null;
        arrayStr = str.toCharArray();
        
        for(int i=0; i< arrayStr.length; i++) {
            if(97<=arrayStr[i] && arrayStr[i]<=122) {
                arrayStr[i]=(char)(arrayStr[i]-32);
            }
        }
        String b = new String(arrayStr);
        return b;
    }
    
      public static void main(String[] args) {
           Solution s = new Solution();
           System.out.println(s.toLowerCase("lovely"));
      
      }
}