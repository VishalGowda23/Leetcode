class Solution {
    public int compress(char[] chars) {

        int write = 0;   // Position to write compressed characters
        int count = 1;   // Count of consecutive characters

        for (int i = 1; i <= chars.length; i++) {

            // End of current group
            if (i == chars.length || chars[i] != chars[i - 1]) {

                // Write the character
                chars[write] = chars[i - 1];
                write++;

                // Write the count only if greater than 1
                if (count > 1) {

                    String str = String.valueOf(count);

                    for (char c : str.toCharArray()) {
                        chars[write] = c;
                        write++;
                    }
                }

                // Reset count for next group
                count = 1;
            } else {
                count++;
            }
        }

        return write;
    }
}