Dry Run of Minimum Jumps to Reach the End (Recursive Approach)
Input:
arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Goal: Reach arr[10] from arr[0] using the minimum jumps.

Step 1: Start at Index 0
->arr[0] = 1, meaning we can jump to: 
Index 1
Call minJumpsRecur(1, arr) 

Step 2: At Index 1
arr[1] = 3, meaning we can jump to:

Index 2
Index 3
Index 4
The loop iterates for j = 2, 3, 4:
Call minJumpsRecur(2, arr), minJumpsRecur(3, arr), minJumpsRecur(4, arr).

Initialize ans = Integer.MAX_VALUE.
->

Step 3: At Index 2
->
arr[2] = 5, meaning we can jump to:
->
Index 3
Index 4
Index 5
Index 6
Index 7
The loop iterates for j = 3, 4, 5, 6, 7.
Call minJumpsRecur(3, arr), minJumpsRecur(4, arr), minJumpsRecur(5, arr), etc.
Initialize ans = Integer.MAX_VALUE.


Step 4: At Index 3
->
arr[3] = 8, meaning we can jump to:
->
Index 4
Index 5
Index 6
Index 7
Index 8
Index 9
Index 10 (Reached the end)
Since we reached the end, return 0.
minJumpsRecur(10, arr) → returns 0
->
Update ans:
->
ans = Math.min(ans, 1 + 0) = 1
->
Return 1 for minJumpsRecur(3, arr).
->

Step 5: Backtracking Updates
We update ans as we return:
Returning to Index 2
->The jump from index 2 → 3 took 1 step.
->ans = Math.min(ans, 1 + 1) = 2
->Return 2 for minJumpsRecur(2, arr).
Returning to Index 1
->The jump from index 1 → 2 took 1 step.
->ans = Math.min(ans, 1 + 2) = 3
->Return 3 for minJumpsRecur(1, arr).
Returning to Index 0
->The jump from index 0 → 1 took 1 step.
->ans = Math.min(ans, 1 + 3) = 3
->Return 3 for minJumpsRecur(0, arr).

Final Answer
✅ Output = 3 (Path: 1 → 3 → 9 → 9)

Summary of ans Updates
Step	Current Index	Jumped To	ans Value
1	0 → 1		3
2	1 → 3		2
3	3 → 10	Reached end	1
Would you like to optimize this using memoization or a greedy approach?
