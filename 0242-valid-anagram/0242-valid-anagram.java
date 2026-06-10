class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        if(s.length() != t.length()) return false;
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);

    }
}