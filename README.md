# Project 1.2.10 Mad Libs: Team Work Split 

## Project requirements 
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


1. Everyone makes their own file on their own personal fork for their specific tasks
2. PM will merge all pull requests into the main repo
3. Person 1 will fork the merged main repo and combine all the individual pieces into a workable program.


## Shared rules
- **Workflow:** each person forks the repo and works in their own file (each person picks their own file name; Person 1 works in `MadLib.java`). Each file has a class named after the file and a small test `main` for that person's methods. When done, each person opens a pull request into the main repo, and the PM reviews it before it is merged.
- **Connector:** Person 1 is the connector. After the merges, Person 1 copies each person's methods **unchanged** into `MadLib.java` as methods of `public class MadLib`, and wires them together in `main`. This is why the method names and signatures below must not change.
- **Final submission is one file:** `MadLib.java` only. The per-person dev files are deleted before submitting, so there are no extra classes. The class header must match the file name.
- **Tag format:** tags use spaces, like `<plural noun>` (not `<plural_noun>`), so no underscore parsing is needed for prompts.
- **One Scanner:** `main` creates a single `Scanner` and passes it to `promptUser`. Never create a new `Scanner` inside a method.
- **Method signatures:**

```java
public static int findTagStart(String story, int from)                 // P2: index of next '<' at or after from, or -1
public static int findTagEnd(String story, int from)                   // P2: index of next '>' at or after from, or -1
public static String getPartOfSpeech(String story, int start, int end) // P2: text between '<' (at start) and '>' (at end)
public static String getSection(String story, int from, int tagStart)  // P3: story text from 'from' up to tagStart
public static String getRemainder(String story, int from)              // P3: story text from 'from' to the end
public static String promptUser(Scanner in, String partOfSpeech)       // P4: prompts and returns the user's answer
```

Main loop (Person 1 writes it, Persons 2 to 4 supply the pieces):
find next `<`, then add the plain text before it (P3), read the part of speech inside `<...>` (P2), prompt the user (P4), append the answer, repeat from after `>`. When no tags remain, append the remainder (P3) and print (P1).

## Assignments

### Project Manager
- Review every person's code before it is merged: correct logic, camelCase, comments describing the algorithm, and in collaboration with Person 5
- Notify if any fixes are required.
- End to end testing.

### Person 1: Lead Developer / Program Structure
- Create `MadLib.java` with the class header and `main` (requirements: class header, main, camelCase).
- Declare the variable holding the incomplete Mad Lib. Write the two sample stories from the handout and one original three-blank story (for the elbow-partner swap).
- Create the single `Scanner` in `main` and pass it to `promptUser`.
- Write the main loop in `main` that calls everyone's methods and builds the completed story. Until the others merge, code against stub methods with the agreed signatures.
- Be the connector: copy each person's merged methods into `MadLib.java`, fix any name or signature mismatches with the owner, and delete the per-person dev files before submitting.
- `main` runs all three stories in one run (one after another, same Scanner), so a single screenshot shows all three tests.
- For each story, write an intro message, print the original incomplete story first, then the prompts, then the final print statement with the completed story.
- Done when: the program compiles and prints a full story using the stubbed methods.


### Person 2: Parsing the Parts of Speech
- Write `findTagStart`, `findTagEnd`, `getPartOfSpeech` using only `indexOf` and `substring` (requirement: algorithm to parse for the parts of speech to replace).
- Handle multi-word tags like `<plural noun>` and the "no more tags" case (return -1).
- Add comments explaining the algorithm.
- Add comments next to your code that name the requirement it meets, for example `// Requirement: parse for the parts of speech to replace` (the rubric gives points for comments that clearly indicate where requirements are met).
- Done when: given the sample stories, it returns `noun`, `plural noun`, `number` in order.

### Person 3: Parsing the Story Sections
- Write `getSection` and `getRemainder` using `substring` and `length` (requirement: algorithm to parse for sections of the Mad Lib to include).
- Make sure no characters are lost or doubled around the tags (spaces, semicolons, periods).
- Add comments explaining the algorithm.
- Add comments next to your code that name the requirement it meets, for example `// Requirement: parse for sections of the Mad Lib to include` (the rubric gives points for comments that clearly indicate where requirements are met).
- Done when: pieces of text plus the answers stitch back together to the exact original story format.

### Person 4: User Input and Prompts
- Write `promptUser` using `Scanner` (requirement: algorithm that processes user input; various prompts).
- Vary the prompt by part of speech, for example "Enter a plural noun:" and "Enter a number:". Use "an" before vowels, as in "Enter an adjective:" (use `substring(0,1)` and `equals`/`indexOf` against "aeiou").
- Add comments next to your code that name the requirement it meets, for example `// Requirement: algorithm that processes user input` (the rubric gives points for comments that clearly indicate where requirements are met).
- Done when: each part of speech gets a clear, distinct prompt and returns the user's answer.

### Person 5: Testing, Code Documentation, and Presentation
- Run incremental tests on the code, and re-test old features after each merge. Keep a bug list and report bugs to the method's owner.
- Audit the final code against the requirements checklist.
- Penalty checks: no compile errors or warnings, no leftover debug prints, no extra classes, and the class header matches the file name.
- Make sure the screenshot shows the original story and its solution for all three stories.
- Make sure the code has a header comment stating the program's purpose and how it meets the requirements, and that every algorithm is commented.
- Take the quality **screenshots** (not from a phone) showing the original Mad Lib and its solution.
- Document the test cases: for each of the three Mad Libs, write down the inputs entered and the output produced.
- Test the swap: run another team's Mad Lib through the program.
- Tell the PM which tests pass and fail so the PM can verify.
- Make the slide deck and the presentation plan: summarize what each part of the program does, the most challenging parts, and who presents which part.