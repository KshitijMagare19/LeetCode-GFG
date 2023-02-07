# Program to print reciprocal of letters - copy
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string S, we need to find reciprocal of it. The reciprocal of the letter is found by finding the difference between the position of the letter and the first letter ‘A’. Then decreasing the same number of steps from the last letter ‘Z’. The character that we reach after above steps is reciprocal.<br>
Reciprocal of Z is A and vice versa because if you reverse the position of the alphabet A will be in the position of Z.<br>
Similarly, if the letter is a small case then the first letter will be 'a'&nbsp;and the last letter will be 'z'. and the definition of reciprocal remains the same.</span></p>

<p><span style="font-size:18px"><strong>Note</strong>: If the character is not a letter its reciprocal will be the same character.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
S = "ab C"
<strong>Output</strong>:
zy X
<strong>Explanation:</strong>
The reciprocal of the first letter 'a' is 'z'.
The reciprocal of the second letter 'b' is 'y'.
The reciprocal of the third letter ' ' is ' '.
The reciprocal of the last letter 'C' is 'X'.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
S = "Ish"
<strong>Output</strong>:
Rhs
<strong>Explanation:
</strong>The reciprocal of the first letter 'I' is 'R'.
The reciprocal of the second letter 's' is 'h'.
The reciprocal of the third letter 'h' is 's'.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>reciprocalString()</strong>&nbsp;which takes the string S as input parameter&nbsp;and returns the reciprocal string.<br>
<br>
<strong>Expected Time Complexity:</strong>&nbsp;O(|S|) where |S|&nbsp;denotes&nbsp;the length&nbsp;of the&nbsp;string S.<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(|S|)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&nbsp;&lt;= |S| &lt;= 10<sup>4</sup></span></p>
</div>