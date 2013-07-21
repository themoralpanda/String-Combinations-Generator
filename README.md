String-Combinations-Generator
=============================

A Solution in Java for generating the various combinations available for the given input String.


Algorithm used:
===============

1)Input a string.
2)Assign the characters of the string a unique number (starting from 1 to length of the string). and the entire string will have a number containing (string length) digits.

  for example 
    lets take "abcd"
    abcd -- 1234
    ( a -1 , b-2 , c-3, d-4)
  

3)The different combinations of the given string lies between the number and the exact reverse of it.
    (1234{smallest} to 4321{largest})
    
4)Generate numbers between these smallest and largest number.
  
  -Check if the number contains exactly digits( that are in the pattern) and check if none of the digits repeat.
    for ex ( 2314 is a number between them whose digits fall under { 1,2,3,4} and contains all unique digits)
    
  - map the successful number pattern to corresponding string based on ( a -1 , b-2 , c-3, d-4)  
      for instance ( 2314 is  bcad which is a successful combination of the given string)


Author:
=======

Vigneshwar.V

< haivicky at gmail dot com >

    
    
