package neu.shravya;

public class StringCompression {
    public static int stringCompressionMethod(char[] chars) {
        int count = 0;
        int j = 0;
        int i;
        char currentElement;
        int aI = 0;

        while (j < chars.length) {

            currentElement = chars[j];

            for (i = j; i < chars.length; i++) {
                if (currentElement == chars[i]) {
                    count++;
                } else {
                    break;
                }
            }
            j = i;
            chars[aI++] = currentElement;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[aI++] = c;
                }
            }
            count = 0;
        }
        return aI;
    }
}
