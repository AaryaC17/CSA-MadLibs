public class MadLib {
    /**
     * Extracts and returns the substring from the current starting position up to (but not including) the opening tag index ('<').
     *
     * story - The full or remaining Mad Lib story string.
     * tagStart - The index of the opening bracket '<' of the tag.
     * Returns: The plain text string that appears before the tag.
     */
    public static String getSection(String story, int tagStart) {
        // Use substring(startIndex, endIndex)
        // Extract text from index 0 up to tagStart (exclusive)
        return story.substring(0, tagStart);
    }

    /**
     * Extracts and returns the rest of the story after the closing tag index ('>').
     *
     * story - The story string.
     * tagEnd - The index of the closing bracket '>' of the tag.
     * Returns: The remaining portion of the story after the tag.
    */  
    public static String getRemainder(String story, int tagEnd) {
        // Ensure tagEnd is within bounds before taking the substring after '>'
        if (tagEnd + 1 <= story.length()) {
            // substring(beginIndex) extracts from tagEnd + 1 to the end of the string
            return story.substring(tagEnd + 1);
        }
        return "";
    }
}