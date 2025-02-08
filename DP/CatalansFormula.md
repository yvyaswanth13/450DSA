--The nth term in the sequence denoted Cn, is found in the following formula: 
C(n) = (2n)! / ((n+1)! * n!) 

C(n) = Σ (i=0 to n-1) C(i) * C(n-i-1)

    or
 C(n) = Σ (i=1 to n) C(i-1) * C(n-i)
 
Why Are They Equivalent?
Let's compare the summation indices:

Your Formula:

The index 𝑖 runs from 1 to 𝑛
 Σ  C(i-1) * C(n-i)

Standard Formula:

The index 
i runs from 0 to n−1.
Each term is 
 Σ 𝐶𝑖 ×C(n−i−1).
If we substitute j=i−1, then:

When i=1, we get j=0.
When i=n, we get j=n−1.
The first few Catalan numbers for n = 0, 1, 2, 3, … are : 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …  
    


