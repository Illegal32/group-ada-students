package az.coders.ada_students.lessons.lesson_19;

class Solution19_1 {
    public String longestCommonPrefix(String[] strs) {
        if ( strs.length == 0 ) return "";

        int a = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            a = Math.min(a, strs[i].length());

            for (int j = 0; j < a; j++) {
                char c = strs[0].charAt(j);
                char c1 = strs[i].charAt(j);
                if ( c != c1 )
                    a = j;

            }
        }
        return strs[0].substring(0, a);
    }

    public static class LongestCommonPrefix {
        public static void main(String[] args) {
            Solution19_1 solution19_1 = new Solution19_1();
            String[] strs = {"flower", "flow", "flight"};
            System.out.println(solution19_1.longestCommonPrefix(strs));

        }
    }
}
