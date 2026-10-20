# Project 1.2.10 Mad Libs: Team Work Split 

Goal: a single `MadLib.java` program that takes an incomplete story such as
`I went to the animal <noun>; the <plural noun> and the <number> beasts were there.`,
asks the user for each part of speech, and prints the finished story.

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
2. Lead will merge all pull requests into the main repo
3. Person 1 will combine all the individual pieces into a workable program.


Main loop (Person 1 writes it, Persons 2 to 4 supply the pieces):
find next `<`, then add the plain text before it (P3), read the part of speech inside `<...>` (P2), prompt the user (P4), append the answer, repeat from after `>`. When no tags remain, append the remainder (P3) and print (P1).

## Assignments

### Project Manager
- Review every person's code before it is merged: correct logic, camelCase, comments describing the algorithm, and only Quick Reference String methods.
- Notify if any fixes are required.
- End to end testing.
- Also: collect everyone's challenges and fixes for the PLTW notebook and write the conclusion answer (how planning and design helped).

### Person 1: Lead Developer / Program Structure / Integration
- Create `MadLib.java` with the class header and `main` (requirements: class header, main, camelCase).
- Declare the variable holding the incomplete Mad Lib. Write the two sample stories from the handout and one original three-blank story (for the elbow-partner swap).
- Write the main loop in `main` that calls everyone's methods and builds the completed story.
- Write the intro message and the **final print statement**.
- Done when: the program compiles and prints a full story using the stubbed methods.


### Person 2: Parsing the Parts of Speech
- Write `findTagStart`, `findTagEnd`, `getPartOfSpeech` using only `indexOf` and `substring` (requirement: algorithm to parse for the parts of speech to replace).
- Handle multi-word tags like `<plural noun>` and the "no more tags" case (return -1).
- Add comments explaining the algorithm.
- Done when: given the sample stories, it returns `noun`, `plural noun`, `number` in order.
- Also: build and maintain the **milestone chart** (estimated vs. actual time to develop for every person's piece).

### Person 3: Parsing the Story Sections
- Write `getSection` and `getRemainder` using `substring` and `length` (requirement: algorithm to parse for sections of the Mad Lib to include).
- Make sure no characters are lost or doubled around the tags (spaces, semicolons, periods).
- Add comments explaining the algorithm.
- Done when: pieces of text plus the answers stitch back together to the exact original story format.
- Also: build the short **presentation** (what each part does, hardest parts) and decide who presents which part.

### Person 4: User Input and Prompts
- Write `promptUser` using `Scanner` (requirement: algorithm that processes user input; various prompts).
- Vary the prompt by part of speech, for example "Enter a plural noun:" and "Enter a number:". Use "an" before vowels, as in "Enter an adjective:" (use `substring(0,1)` and `equals`/`indexOf` against "aeiou").
- Done when: each part of speech gets a clear, distinct prompt and returns the user's answer.

### Person 5: Testing and Code Documentation Presentation
- Run incremental tests as each piece lands, and re-test old features after each merge. Keep a bug list and report bugs to the method's owner.
- Audit the final code against the requirements checklist, and confirm only Quick Reference String methods are used.
- Make sure the code has a header comment stating the program's purpose and how it meets the requirements, and that every algorithm is commented.
- Take the quality **screenshot** (not from a phone) showing the original Mad Lib and its solution.
- Test the swap: run another team's Mad Lib through the program.
- Tell the PM which tests pass and fail so the PM can verify.
- Also: set up the elbow-partner swap with another team.
- make slide deck and presentation plan