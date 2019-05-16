class Solution {
    public String toLowerCase(String str) {
        if ( str == null || "".equals(str) ) return str;

        return str.toLowerCase();
    }
    
    public static void main(String... str) {
        String[] strs = new String[] { 
            "Hello", "here", "LOVELY"
        };

        for (String str1 : strs) {
            System.out.println("Input: " + str1);
            System.out.println("Output:" + new Solution().toLowerCase(str1));
        }
    }
}