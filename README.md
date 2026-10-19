# Project 1.2.10 Mad Libs: Team Work Split (5 people)

Goal: a single `MadLib.java` program that takes an incomplete story such as
`I went to the animal <noun>; the <plural noun> and the <number> beasts were there.`,
asks the user for each part of speech, and prints the finished story.

## Project requirements (from the scoring guidelines)
- [ ] Class header matches the file name (`public class MadLib`)
- [ ] `main` method
- [ ] camelCase where appropriate
- [ ] Comments describing the algorithms
- [ ] A variable containing the incomplete Mad Lib
- [ ] Only String methods from the AP CSA Java Quick Reference (`length`, `substring(int,int)`, `substring(int)`, `indexOf(String)`, `equals`, `compareTo`)
- [ ] Algorithm(s) that process user input
- [ ] Algorithm(s) to parse for the parts of speech to replace
- [ ] Algorithm(s) to parse for sections of the Mad Lib to include
- [ ] Various prompts to keep the user on track
- [ ] A final print statement showing the completed story

## Shared contract (agree on this first, so everyone can code in parallel)
One file, `MadLib.java`. Each person owns the methods listed under their name and does not edit anyone else's methods without asking.

```java
public class MadLib {
    public static void main(String[] args)                                // Person 1
    // Person 1: String story = "...<noun>...";   (the variable holding the incomplete Mad Lib)

    public static int findTagStart(String story, int from)                // Person 2: index of next '<', or -1
    public static int findTagEnd(String story, int from)                  // Person 2: index of next '>', or -1
    public static String getPartOfSpeech(String story, int start, int end)// Person 2: text inside the < >

    public static String getSection(String story, int from, int tagStart) // Person 3: story text before the next tag
    public static String getRemainder(String story, int from)             // Person 3: story text after the last tag

    public static String promptUser(Scanner in, String partOfSpeech)      // Person 4: asks and returns the answer
}
```

Main loop (Person 1 writes it, Persons 2 to 4 supply the pieces):
find next `<`, then add the plain text before it (P3), read the part of speech inside `<...>` (P2), prompt the user (P4), append the answer, repeat from after `>`. When no tags remain, append the remainder (P3) and print (P1).

## Assignments

### Person 1: Lead / Program Structure / Integration
- Create `MadLib.java` with the class header and `main` (requirements: class header, main, camelCase).
- Declare the variable holding the incomplete Mad Lib. Write the two sample stories from the handout and one original three-blank story (for the elbow-partner swap in step 7).
- Write the main loop in `main` that calls everyone's methods and builds the completed story.
- Write the intro message and the **final print statement** (requirement: final print).
- Merge everyone's code and resolve conflicts. Do final camelCase and style pass.
- Done when: the program compiles and prints a full story using the stubbed methods.

### Person 2: Parsing the Parts of Speech
- Write `findTagStart`, `findTagEnd`, `getPartOfSpeech` using only `indexOf` and `substring` (requirement: algorithm to parse for the parts of speech to replace).
- Handle multi-word tags like `<plural noun>` and the "no more tags" case (return -1).
- Add comments explaining the algorithm.
- Done when: given the sample stories, it returns `noun`, `plural noun`, `number` in order.

### Person 3: Parsing the Story Sections
- Write `getSection` and `getRemainder` using `substring` and `length` (requirement: algorithm to parse for sections of the Mad Lib to include).
- Make sure no characters are lost or doubled around the tags (spaces, semicolons, periods).
- Add comments explaining the algorithm.
- Done when: pieces of text plus the answers stitch back together to the exact original story format.

### Person 4: User Input and Prompts
- Write `promptUser` using `Scanner` (requirement: algorithm that processes user input; various prompts).
- Vary the prompt by part of speech, for example "Enter a plural noun:" and "Enter a number:". Use "an" before vowels, as in "Enter an adjective:" (use `substring(0,1)` and `equals`/`indexOf` against "aeiou").
- Optional: reject an empty answer and re-prompt.
- Done when: each part of speech gets a clear, distinct prompt and returns the user's answer.

### Person 5: Testing, Documentation, and Presentation
- Run incremental tests as each piece lands, and re-test old features after each merge (step 6). Keep a bug list.
- Check the requirements checklist above against the final code, and confirm only Quick Reference String methods are used.
- Make sure the code has a header comment stating the program's purpose and how it meets the requirements (step 9).
- Take the quality **screenshot** (not from a phone) showing the original Mad Lib and its solution.
- Build the milestone chart (estimated vs. actual times) and collect the challenges notes from everyone for the notebook.
- Draft the short presentation: what each part does, hardest parts, and the conclusion reflection on how planning helped.
- Run the elbow-partner swap with another team's Mad Lib.

## Suggested timeline
| Step | Who | Notes |
|---|---|---|
| 1. Agree on the contract above | Everyone | 10 min |
| 2. Write own methods against stubs | P1 to P4 | In parallel |
| 3. Merge and test | P1 and P5 | Re-test everything after each merge |
| 4. Evaluate, screenshot, document | P5 with everyone | Each person explains their part |
| 5. Present | Everyone | Each person presents the part they wrote |
