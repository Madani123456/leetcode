class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean counting = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                length++;
                counting = true;
            } else if (counting) {
                break; // We already started counting and hit a space
            }
        }

        return length;
    }
}
