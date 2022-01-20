# Cube Statistics

## Problem Statement

This is not your normal assignment! I am asking you to explore a little bit more in java, and see how this format of assignment works. I have been toying with this idea for a little bit and wanted some feedback on how it looks on the student end!

Your assignment is the same in that you are finding the same things, the surface area and volume of a cube. However, we are using something called methods and also automated testing.

When you run your program for the first time you should see a lot more console output than expected. These are mostly test results from an automated tester, you should take note of the ending that says:

```
Tests Completed!
Number of test cases: 6
Failed 6/6 tests, see above for more information
Elapsed time of tests execution: 0 seconds
```

This is saying that 6 out of 6 tests were failed, that is because the methods both `return` 0 at the moment. If you change the 0 to an expression that actually gives the correct answer based on `sideLength`. `sideLength` is already declared in each method, you can look at the method header and see that it is passed in as a parameter.

If you still want to write code that runs 1 time, you can still use the main method like always, it is located at the bottom of the program. Notice that there is a line that says:

```
Running main method...
```

The output from your main method should show up after that, if you write something.

I am requiring that you write your own tests for this assignment as well, your main method should test at least 2 cases for surface area and volume, so 4 tests in total.

A sample output for a program that **would earn full credit** is below.

I hope it also goes without saying that you can only modify **Main.java**.

## Sample Input/Output

### Input

No input is necessary on your part!

### Output

```
Starting Tests...

testSurfaceArea_1x1x1 test is starting...
testSurfaceArea_1x1x1 test is finished...

testSurfaceArea_2x2x2 test is starting...
testSurfaceArea_2x2x2 test is finished...

testSurfaceArea_4x4x4 test is starting...
testSurfaceArea_4x4x4 test is finished...

testVolume_1x1x1 test is starting...
testVolume_1x1x1 test is finished...

testVolume_2x2x2 test is starting...
testVolume_2x2x2 test is finished...

testVolume_4x4x4 test is starting...
testVolume_4x4x4 test is finished...

Tests Completed!
Number of test cases: 6
All tests passed! Congrats!
Elapsed time of tests execution: 0 seconds

Running main method...

Testing: sideLength = 3

Volume: 27
Surface Area: 54

Testing: sideLength = 10

Volume: 1000
Surface Area: 600
```

## Submission

Please submit the following to google classroom:

1. `Main.java`
    * Hover over `Main.java`.
    * Click the three dots to the right of the file name.
    * Click `Download`.
    * Upload the downloaded file to google classroom.
2. A link to your replit project

## Rubric

<table>
<tbody>
  <tr>
    <td valign="top"><b>Coded Solution</b><br><br>The coded solutions works correctly with no syntax, logic, or run-time errors.</td>
    <td valign="top"><b>8pts</b><br><br>* The submitted code compiles successfully. <br><br>* The submitted program is free of run-time and logic errors. <br><br>* The submitted program returns the anticipated output for all input tested.
</td>
    <td valign="top"><b>4pts</b><br><br>* The submitted program compiles successfully. <br><br>* The submitted program includes run-time and/or logic errors that result in correct output. <br><br>* The submitted program returns the anticipated output for most (but not all) input tested.
</td>
    <td valign="top"><b>2pts</b><br><br>* A program is submitted but it fails to compile. <br><br><b><em>or</em></b> <br><br>* The submitted program compiles correctly. <br><br>* The submitted program includes run-time and/or logic errors that result in incorrect output. <br><br>* The submitted program returns the anticipated output for less than half of the input tested.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted.
</td>
  </tr>
  <tr>
    <td valign="top"><b>Target Concepts</b><br><br>The program effectively uses the intended target concepts.</td>
    <td valign="top"><b>8pts</b><br><br>* The program effectively uses the target concepts being discussed in class or outlined within the project specifications for the given problem situation.
</td>
    <td valign="top"><b>4pts</b><br><br>* The program incorrectly uses the target concepts being discussed in class or outlined within the project specifications for the given problem situation. <br><br>* Moderate effort to use the target concepts is evident.
</td>
    <td valign="top"><b>2pts</b><br><br>* The program incorrectly uses the target concepts being discussed in class or outlined within the project specifications for the given problem situation. <br><br>* Minimal effort to use the target concepts is evident.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted. <br><br><b><em>or</em></b><br><br> * No attempt was made to use the target concepts being discussed in class or outlined within the project specifications for the given problem situation.
</td>
  </tr>
  <tr>
    <td valign="top"><b>User Interface</b><br><br>The program produces output that is easy for the user to read.</td>
    <td valign="top"><b>2pts</b><br><br>* Output demonstrates appropriate spacing for best user readability. <br><br>* Output contains no spelling or grammatical errors.
</td>
    <td valign="top"><b>1pts</b><br><br>* Output includes minor spacing problems which results in information which is inconsistent or confusing. <br><br>* Output contains minor spelling or grammatical errors.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted. <br><br><b><em>or</em></b> <br><br>* Output includes major spacing problems which is severely inconsistent or confusing. <br><br>* Output contains major spelling or grammatical errors.
</td>
  </tr>
  <tr>
    <td valign="top"><b>Readability of Code</b><br><br>The program code is documented and formatted for human readability.</td>
    <td valign="top"><b>2pts</b><br><br>* The submitted solution includes the required header documentation (name, date, purpose). <br><br>* Header documentation includes appropriate modification comments if the submitted solution is a modification to a previously submitted program. <br><br>* Code is properly formatted. Open and close brackets are properly aligned and code within the brackets is appropriately indented. <br><br>* All variables are self-documented (i.e. named in such a way that the name indicates the purpose of the variable).
</td>
    <td valign="top"><b>1pts</b><br><br>* The submitted solution includes the some, but not ALL, of the required header documentation (name, date, purpose). <br><br>* In the case of modifications to a previously submitted program, modification comments are missing or incomplete. <br><br>* Code is unformatted and difficult to follow. Brackets aren't aligned and/or code within brackets is not indented. <br><br>* Numerous variable names are ambiguous (i.e. x) and do not indicate the purpose of the variable.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted. <br><br><b><em>or</em></b> <br><br>* The submitted solution includes no documentation of any kind.</td>
  </tr>
</tbody>
</table>
