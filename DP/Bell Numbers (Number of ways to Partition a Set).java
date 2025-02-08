What is a Bell Number? 
Let S(n, k) be total number of partitions of n elements into k sets. The value of the n’th Bell Number is the sum of S(n, k) for k = 1 to n. 
Bell(n)=∑​S (n,k) for k ranges from [1,n]
Value of S(n, k) can be defined recursively as, S(n+1, k) = k*S(n, k) + S(n, k-1)

How does above recursive formula work? 
When we add a (n+1)’th element to k partitions, there are two possibilities. 
1) It is added as a single element set to existing partitions, i.e, S(n, k-1) 
2) It is added to all sets of every partition, i.e., k*S(n, k).
First few Bell numbers are 1, 1, 2, 5, 15, 52, 203, …. 

Input:  n = 2
Output: 2
Explanation: Let the set be {1, 2}. The partitions are {{1},{2}} and {{1, 2}}.


Input:  n = 3
Output: 5
Explanation: Let the set be {1, 2, 3}. The partitions are {{1},{2},{3}}, {{1},{2, 3}}, {{2},{1, 3}}, {{3},{1, 2}}, {{1, 2, 3}}. 
