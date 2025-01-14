# Groovy `eachWithIndex` premature loop termination

This example demonstrates a common error in Groovy when using the `eachWithIndex` method.  The `return` statement inside the closure prematurely exits the loop, not just the current iteration.  This can lead to unexpected behavior if you intend to process the remaining elements.

## Bug Report

The provided `bug.groovy` file contains a method that iterates through a list of strings. The goal is to print each item and its index, stopping when a specific item is found. However, the use of `return` inside the closure causes the loop to terminate early after finding 'target', preventing the processing of the rest of the list.

## Solution

The `bugSolution.groovy` file provides the corrected code.  Instead of `return`, we use `continue` which only stops the processing of the current iteration and moves to the next.