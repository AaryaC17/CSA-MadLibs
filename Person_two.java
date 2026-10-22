/*
 Person 2: Parsing the Parts of Speech
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


/*
 For Person 1 - how to use these in the main loop
 These methods only look at the FIRST tag in whatever String you give them
 So after each tag you have to cut the story to everything after the '>'
 or it will keep finding the same tag over and over

 Each loop:
   int tagStart = findTagStart(rest);
   int tagEnd = findTagEnd(rest, tagStart);   // needs both arguments
   if tagEnd == -1 there are no tags left so stop the loop
   String partOfSpeech = getPartOfSpeech(rest);
   rest = rest.substring(tagEnd + 1);          // cut off the used tag

 findTagStart and findTagEnd return -1 when there are no tags left
 getPartOfSpeech returns "" when there are no tags left


 Find the tag (findTagStart, findTagEnd)
If tagEnd == -1, stop
Add the text before the < (Person 3)
Get the part of speech (getPartOfSpeech)
Ask the user (Person 4) and add their answer
Cut rest after the >
 */
