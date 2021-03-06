#Rungle

Rungle is a small-scale, interpreted programming language based on a deterministic Turing Machine. The language works by using a series
of one character commands, which shift around values in a 30000 cell array of integers. Rungle extends the more basic Turing methods, by allowing you to add array cells to other array cells,
and more.

##Interpreter

The Interpreter works off of a Swing GUI application packaged as a JAR. Underneath that, Rungle processes statements by breaking the statement into an array of characters and processing them one by one. After every line is processed(by hitting the enter key), the state of the Turing Machine is saved, and the pointer is also saved. This allows for continous input from the user and effecient computation.

##Commands

Rungle works off a series of one length characters, which each effect the Turing Machine in different ways. Here is a list an description of them:

####`>`:
Moves the pointer one place to the right, or increases the index of the pointer on the array of cells.

####`<`:
Moves the pointer one place to the left, or decreases the index of the pointer on the array of cells. This will never

####`+`:
Increments the value of the current cell by one.

####`-`:
Decrements or decreases the value of the current cell by one. Can go below zero and produce negative numbers.

####`.`: 
Prints the value of the current cell. Doing repeated periods will cause the same value to be printed multiple times, seperated by spaces.

####`!`:
Resets the pointer back to `0`.

####`#`:
Adds the value of the current cell to the next cell.

####`^`:
Multiplies the current cell by the value of the next cell.

####`*`:
Sums the value of all cells up to the cell the pointer is currently at, and sets that value to the current cell.