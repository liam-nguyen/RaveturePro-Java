package assignment.string;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println(isAnagram("angle", "glean"));
        System.out.println(isAnagram("angles", "glean"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] chars = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i)]++;
            chars[s2.charAt(i)]--;
        }

        boolean isAnagram = true;
        for (int v : chars) {
            if (v != 0) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}
