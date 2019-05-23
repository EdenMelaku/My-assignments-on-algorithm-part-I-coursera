# auto grader output on may 23 submit got 61

```

See the Assessment Guide for information on how to interpret this report. 
ASSESSMENT SUMMARY 

Compilation: PASSED 
API: PASSED

Spotbugs: PASSED
PMD: FAILED (3 warnings)
Checkstyle: FAILED (0 errors, 163 warnings) 
Correctness: 18/33 tests passed 
Memory: 0/8 tests passed
Timing: 18/20 tests passed 
Aggregate score: 60.73%
[Compilation: 5%, API: 5%, Spotbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%] 
ASSESSMENT DETAILS The following files were submitted:
----------------------------------
3.7K May 23 04:42 Percolation.java 
2.3K May 23 04:42 PercolationStats.java
******************************************************************************** *
                        COMPILING
******************************************************************************** 
                    % javac Percolation.java 
-----------------------------------------------------------
                    % javac PercolationStats.java *
-----------------------------------------------------------
================================================================
Checking the APIs of your programs. 
*----------------------------------------------------------- 
Percolation: PercolationStats:
================================================================
******************************************************************************** 
* CHECKING STYLE AND COMMON BUG PATTERNS *
******************************************************************************* 
% spotbugs *.class *
-----------------------------------------------------------
================================================================ 
% pmd . *
----------------------------------------------------------- 
Percolation.java:10: The private instance (or static) variable 'bottom' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
Percolation.java:11: The private instance (or static) variable 'top' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField] 
Percolation.java:104: Avoid unused local variables, such as 'v'. [UnusedLocalVariable] 

PMD ends with 3 warnings.
================================================================ 
% checkstyle *.java *-----------------------------------------------------------
[WARN] Percolation.java:6:1: File contains tab characters (this is the first occurrence). Configure your editor to replace tabs with spaces. [FileTabCharacter]
[WARN] Percolation.java:30:22: ';' is preceded with whitespace. [NoWhitespaceBefore]
[WARN] Percolation.java:30:24: ';' is not followed by whitespace. [WhitespaceAfter]
[WARN] Percolation.java:36:11: '=' is not preceded with whitespace. [WhitespaceAround] 
[WARN] Percolation.java:36:12: '=' is not followed by whitespace. [WhitespaceAround] 
[WARN] Percolation.java:37:14: '=' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:37:15: '=' is not followed by whitespace. [WhitespaceAround] 
[WARN] Percolation.java:44:21: '(' is preceded with whitespace. [MethodParamPad] 
[WARN] Percolation.java:44:22: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:44:31: ')' is preceded with whitespace. [ParenPad] 
[WARN] Percolation.java:46:16: '(' is followed by whitespace. [ParenPad]
[WARN] Percolation.java:46:25: '(' is preceded with whitespace. [MethodParamPad]
[WARN] Percolation.java:46:26: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:46:31: ',' is not followed by whitespace. [WhitespaceAfter] 
[WARN] Percolation.java:46:34: ')' is preceded with whitespace. [ParenPad] 
[WARN] Percolation.java:49:45: '(' is followed by whitespace. [ParenPad]
[WARN] Percolation.java:49:54: ')' is preceded with whitespace. [ParenPad] 
[WARN] Percolation.java:53:24: '(' is followed by whitespace. [ParenPad]
[WARN] Percolation.java:53:33: ')' is preceded with whitespace. [ParenPad] 
[WARN] Percolation.java:53:42: '==' is not preceded with whitespace. [WhitespaceAround] 
[WARN] Percolation.java:53:44: '==' is not followed by whitespace. [WhitespaceAround] 
[WARN] Percolation.java:54:25: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:55:26: '(' is followed by whitespace. [ParenPad]
[WARN] Percolation.java:58:24: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:58:33: ')' is preceded with whitespace. [ParenPad] 
[WARN] Percolation.java:58:42: '==' is not preceded with whitespace. [WhitespaceAround]
[WARN] Percolation.java:58:44: '==' is not followed by whitespace. [WhitespaceAround]
[WARN] Percolation.java:59:25: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:64:24: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:64:35: ')' is preceded with whitespace. [ParenPad] 
[WARN] Percolation.java:64:48: '(' is preceded with whitespace. [MethodParamPad] 
[WARN] Percolation.java:64:49: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:64:60: ')' is preceded with whitespace. [ParenPad]
[WARN] Percolation.java:65:25: '(' is followed by whitespace. [ParenPad] 
[WARN] Percolation.java:65:47: '(' is preceded with whitespace. [MethodParamPad] 
[WARN] Percolation.java:65:48: '(' is followed by whitespace. [ParenPad]
[WARN] Percolation.java:65:59: ')' is preceded with whitespace. [ParenPad]
[WARN] Percolation.java:66:26: '(' is followed by whitespace. [ParenPad]
[WARN] Percolation.java:66:48: '(' is preceded with whitespace. [MethodParamPad] 
... Checkstyle ends with 0 errors and 155 warnings. 

% custom checkstyle checks for Percolation.java 
*-----------------------------------------------------------
[WARN] Percolation.java:6:17: Can you use the type 'boolean[][]' instead of 'int[][]'? [Design]
[WARN] Percolation.java:22:26: Do not print to standard output in 'Percolation()'. [SideEffect]

Checkstyle ends with 0 errors and 2 warnings.
% custom checkstyle checks for PercolationStats.java *
-----------------------------------------------------------
[WARN] PercolationStats.java:1: The number (0) of calls to 'Integer.parseInt()' must equal the number (2) of integer command-line arguments. [CommandLineArgument]
[WARN] PercolationStats.java:16:34: Do not print to standard output in 'PercolationStats()'. [SideEffect]
[WARN] PercolationStats.java:24:34: Do not print to standard output in 'PercolationStats()'. [SideEffect] 
[WARN] PercolationStats.java:35:34: Do not print to standard output in 'PercolationStats()'. [SideEffect] 
[WARN] PercolationStats.java:36:34: Do not print to standard output in 'PercolationStats()'. [SideEffect] 
[WARN] PercolationStats.java:37:34: Do not print to standard output in 'PercolationStats()'. [SideEffect] 

Checkstyle ends with 0 errors and 6 warnings. 
================================================================ 
******************************************************************************** 
* TESTING CORRECTNESS 
********************************************************************************
Testing correctness of Percolation *

----------------------------------------------------------- 
Running 18 total tests. Tests 1 through 8 create a Percolation object using your code, 
then repeatedly open sites by calling open(). After each call to open(), it checks the return values of isOpen(), percolates(),
numberOfOpenSites(), and isFull() in that order. Tests 11 through 14 create a Percolation object using your code, then repeatedly
call the methods open(), isOpen(), isFull(), percolates(), and, numberOfOpenSites() in random order with probabilities 
p = (p1, p2, p3, p4, p5). The tests stop immediately after the system percolates. Tests 16 through 18 test backwash. 
Except as noted, a site is opened at most once. 

Test 1: open predetermined list of sites using file inputs 
* filename = input6.txt length= 6 
* filename = input8.txt length= 8 
* filename = input8-no.txt length= 8
* filename = input10-no.txt length= 10 
* filename = greeting57.txt length= 57 
* filename = heart25.txt length= 25 

==> passed 


Test 2: open random sites until just before system percolates
* n = 3 length= 3 
* n = 5 length= 5
* n = 10 length= 10 
* n = 10 length= 10
* n = 20 length= 20 
* n = 20 length= 20 
* n = 50 length= 50 
* n = 50 length= 50 

==> passed

Test 3: open predetermined sites for n = 1 and n = 2 (corner case test) 
* filename = input1.txt length= 1 
* filename = input1-no.txt length= 1 
* filename = input2.txt length= 2 
* filename = input2-no.txt length= 2 

==> passed 

Test 4: check predetermined sites with long percolating path
* filename = snake13.txt length= 13 
* filename = snake101.txt length= 101

==> passed 

Test 5: open every site 
* filename = input5.txt length= 5 

==> passed 

Test 6: open random sites until just before system percolates, allowing open() to be called on a site more than once

* n = 3 length= 3 
* n = 5 length= 5 
* n = 10 length= 10 
* n = 10 length= 10 
* n = 20 length= 20 
* n = 20 length= 20 
* n = 50 length= 50 
* n = 50 length= 50 

==> passed


Test 7: call methods with invalid arguments
length= 10 
* n = 10, (row, col) = (-1, 5) length= 10 
* n = 10, (row, col) = (11, 5) length= 10 
* n = 10, (row, col) = (0, 5) length= 10 
* n = 10, (row, col) = (5, -1) length= 10 
* n = 10, (row, col) = (5, 11) length= 10 
* n = 10, (row, col) = (5, 0) length= 10 
* n = 10, (row, col) = (-2147483648, -2147483648) length= 10 
* n = 10, (row, col) = (2147483647, 2147483647) 

==> passed 

Test 8: call constructor with invalid argument 
* n = -10 * n = -1 
* n = 0 

==> passed 

Test 9: create multiple Percolation objects at the same time (to make sure you didn't store data in static variables) 


==> passed 


Test 10: open predetermined list of sites using file inputs, but permute the order in which methods are called
* filename = input8.txt; order = isFull(), isOpen(), percolates()  
* filename = input8.txt; order = isFull(), percolates(), isOpen()  
* filename = input8.txt; order = isOpen(), isFull(), percolates()  
* filename = input8.txt; order = isOpen(), percolates(), isFull()  
* filename = input8.txt; order = percolates(), isOpen(), isFull()  
* filename = input8.txt; order = percolates(), isFull(), isOpen() 

==> passed



Test 11: call open(), isOpen(), and numberOfOpenSites() in random order until system percolates 
* n = 3, trials = 40, p = (0.4, 0.4, 0.0, 0.0, 0.3) 
* n = 5, trials = 20, p = (0.4, 0.4, 0.0, 0.0, 0.3) 
* n = 7, trials = 10, p = (0.4, 0.4, 0.0, 0.0, 0.3) 
* n = 10, trials = 5, p = (0.4, 0.4, 0.0, 0.0, 0.3)
* n = 20, trials = 2, p = (0.4, 0.4, 0.0, 0.0, 0.3) 
* n = 50, trials = 1, p = (0.4, 0.4, 0.0, 0.0, 0.3) 


==> passed 

Test 12: call open() and percolates() in random order until system percolates 

* n = 3, trials = 40, p = (0.5, 0.0, 0.0, 0.5, 0.0)
* n = 5, trials = 20, p = (0.5, 0.0, 0.0, 0.5, 0.0) 
* n = 7, trials = 10, p = (0.5, 0.0, 0.0, 0.5, 0.0) 
* n = 10, trials = 5, p = (0.5, 0.0, 0.0, 0.5, 0.0) 
* n = 20, trials = 2, p = (0.5, 0.0, 0.0, 0.5, 0.0) 
* n = 50, trials = 1, p = (0.5, 0.0, 0.0, 0.5, 0.0) 

==> passed 


Test 13: call open() and isFull() in random order until system percolates 
* n = 3, trials = 40, p = (0.5, 0.0, 0.5, 0.0, 0.0) 
* n = 5, trials = 20, p = (0.5, 0.0, 0.5, 0.0, 0.0) 
* n = 20, trials = 2, p = (0.5, 0.0, 0.5, 0.0, 0.0) 
* n = 50, trials = 1, p = (0.5, 0.0, 0.5, 0.0, 0.0) 

==> passed


Test 14: call all methods in random order until system percolates 
* n = 3, trials = 40, p = (0.2, 0.2, 0.2, 0.2, 0.2) 
* n = 5, trials = 20, p = (0.2, 0.2, 0.2, 0.2, 0.2) 
* n = 7, trials = 10, p = (0.2, 0.2, 0.2, 0.2, 0.2) 
* n = 10, trials = 5, p = (0.2, 0.2, 0.2, 0.2, 0.2)
* n = 20, trials = 2, p = (0.2, 0.2, 0.2, 0.2, 0.2) 
* n = 50, trials = 1, p = (0.2, 0.2, 0.2, 0.2, 0.2)

==> passed 


Test 15: call all methods in random order until almost all sites are open, but with inputs not prone to backwash 
* n = 3 
* n = 5 
* n = 7 
* n = 10 
* n = 20 
* n = 50 

==> passed 

Test 16: check for backwash with predetermined sites 

* filename = input20.txt 
* filename = input10.txt 
* filename = input50.txt 
* filename = jerry47.txt 
* filename = sedgewick60.txt 
* filename = wayne98.txt 

==> passed

Test 17: check for backwash with predetermined sites that have multiple percolating paths

* filename = input3.txt 
* filename = input4.txt 
* filename = input7.txt 

==> passed

Test 18: call all methods in random order until all sites are open, allowing isOpen() to be called on a site more than once
(these inputs are prone to backwash)
* n = 3
* n = 5 
* n = 7
* n = 10 
* n = 20 
* n = 50

==> passed


Total: 18/18 tests passed!

================================================================ 
********************************************************************************
* TESTING CORRECTNESS (substituting reference Percolation) 

******************************************************************************** 
Testing correctness of PercolationStats
*----------------------------------------------------------- 
Running 15 total tests.

Test 1: check that methods in PercolationStats do not print to standard output
* n = 20, trials = 10 - constructor prints to standard output - only main() should print to standard output - number of lines of output = 41 
* n = 50, trials = 20 - constructor prints to standard output - only main() should print to standard output - number of lines of output = 81 
* n = 100, trials = 50 - constructor prints to standard output - only main() should print to standard output - number of lines of output = 201 
* n = 64, trials = 150 - constructor prints to standard output - only main() should print to standard output - number of lines of output = 601 

==> FAILED

Test 2: check that mean() returns value in expected range 
* n = 2, trials = 10000 running started
trial 1 number of open sites= 2 lim = 4 result 0.5 
trial 2 number of open sites= 3 lim = 4 result 0.75 
trial 3 number of open sites= 2 lim = 4 result 0.5 
trial 4 number of open sites= 3 lim = 4 result 0.75
trial 5 number of open sites= 3 lim = 4 result 0.75 
trial 6 number of open sites= 2 lim = 4 result 0.5 
trial 7 number of open sites= 3 lim = 4 result 0.75
trial 8 number of open sites= 3 lim = 4 result 0.75
trial 9 number of open sites= 3 lim = 4 result 0.75
trial 10 number of open sites= 2 lim = 4 result 0.5
trial 11 number of open sites= 2 lim = 4 result 0.5
trial 12 number of open sites= 2 lim = 4 result 0.5
trial 13 number of open sites= 2 lim = 4 result 0.5
trial 14 number of open sites= 3 lim = 4 result 0.75
trial 15 number of open sites= 3 lim = 4 result 0.75 
trial 16 number of open sites= 3 lim = 4 result 0.75 
trial 17 number of open sites= 3 lim = 4 result 0.75 
trial 18 number of open sites= 3 lim = 4 result 0.75 
trial 19 number of open sites= 3 lim = 4 result 0.75 
trial 20 number of open sites= 3 lim = 4 result 0.75 
trial 21 number of open sites= 3 lim = 4 result 0.75 
trial 22 number of open sites= 2 lim = 4 result 0.5 trial 23 number of open sites= 3 lim = 4 result 0.75 trial 24 number of open sites= 2 lim = 4 result 0.5 trial 25 number of open sites= 3 lim = 4 result 0.75 trial 26 number of open sites= 3 lim = 4 result 0.75 trial 27 number of open sites= 3 lim = 4 result 0.75 trial 28 number of open sites= 2 lim = 4 result 0.5 trial 29 number of open sites= 2 lim = 4 result 0.5 trial 30 number of open sites= 3 lim = 4 result 0.75 trial 31 number of open sites= 2 lim = 4 result 0.5 trial 32 number of open sites= 3 lim = 4 result 0.75 trial 33 number of open sites= 3 lim = 4 result 0.75 trial 34 number of open sites= 2 lim = 4 result 0.5 trial 35 number of open sites= 2 lim = 4 result 0.5 trial 36 number of open sites= 2 lim = 4 result 0.5 trial 37 number of open sites= 2 lim = 4 result 0.5 trial 38 number of open sites= 3 lim = 4 result 0.75 trial 39 number of open sites= 2 lim = 4 result 0.5 trial 40 number of open sites= 2 lim = 4 result 0.5 trial 41 number of open sites= 3 lim = 4 result 0.75 trial 42 number of open sites= 3 lim = 4 result 0.75 trial 43 number of open sites= 3 lim = 4 result 0.75 trial 44 number of open sites= 3 lim = 4 result 0.75 trial 45 number of open sites= 2 lim = 4 result 0.5 trial 46 number of open sites= 3 lim = 4 result 0.75 trial 47 number of open sites= 3 lim = 4 result 0.75 trial 48 number of open sites= 3 lim = 4 result 0.75 trial 49 number of open sites= 3 lim = 4 result 0.75 trial 50 number of open sites= 3 lim = 4 result 0.75 trial 51 number of open sites= 3 lim = 4 result 0.75 trial 52 number of open sites= 3 lim = 4 result 0.75 trial 53 number of open sites= 3 lim = 4 result 0.75 trial 54 number of open sites= 3 lim = 4 result 0.75 trial 55 number of open sites= 2 lim = 4 result 0.5 trial 56 number of open sites= 2 lim = 4 result 0.5 trial 57 number of open sites= 2 lim = 4 result 0.5 trial 58 number of open sites= 3 lim = 4 result 0.75 trial 59 number of open sites= 3 lim = 4 result 0.75 trial 60 number of open sites= 3 lim = 4 result 0.75 trial 61 number of open sites= 3 lim = 4 result 0.75 trial 62 number of open sites= 2 lim = 4 result 0.5 trial 63 number of open sites= 3 lim = 4 result 0.75 trial 64 number of open sites= 2 lim = 4 result 0.5 trial 65 number of open sites= 2 lim = 4 result 0.5 trial 66 number of open sites= 2 lim = 4 result 0.5 trial 67 number of open sites= 2 lim = 4 result 0.5 trial 68 number of open sites= 3 lim = 4 result 0.75 trial 69 number of open sites= 3 lim = 4 result 0.75 trial 70 number of open sites= 3 lim = 4 result 0.75 trial 71 number of open sites= 3 lim = 4 result 0.75 trial 72 number of open sites= 2 lim = 4 result 0.5 trial 73 number of open sites= 3 lim = 4 result 0.75 trial 74 number of open sites= 2 lim = 4 result 0.5 trial 75 number of open sites= 3 lim = 4 result 0.75 trial 76 number of open sites= 3 lim = 4 result 0.75 trial 77 number of open sites= 2 lim = 4 result 0.5 trial 78 number of open sites= 3 lim = 4 result 0.75 trial 79 number of open sites= 2 lim = 4 result 0.5 trial 80 number of open sites= 3 lim = 4 result 0.75 trial 81 number of open sites= 2 lim = 4 result 0.5 trial 82 number of open sites= 3 lim = 4 result 0.75 trial 83 number of open sites= 3 lim = 4 result 0.75 trial 84 number of open sites= 3 lim = 4 result 0.75 trial 85 number of open sites= 3 lim = 4 result 0.75 trial 86 number of open sites= 2 lim = 4 result 0.5 trial 87 number of open sites= 3 lim = 4 result 0.75 trial 88 number of open sites= 3 lim = 4 result 0.75 trial 89 number of open sites= 3 lim = 4 result 0.75 trial 90 number of open sites= 3 lim = 4 result 0.75 trial 91 number of open sites= 3 lim = 4 result 0.75 trial 92 number of open sites= 3 lim = 4 result 0.75 trial 93 number of open sites= 2 lim = 4 result 0.5 trial 94 number of open sites= 3 lim = 4 result 0.75 trial 95 number of open sites= 3 lim = 4 result 0.75 trial 96 number of open sites= 3 lim = 4 result 0.75 trial 97 number of open sites= 3 lim = 4 result 0.75 trial 98 number of open sites= 2 lim = 4 result 0.5 trial 99 number of open sites= 2 lim = 4 result 0.5 trial 100 number of open sites= 3 lim = 4 result 0.75 trial 101 number of open sites= 2 lim = 4 result 0.5 trial 102 number of open sites= 2 lim = 4 result 0.5 trial 103 number of open sites= 3 lim = 4 result 0.75 trial 104 number of open sites= 2 lim = 4 result 0.5 trial 105 number of open sites= 2 lim = 4 result 0.5 trial 106 number of open sites= 3 lim = 4 result 0.75 trial 107 number of open sites= 3 lim = 4 result 0.75 trial 108 number of open sites= 3 lim = 4 result 0.75 trial 109 number of open sites= 2 lim = 4 result 0.5 trial 110 number of open sites= 3 lim = 4 result 0.75 trial 111 number of open sites= 3 lim = 4 result 0.75 trial 112 number of open sites= 3 lim = 4 result 0.75 trial 113 number of open sites= 3 lim = 4 result 0.75 trial 114 number of open sites= 3 lim = 4 result 0.75 trial 115 number of open sites= 3 lim = 4 result 0.75 trial 116 number of open sites= 3 lim = 4 result 0.75 trial 117 number of open sites= 2 lim = 4 result 0.5 trial 118 number of open sites= 3 lim = 4 result 0.75 trial 119 number of open sites= 3 lim = 4 result 0.75 trial 120 number of open sites= 2 lim = 4 result 0.5 trial 121 number of open sites= 3 lim = 4 result 0.75 trial 122 number of open sites= 3 lim = 4 result 0.75 trial 123 number of open sites= 3 lim = 4 result 0.75 trial 124 number of open sites= 2 lim = 4 result 0.5 trial 125 number of open sites= 2 lim = 4 result 0.5 trial 126 number of open sites= 2 lim = 4 result 0.5 trial 127 number of open sites= 3 lim = 4 result 0.75 trial 128 number of open sites= 3 lim = 4 result 0.75 trial 129 number of open sites= 3 lim = 4 result 0.75 trial 130 number of open sites= 3 lim = 4 result 0.75 trial 131 number of open sites= 3 lim = 4 result 0.75 trial 132 number of open sites= 3 lim = 4 result 0.75 trial 133 number of open sites= 2 lim = 4 result 0.5 trial 134 number of open sites= 2 lim = 4 result 0.5 trial 135 number of open sites= 2 lim = 4 result 0.5 trial 136 number of open sites= 3 lim = 4 result 0.75 trial 137 number of open sites= 3 lim = 4 result 0.75 trial 138 number of open sites= 2 lim = 4 result 0.5 trial 139 number of open sites= 2 lim = 4 result 0.5 trial 140 number of open sites= 3 lim = 4 result 0.75 trial 141 number of open sites= 3 lim = 4 result 0.75 trial 142 number of open sites= 3 lim = 4 result 0.75 trial 143 number of open sites= 2 lim = 4 result 0.5 trial 144 number of open sites= 2 lim = 4 result 0.5 trial 145 number of open sites= 3 lim = 4 result 0.75 trial 146 number of open sites= 2 lim = 4 result 0.5 trial 147 number of open sites= 2 lim = 4 result 0.5 trial 148 number of open sites= 3 lim = 4 result 0.75 trial 149 number of open sites= 2 lim = 4 result 0.5 trial 150 number of open sites= 2 lim = 4 result 0.5 trial 151 number of open sites= 3 lim = 4 result 0.75 trial 152 number of open sites= 2 lim = 4 result 0.5 trial 153 number of open sites= 3 lim = 4 result 0.75 trial 154 number of open sites= 3 lim = 4 result 0.75 trial 155 number of open sites= 2 lim = 4 result 0.5 trial 156 number of open sites= 2 lim = 4 result 0.5 trial 157 number of open sites= 3 lim = 4 result 0.75 trial 158 number of open sites= 3 lim = 4 result 0.75 trial 159 number of open sites= 2 lim = 4 result 0.5 trial 160 number of open sites= 3 lim = 4 result 0.75 trial 161 number of open sites= 3 lim = 4 result 0.75 trial 162 number of open sites= 2 lim = 4 result 0.5 trial 163 number of open sites= 3 lim = 4 result 0.75 trial 164 number of open sites= 3 lim = 4 result 0.75 trial 165 number of open sites= 3 lim = 4 result 0.75 trial 166 number of open sites= 3 lim = 4 result 0.75 trial 167 number of open sites= 3 lim = 4 result 0.75 trial 168 number of open sites= 2 lim = 4 result 0.5 trial 169 number of open sites= 3 lim = 4 result 0.75 trial 170 number of open sites= 3 lim = 4 result 0.75 trial 171 number of open sites= 2 lim = 4 result 0.5 trial 172 number of open sites= 2 lim = 4 result 0.5 trial 173 number of open sites= 3 lim = 4 result 0.75 trial 174 number of open sites= 3 lim = 4 result 0.75 trial 175 number of open sites= 2 lim = 4 result 0.5 trial 176 number of open sites= 2 lim = 4 result 0.5 trial 177 number of open sites= 2 lim = 4 result 0.5 trial 178 number of open sites= 2 lim = 4 result 0.5 trial 179 number of open sites= 3 lim = 4 result 0.75 trial 180 number of open sites= 3 lim = 4 result 0.75 trial 181 number of open sites= 3 lim = 4 result 0.75 trial 182 number of open sites= 3 lim = 4 result 0.75 trial 183 number of open sites= 3 lim = 4 result 0.75 trial 184 number of open sites= 2 lim = 4 result 0.5 trial 185 number of open sites= 3 lim = 4 result 0.75 trial 186 number of open sites= 2 lim = 4 result 0.5 trial 187 number of open sites= 3 lim = 4 result 0.75 trial 188 number of open sites= 3 lim = 4 result 0.75 trial 189 number of open sites= 3 lim = 4 result 0.75 trial 190 number of open sites= 3 lim = 4 result 0.75 trial 191 number of open sites= 3 lim = 4 result 0.75 trial 192 number of open sites= 2 lim = 4 result 0.5 trial 193 number of open sites= 2 lim = 4 result 0.5 trial 194 number of open sites= 3 lim = 4 result 0.75 trial 195 number of open sites= 3 lim = 4 result 0.75 trial 196 number of open sites= 3 lim = 4 result 0.75 trial 197 number of open sites= 2 lim = 4 result 0.5 trial 198 number of open sites= 3 lim = 4 result 0.75 trial 199 number of open sites= 2 lim = 4 result 0.5 trial 200 number of open sites= 3 lim = 4 result 0.75 trial 201 number of open sites= 3 lim = 4 result 0.75 trial 202 number of open sites= 3 lim = 4 result 0.75 trial 203 number of open sites= 3 lim = 4 result 0.75 trial 204 number of open sites= 2 lim = 4 result 0.5 trial 205 number of open sites= 2 lim = 4 result 0.5 trial 206 number of open sites= 2 lim = 4 result 0.5 trial 207 number of open sites= 3 lim = 4 result 0.75 trial 208 number of open sites= 3 lim = 4 result 0.75 trial 209 number of open sites= 2 lim = 4 result 0.5 trial 210 number of open sites= 3 lim = 4 result 0.75 trial 211 number of open sites= 2 lim = 4 result 0.5 trial 212 number of open sites= 3 lim = 4 result 0.75 trial 213 number of open sites= 3 lim = 4 result 0.75 trial 214 number of open sites= 3 lim = 4 result 0.75 trial 215 number of open sites= 3 lim = 4 result 0.75 trial 216 number of open sites= 3 lim = 4 result 0.75 trial 217 number of open sites= 3 lim = 4 result 0.75 trial 218 number of open sites= 2 lim = 4 result 0.5 trial 219 number of open sites= 2 lim = 4 result 0.5 trial 220 number of open sites= 3 lim = 4 result 0.75 trial 221 number of open sites= 2 lim = 4 result 0.5 trial 222 number of open sites= 2 lim = 4 result 0.5 trial 223 number of open sites= 3 lim = 4 result 0.75 trial 224 number of open sites= 3 lim = 4 result 0.75 trial 225 number of open sites= 3 lim = 4 result 0.75 trial 226 number of open sites= 2 lim = 4 result 0.5 trial 227 number of open sites= 3 lim = 4 result 0.75 trial 228 number of open sites= 2 lim = 4 result 0.5 trial 229 number of open sites= 2 lim = 4 result 0.5 trial 230 number of open sites= 3 lim = 4 result 0.75 trial 231 number of open sites= 2 lim = 4 result 0.5 trial 232 number of open sites= 2 lim = 4 result 0.5 trial 233 number of open sites= 3 lim = 4 result 0.75 trial 234 number of open sites= 3 lim = 4 result 0.75 trial 235 number of open sites= 3 lim = 4 result 0.75 trial 236 number of open sites= 3 lim = 4 result 0.75 trial 237 number of open sites= 3 lim = 4 result 0.75 trial 238 number of open sites= 3 lim = 4 result 0.75 trial 239 number of open sites= 3 lim = 4 result 0.75 trial 240 number of open sites= 3 lim = 4 result 0.75 trial 241 number of open sites= 3 lim = 4 result 0.75 trial 242 number of open sites= 3 lim = 4 result 0.75 trial 243 number of open sites= 3 lim = 4 result 0.75 trial 244 number of open sites= 3 lim = 4 result 0.75 trial 245 number of open sites= 3 lim = 4 result 0.75 trial 246 number of open sites= 3 lim = 4 result 0.75 trial 247 number of open sites= 3 lim = 4 result 0.75 trial 248 number of open sites= 3 lim = 4 result 0.75 trial 249 number of open sites= 3 lim = 4 result 0.75 trial 250 number of open sites= 3 lim = 4 result 0.75 trial 251 number of open sites= 2 lim = 4 result 0.5 trial 252 number of open sites= 3 lim = 4 result 0.75 trial 253 number of open sites= 2 lim = 4 result 0.5 trial 254 number of open sites= 2 lim = 4 result 0.5 trial 255 number of open sites= 2 lim = 4 result 0.5 trial 256 number of open sites= 3 lim = 4 result 0.75 trial 257 number of open sites= 3 lim = 4 result 0.75 trial 258 number of open sites= 2 lim = 4 result 0.5 trial 259 number of open sites= 3 lim = 4 result 0.75 trial 260 number of open sites= 2 lim = 4 result 0.5 trial 261 number of open sites= 3 lim = 4 result 0.75 trial 262 number of open sites= 3 lim = 4 result 0.75 trial 263 number of open sites= 3 lim = 4 result 0.75 trial 264 number of open sites= 3 lim = 4 result 0.75 trial 265 number of open sites= 3 lim = 4 result 0.75 trial 266 number of open sites= 3 lim = 4 result 0.75 trial 267 number of open sites= 2 lim = 4 result 0.5 trial 268 number of open sites= 3 lim = 4 result 0.75 trial 269 number of open sites= 3 lim = 4 result 0.75 trial 270 number of open sites= 3 lim = 4 result 0.75 trial 271 number of open sites= 3 lim = 4 result 0.75 trial 272 number of open sites= 3 lim = 4 result 0.75 trial 273 number of open sites= 3 lim = 4 result 0.75 trial 274 number of open sites= 3 lim = 4 result 0.75 trial 275 number of open sites= 3 lim = 4 result 0.75 trial 276 number of open sites= 2 lim = 4 result 0.5 trial 277 number of open sites= 2 lim = 4 result 0.5 trial 278 number of open sites= 2 lim = 4 result 0.5 trial 279 number of open sites= 3 lim = 4 result 0.75 trial 280 number of open sites= 3 lim = 4 result 0.75 trial 281 number of open sites= 2 lim = 4 result 0.5 trial 282 number of open sites= 2 lim = 4 result 0.5 trial 283 number of open sites= 3 lim = 4 result 0.75 trial 284 number of open sites= 3 lim = 4 result 0.75 trial 285 number of open sites= 2 lim = 4 result 0.5 trial 286 number of open sites= 3 lim = 4 result 0.75 trial 287 number of open sites= 3 lim = 4 result 0.75 trial 288 number of open sites= 2 lim = 4 result 0.5 trial 289 number of open sites= 3 lim = 4 result 0.75 trial 290 number of open sites= 3 lim = 4 result 0.75 trial 291 number of open sites= 2 lim = 4 result 0.5 trial 292 number of open sites= 3 lim = 4 result 0.75 trial 293 number of open sites= 3 lim = 4 result 0.75 trial 294 number of open sites= 3 lim = 4 result 0.75 trial 295 number of open sites= 3 lim = 4 result 0.75 trial 296 number of open sites= 2 lim = 4 result 0.5 trial 297 number of open sites= 2 lim = 4 result 0.5 trial 298 number of open sites= 2 lim = 4 result 0.5 trial 299 number of open sites= 3 lim = 4 result 0.75 trial 300 number of open sites= 3 lim = 4 result 0.75 trial 301 number of open sites= 2 lim = 4 result 0.5 trial 302 number of open sites= 3 lim = 4 result 0.75 trial 303 number of open sites= 3 lim = 4 result 0.75 trial 304 number of open sites= 3 lim = 4 result 0.75 trial 305 number of open sites= 3 lim = 4 result 0.75 trial 306 number of open sites= 3 lim = 4 result 0.75 trial 307 number of open sites= 3 lim = 4 result 0.75 trial 308 number of open sites= 3 lim = 4 result 0.75 trial 309 number of open sites= 3 lim = 4 result 0.75 trial 310 number of open sites= 2 lim = 4 result 0.5 trial 311 number of open sites= 2 lim = 4 result 0.5 trial 312 number of open sites= 3 lim = 4 result 0.75 trial 313 number of open sites= 2 lim = 4 result 0.5 trial 314 number of open sites= 2 lim = 4 result 0.5 trial 315 number of open sites= 3 lim = 4 result 0.75 trial 316 number of open sites= 3 lim = 4 result 0.75 trial 317 number of open sites= 2 lim = 4 result 0.5 trial 318 number of open sites= 3 lim = 4 result 0.75 trial 319 number of open sites= 3 lim = 4 result 0.75 trial 320 number of open sites= 2 lim = 4 result 0.5 trial 321 number of open sites= 3 lim = 4 result 0.75 trial 322 number of open sites= 3 lim = 4 result 0.75 trial 323 number of open sites= 3 lim = 4 result 0.75 trial 324 number of open sites= 3 lim = 4 result 0.75 trial 325 number of open sites= 3 lim = 4 result 0.75 trial 326 number of open sites= 3 lim = 4 result 0.75 trial 327 number of open sites= 2 lim = 4 result 0.5 trial 328 number of open sites= 2 lim = 4 result 0.5 trial 329 number of open sites= 3 lim = 4 result 0.75 trial 330 number of open sites= 2 lim = 4 result 0.5 trial 331 number of open sites= 3 lim = 4 result 0.75 trial 332 number of open sites= 3 lim = 4 result 0.75 trial 333 number of open sites= 3 lim = 4 result 0.75 trial 334 number of open sites= 3 lim = 4 result 0.75 trial 335 number of open sites= 3 lim = 4 result 0.75 trial 336 number of open sites= 2 lim = 4 result 0.5 trial 337 number of open sites= 3 lim = 4 result 0.75 trial 338 number of open sites= 3 lim = 4 result 0.75 trial 339 number of open sites= 2 lim = 4 result 0.5 trial 340 number of open sites= 2 lim = 4 result 0.5 trial 341 number of open sites= 3 lim = 4 result 0.75 trial 342 number of open sites= 2 lim = 4 result 0.5 trial 343 number of open sites= 3 lim = 4 result 0.75 trial 344 number of open sites= 3 lim = 4 result 0.75 trial 345 number of open sites= 2 lim = 4 result 0.5 trial 346 number of open sites= 2 lim = 4 result 0.5 trial 347 number of open sites= 3 lim = 4 result 0.75 trial 348 number of open sites= 3 lim = 4 result 0.75 trial 349 number of open sites= 3 lim = 4 result 0.75 trial 350 number of open sites= 3 lim = 4 result 0.75 trial 351 number of open sites= 2 lim = 4 result 0.5 trial 352 number of open sites= 3 lim = 4 result 0.75 trial 353 number of open sites= 2 lim = 4 result 0.5 trial 354 number of open sites= 3 lim = 4 result 0.75 trial 355 number of open sites= 2 lim = 4 result 0.5 trial 356 number of open sites= 2 lim = 4 result 0.5 trial 357 number of open sites= 3 lim = 4 result 0.75 trial 358 number of open sites= 3 lim = 4 result 0.75 trial 359 number of open sites= 3 lim = 4 result 0.75 trial 360 number of open sites= 2 lim = 4 result 0.5 trial 361 number of open sites= 3 lim = 4 result 0.75 trial 362 number of open sites= 2 lim = 4 result 0.5 trial 363 number of open sites= 3 lim = 4 result 0.75 trial 364 number of open sites= 2 lim = 4 result 0.5 trial 365 number of open sites= 2 lim = 4 result 0.5 trial 366 number of open sites= 3 lim = 4 result 0.75 trial 367 number of open sites= 2 lim = 4 result 0.5 trial 368 number of open sites= 3 lim = 4 result 0.75 trial 369 number of open sites= 3 lim = 4 result 0.75 trial 370 number of open sites= 3 lim = 4 result 0.75 trial 371 number of open sites= 2 lim = 4 result 0.5 trial 372 number of open sites= 3 lim = 4 result 0.75 trial 373 number of open sites= 3 lim = 4 result 0.75 trial 374 number of open sites= 2 lim = 4 result 0.5 trial 375 number of open sites= 3 lim = 4 result 0.75 trial 376 number of open sites= 3 lim = 4 result 0.75 trial 377 number of open sites= 3 lim = 4 result 0.75 trial 378 number of open sites= 2 lim = 4 result 0.5 trial 379 number of open sites= 3 lim = 4 result 0.75 trial 380 number of open sites= 3 lim = 4 result 0.75 trial 381 number of open sites= 2 lim = 4 result 0.5 trial 382 number of open sites= 3 lim = 4 result 0.75 trial 383 number of open sites= 3 lim = 4 result 0.75 trial 384 number of open sites= 3 lim = 4 result 0.75 trial 385 number of open sites= 2 lim = 4 result 0.5 trial 386 number of open sites= 3 lim = 4 result 0.75 trial 387 number of open sites= 3 lim = 4 result 0.75 trial 388 number of open sites= 2 lim = 4 result 0.5 trial 389 number of open sites= 3 lim = 4 result 0.75 trial 390 number of open sites= 3 lim = 4 result 0.75 trial 391 number of open sites= 3 lim = 4 result 0.75 trial 392 number of open sites= 3 lim = 4 result 0.75 trial 393 number of open sites= 3 lim = 4 result 0.75 trial 394 number of open sites= 3 lim = 4 result 0.75 trial 395 number of open sites= 2 lim = 4 result 0.5 trial 396 number of open sites= 3 lim = 4 result 0.75 trial 397 number of open sites= 3 lim = 4 result 0.75 trial 398 number of open sites= 3 lim = 4 result 0.75 trial 399 number of open sites= 3 lim = 4 result 0.75 trial 400 number of open sites= 3 lim = 4 result 0.75 trial 401 number of open sites= 3 lim = 4 result 0.75 trial 402 number of open sites= 3 lim = 4 result 0.75 trial 403 number of open sites= 3 lim = 4 result 0.75 trial 404 number of open sites= 3 lim = 4 result 0.75 trial 405 number of open sites= 3 lim = 4 result 0.75 trial 406 number of open sites= 3 lim = 4 result 0.75 trial 407 number of open sites= 3 lim = 4 result 0.75 trial 408 number of open sites= 2 lim = 4 result 0.5 trial 409 number of open sites= 2 lim = 4 result 0.5 trial 410 number of open sites= 3 lim = 4 result 0.75 trial 411 number of open sites= 3 lim = 4 result 0.75 trial 412 number of open sites= 3 lim = 4 result 0.75 trial 413 number of open sites= 3 lim = 4 result 0.75 trial 414 number of open sites= 3 lim = 4 result 0.75 trial 415 number of open sites= 3 lim = 4 result 0.75 trial 416 number of open sites= 3 lim = 4 result 0.75 trial 417 number of open sites= 2 lim = 4 result 0.5 trial 418 number of open sites= 3 lim = 4 result 0.75 trial 419 number of open sites= 3 lim = 4 result 0.75 trial 420 number of open sites= 2 lim = 4 result 0.5 trial 421 number of open sites= 3 lim = 4 result 0.75 trial 422 number of open sites= 3 lim = 4 result 0.75 trial 423 number of open sites= 3 lim = 4 result 0.75 trial 424 number of open sites= 2 lim = 4 result 0.5 trial 425 number of open sites= 2 lim = 4 result 0.5 trial 426 number of open sites= 3 lim = 4 result 0.75 trial 427 number of open sites= 3 lim = 4 result 0.75 trial 428 number of open sites= 3 lim = 4 result 0.75 trial 429 number of open sites= 3 lim = 4 result 0.75 trial 430 number of open sites= 3 lim = 4 result 0.75 trial 431 number of open sites= 3 lim = 4 result 0.75 trial 432 number of open sites= 3 lim = 4 result 0.75 trial 433 number of open sites= 3 lim = 4 result 0.75 trial 434 number of open sites= 3 lim = 4 result 0.75 trial 435 number of open sites= 3 lim = 4 result 0.75 trial 436 number of open sites= 3 lim = 4 result 0.75 trial 437 number of open sites= 2 lim = 4 result 0.5 trial 438 number of open sites= 3 lim = 4 result 0.75 trial 439 number of open sites= 2 lim = 4 result 0.5 trial 440 number of open sites= 3 lim = 4 result 0.75 trial 441 number of open sites= 3 lim = 4 result 0.75 trial 442 number of open sites= 3 lim = 4 result 0.75 trial 443 number of open sites= 3 lim = 4 result 0.75 trial 444 number of open sites= 2 lim = 4 result 0.5 trial 445 number of open sites= 2 lim = 4 result 0.5 trial 446 number of open sites= 2 lim = 4 result 0.5 trial 447 number of open sites= 3 lim = 4 result 0.75 trial 448 number of open sites= 2 lim = 4 result 0.5 trial 449 number of open sites= 3 lim = 4 result 0.75 trial 450 number of open sites= 3 lim = 4 result 0.75 trial 451 number of open sites= 3 lim = 4 result 0.75 trial 452 number of open sites= 3 lim = 4 result 0.75 trial 453 number of open sites= 2 lim = 4 result 0.5 trial 454 number of open sites= 3 lim = 4 result 0.75 trial 455 number of open sites= 2 lim = 4 result 0.5 trial 456 number of open sites= 2 lim = 4 result 0.5 trial 457 number of open sites= 3 lim = 4 result 0.75 trial 458 number of open sites= 3 lim = 4 result 0.75 trial 459 number of open sites= 2 lim = 4 result 0.5 trial 460 number of open sites= 3 lim = 4 result 0.75 trial 461 number of open sites= 2 lim = 4 result 0.5 trial 462 number of open sites= 2 lim = 4 result 0.5 trial 463 number of open sites= 3 lim = 4 result 0.75 trial 464 number of open sites= 2 lim = 4 result 0.5 trial 465 number of open sites= 2 lim = 4 result 0.5 trial 466 number of open sites= 2 lim = 4 result 0.5 trial 467 number of open sites= 3 lim = 4 result 0.75 trial 468 number of open sites= 3 lim = 4 result 0.75 trial 469 number of open sites= 3 lim = 4 result 0.75 trial 470 number of open sites= 3 lim = 4 result 0.75 trial 471 number of open sites= 2 lim = 4 result 0.5 trial 472 number of open sites= 2 lim = 4 result 0.5 trial 473 number of open sites= 3 lim = 4 result 0.75 trial 474 number of open sites= 2 lim = 4 result 0.5 trial 475 number of open sites= 3 lim = 4 result 0.75 trial 476 number of open sites= 3 lim = 4 result 0.75 trial 477 number of open sites= 3 lim = 4 result 0.75 trial 478 number of open sites= 2 lim = 4 result 0.5 trial 479 number of open sites= 3 lim = 4 result 0.75 trial 480 number of open sites= 3 lim = 4 result 0.75 trial 481 number of open sites= 3 lim = 4 result 0.75 trial 482 number of open sites= 3 lim = 4 result 0.75 trial 483 number of open sites= 3 lim = 4 result 0.75 trial 484 number of open sites= 2 lim = 4 result 0.5 trial 485 number of open sites= 3 lim = 4 result 0.75 trial 486 number of open sites= 2 lim = 4 result 0.5 trial 487 number of open sites= 3 lim = 4 result 0.75 trial 488 number of open sites= 3 lim = 4 result 0.75 trial 489 number of open sites= 2 lim = 4 result 0.5 trial 490 number of open sites= 3 lim = 4 result 0.75 trial 491 number of open sites= 3 lim = 4 result 0.75 trial 492 number of open sites= 3 lim = 4 result 0.75 trial 493 number of open sites= 3 lim = 4 result 0.75 trial 494 number of open sites= 3 lim = 4 result 0.75 trial 495 number of open sites= 3 lim = 4 result 0.75 trial 496 number of open sites= 2 lim = 4 result 0.5 trial 497 number of open sites= 3 lim = 4 result 0.75 trial 498 number of open sites= 2 lim = 4 result 0.5 trial 499 number of open sites= 3 lim = 4 result 0.75 trial 500 number of open sites= 3 lim = 4 result 0.75 trial 501 number of open sites= 2 lim = 4 result 0.5 trial 502 number of open sites= 3 lim = 4 result 0.75 trial 503 number of open sites= 3 lim = 4 result 0.75 trial 504 number of open sites= 3 lim = 4 result 0.75 trial 505 number of open sites= 3 lim = 4 result 0.75 trial 506 number of open sites= 3 lim = 4 result 0.75 trial 507 number of open sites= 2 lim = 4 result 0.5 trial 508 number of open sites= 3 lim = 4 result 0.75 trial 509 number of open sites= 3 lim = 4 result 0.75 trial 510 number of open sites= 2 lim = 4 result 0.5 trial 511 number of open sites= 2 lim = 4 result 0.5 trial 512 number of open sites= 3 lim = 4 result 0.75 trial 513 number of open sites= 3 lim = 4 result 0.75 trial 514 number of open sites= 3 lim = 4 result 0.75 trial 515 number of open sites= 3 lim = 4 result 0.75 trial 516 number of open sites= 3 lim = 4 result 0.75 trial 517 number of open sites= 3 lim = 4 result 0.75 trial 518 number of open sites= 3 lim = 4 result 0.75 trial 519 number of open sites= 3 lim = 4 result 0.75 trial 520 number of open sites= 3 lim = 4 result 0.75 trial 521 number of open sites= 3 lim = 4 result 0.75 trial 522 number of open sites= 2 lim = 4 result 0.5 trial 523 number of open sites= 3 lim = 4 result 0.75 trial 524 number of open sites= 2 lim = 4 result 0.5 trial 525 number of open sites= 2 lim = 4 result 0.5 trial 526 number of open sites= 3 lim = 4 result 0.75 trial 527 number of open sites= 3 lim = 4 result 0.75 trial 528 number of open sites= 3 lim = 4 result 0.75 trial 529 number of open sites= 3 lim = 4 result 0.75 trial 530 number of open sites= 2 lim = 4 result 0.5 trial 531 number of open sites= 3 lim = 4 result 0.75 trial 532 number of open sites= 3 lim = 4 result 0.75 trial 533 number of open sites= 2 lim = 4 result 0.5 trial 534 number of open sites= 3 lim = 4 result 0.75 trial 535 number of open sites= 3 lim = 4 result 0.75 trial 536 number of open sites= 3 lim = 4 result 0.75 trial 537 number of open sites= 3 lim = 4 result 0.75 trial 538 number of open sites= 3 lim = 4 result 0.75 trial 539 number of open sites= 3 lim = 4 result 0.75 trial 540 number of open sites= 2 lim = 4 result 0.5 trial 541 number of open sites= 3 lim = 4 result 0.75 trial 542 number of open sites= 3 lim = 4 result 0.75 trial 543 number of open sites= 3 lim = 4 result 0.75 trial 544 number of open sites= 3 lim = 4 result 0.75 trial 545 number of open sites= 3 lim = 4 result 0.75 trial 546 number of open sites= 2 lim = 4 result 0.5 trial 547 number of open sites= 3 lim = 4 result 0.75 trial 548 number of open sites= 2 lim = 4 result 0.5 trial 549 number of open sites= 2 lim = 4 result 0.5 trial 550 number of open sites= 3 lim = 4 result 0.75 trial 551 number of open sites= 3 lim = 4 result 0.75 trial 552 number of open sites= 3 lim = 4 result 0.75 trial 553 number of open sites= 3 lim = 4 result 0.75 trial 554 number of open sites= 2 lim = 4 result 0.5 trial 555 number of open sites= 3 lim = 4 result 0.75 trial 556 number of open sites= 3 lim = 4 result 0.75 trial 557 number of open sites= 3 lim = 4 result 0.75 trial 558 number of open sites= 3 lim = 4 result 0.75 trial 559 number of open sites= 3 lim = 4 result 0.75 trial 560 number of open sites= 3 lim = 4 result 0.75 trial 561 number of open sites= 3 lim = 4 result 0.75 trial 562 number of open sites= 3 lim = 4 result 0.75 trial 563 number of open sites= 3 lim = 4 result 0.75 trial 564 number of open sites= 3 lim = 4 result 0.75 trial 565 number of open sites= 2 lim = 4 result 0.5 trial 566 number of open sites= 3 lim = 4 result 0.75 trial 567 number of open sites= 3 lim = 4 result 0.75 trial 568 number of open sites= 3 lim = 4 result 0.75 trial 569 number of open sites= 2 lim = 4 result 0.5 trial 570 number of open sites= 2 lim = 4 result 0.5 trial 571 number of open sites= 3 lim = 4 result 0.75 trial 572 number of open sites= 3 lim = 4 result 0.75 trial 573 number of open sites= 2 lim = 4 result 0.5 trial 574 number of open sites= 2 lim = 4 result 0.5 trial 575 number of open sites= 2 lim = 4 result 0.5 trial 576 number of open sites= 3 lim = 4 result 0.75 trial 577 number of open sites= 3 lim = 4 result 0.75 trial 578 number of open sites= 3 lim = 4 result 0.75 trial 579 number of open sites= 2 lim = 4 result 0.5 trial 580 number of open sites= 3 lim = 4 result 0.75 trial 581 number of open sites= 2 lim = 4 result 0.5 trial 582 number of open sites= 3 lim = 4 result 0.75 trial 583 number of open sites= 2 lim = 4 result 0.5 trial 584 number of open sites= 3 lim = 4 result 0.75 trial 585 number of open sites= 3 lim = 4 result 0.75 trial 586 number of open sites= 2 lim = 4 result 0.5 trial 587 number of open sites= 3 lim = 4 result 0.75 trial 588 number of open sites= 3 lim = 4 result 0.75 trial 589 number of open sites= 2 lim = 4 result 0.5 trial 590 number of open sites= 2 lim = 4 result 0.5 trial 591 number of open sites= 3 lim = 4 result 0.75 trial 592 number of open sites= 3 lim = 4 result 0.75 trial 593 number of open sites= 2 lim = 4 result 0.5 trial 594 number of open sites= 3 lim = 4 result 0.75 trial 595 number of open sites= 2 lim = 4 result 0.5 trial 596 number of open sites= 2 lim = 4 result 0.5 trial 597 number of open sites= 2 lim = 4 result 0.5 trial 598 number of open sites= 3 lim = 4 result 0.75 trial 599 number of open sites= 3 lim = 4 result 0.75 trial 600 number of open sites= 2 lim = 4 result 0.5 trial 601 number of open sites= 3 lim = 4 result 0.75 trial 602 number of open sites= 3 lim = 4 result 0.75 trial 603 number of open sites= 3 lim = 4 result 0.75 trial 604 number of open sites= 2 lim = 4 result 0.5 trial 605 number of open sites= 3 lim = 4 result 0.75 trial 606 number of open sites= 2 lim = 4 result 0.5 trial 607 number of open sites= 3 lim = 4 result 0.75 trial 608 number of open sites= 3 lim = 4 result 0.75 trial 609 number of open sites= 3 lim = 4 result 0.75 trial 610 number of open sites= 3 lim = 4 result 0.75 trial 611 number of open sites= 2 lim = 4 result 0.5 trial 612 number of open sites= 2 lim = 4 result 0.5 trial 613 number of open sites= 3 lim = 4 result 0.75 trial 614 number of open sites= 3 lim = 4 result 0.75 trial 615 number of open sites= 3 lim = 4 result 0.75 trial 616 number of open sites= 2 lim = 4 result 0.5 trial 617 number of open sites= 2 lim = 4 result 0.5 trial 618 number of open sites= 2 lim = 4 result 0.5 trial 619 number of open sites= 3 lim = 4 result 0.75 trial 620 number of open sites= 2 lim = 4 result 0.5 trial 621 number of open sites= 3 lim = 4 result 0.75 trial 622 number of open sites= 3 lim = 4 result 0.75 trial 623 number of open sites= 3 lim = 4 result 0.75 trial 624 number of open sites= 3 lim = 4 result 0.75 trial 625 number of open sites= 2 lim = 4 result 0.5 trial 626 number of open sites= 3 lim = 4 result 0.75 trial 627 number of open sites= 3 lim = 4 result 0.75 trial 628 number of open sites= 3 lim = 4 result 0.75 trial 629 number of open sites= 2 lim = 4 result 0.5 trial 630 number of open sites= 2 lim = 4 result 0.5 trial 631 number of open sites= 3 lim = 4 result 0.75 trial 632 number of open sites= 3 lim = 4 result 0.75 trial 633 number of open sites= 3 lim = 4 result 0.75 trial 634 number of open sites= 3 lim = 4 result 0.75 trial 635 number of open sites= 3 lim = 4 result 0.75 trial 636 number of open sites= 2 lim = 4 result 0.5 trial 637 number of open sites= 3 lim = 4 result 0.75 trial 638 number of open sites= 2 lim = 4 result 0.5 trial 639 number of open sites= 2 lim = 4 result 0.5 trial 640 number of open sites= 3 lim = 4 result 0.75 trial 641 number of open sites= 3 lim = 4 result 0.75 trial 642 number of open sites= 3 lim = 4 result 0.75 trial 643 number of open sites= 3 lim = 4 result 0.75 trial 644 number of open sites= 2 lim = 4 result 0.5 trial 645 number of open sites= 2 lim = 4 result 0.5 trial 646 number of open sites= 2 lim = 4 result 0.5 trial 647 number of open sites= 3 lim = 4 result 0.75 trial 648 number of open sites= 2 lim = 4 result 0.5 trial 649 number of open sites= 2 lim = 4 result 0.5 trial 650 number of open sites= 2 lim = 4 result 0.5 trial 651 number of open sites= 3 lim = 4 result 0.75 trial 652 number of open sites= 2 lim = 4 result 0.5 trial 653 number of open sites= 3 lim = 4 result 0.75 trial 654 number of open sites= 2 lim = 4 result 0.5 trial 655 number of open sites= 3 lim = 4 result 0.75 trial 656 number of open sites= 3 lim = 4 result 0.75 trial 657 number of open sites= 3 lim = 4 result 0.75 trial 658 number of open sites= 3 lim = 4 result 0.75 trial 659 number of open sites= 3 lim = 4 result 0.75 trial 660 number of open sites= 3 lim = 4 result 0.75 trial 661 number of open sites= 2 lim = 4 result 0.5 trial 662 number of open sites= 3 lim = 4 result 0.75 trial 663 number of open sites= 2 lim = 4 result 0.5 trial 664 number of open sites= 3 lim = 4 result 0.75 trial 665 number of open sites= 3 lim = 4 res ... 

WARNING: the grading output was truncated due to excessive length.
Typically, this is because you have a method that has an unanticipated side effect
(such as printing to standard output or throwing an exception).
A large amount of output can also arise from failing many tests.



```
