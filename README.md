# Diagonal_Difference
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
## Input Format
The first line contains a single integer, n denoting the number of rows and columns in the matrix a. 
The next n lines denote the matrix a's rows, with each line containing n space-separated integers describing the columns.
## Constraints
* -100 <= Elements in the Matrix <= 100
## Output Format
Print the absolute difference between the sums of the matrix's two diagonals as a single integer.
 
 **Sample Input**
```
3
11 2 4
4 5 6
10 8 -12
```

 **Sample Output**
 ```
 15
 ```
 ## Explanation
 The primary diagonal is:
 ```
 11
    5
      -12
```
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
```
      4
    5
 10
```
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15

<B> Note : |x| is the absolute value of x
