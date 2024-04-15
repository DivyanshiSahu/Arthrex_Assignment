# Auto-Suggest Feature

This Java program implements an auto-suggest feature similar to the type-ahead functionality seen in search engines like Google. Given a list of words, the program provides suggestions based on user input queries.

## Requirements
- Java Development Kit (JDK)
- IDE or text editor

## How to Run
1. Clone the repository or download the AutoSuggest.java file.
2. Compile the Java file using the command:
   ```bash
   javac AutoSuggest.java

Run the compiled program using the command:

java AutoSuggest

2.Follow the prompts to input the list of words and the query. The program will then provide suggestions based on the query.
Example
Suppose the input words are: "take", "make", "check", "ack", "rake".

Example 1:
Input: "ke"
Expected Output: ["take", "make", "rake"]
Example 2:
Input: "*k"
Expected Output: ["check", "ack"]

## Additional Test Cases
Queries with single letters ("t", "r").
Queries matching a single word exactly ("make", "check", "rake").
Queries with no matching words ("x", "ak").
Query with the wildcard character "*" which should return an empty list.

## Approach
The program defines a class AutoSuggest with methods to store the input words and provide suggestions.
Input words are stored in a list and suggestions are generated based on prefix matching or substring matching, depending on the query.
The program uses a Scanner object to get user input for words and queries.

## Testing
Testing can be done by running the program with different input words and queries to verify that the suggestions are accurate.
This README.md file provides instructions on how to run the program, examples of input and output, additional test cases, the approach used to implement the auto-suggest feature, and suggestions for testing the program.
