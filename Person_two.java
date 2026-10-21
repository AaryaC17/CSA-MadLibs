/*
 Person 2:
 Find tags like <noun> or <plural noun> in a Mad Lib story and return
 the part of speech written inside them
 Only uses indexOf and substring from the Quick Reference
 */
public class TagParser
{
    /*
     Returns where the first '<' is, or -1 if there are no tags left
     indexOf already gives -1 if it can't find it so we just return that
     */
    public static int findTagStart(String story)
    {
        return story.indexOf("<");
    }

    /*
     Returns where the '>' after tagStart is, or -1 if there isn't one
     indexOf(String) always searches from the start, so we cut the story at
     tagStart first, search that part, then add tagStart back to get the
     real position in the full story
     */
    public static int findTagEnd(String story, int tagStart)
    {
        if (tagStart == -1)
        {
            return -1; // no '<' so there's no tag to close
        }
        int endInPiece = story.substring(tagStart).indexOf(">");
        if (endInPiece == -1)
        {
            return -1; // found '<' but it never closes
        }
        return tagStart + endInPiece;
    }

    /*
     Returns the part of speech inside the first tag,
     or "" if there's no complete tag left
     Finds both brackets and takes everything between them, the +1 skips
     the '<' and substring stops right before the '>'
     Spaces stay in so multi word tags like <plural noun> still work
     */
    public static String getPartOfSpeech(String story)
    {
        int tagStart = findTagStart(story);
        int tagEnd = findTagEnd(story, tagStart);
        if (tagEnd == -1)
        {
            return ""; // also covers no '<' since findTagEnd returns -1 then
        }
        return story.substring(tagStart + 1, tagEnd);
    }
}
