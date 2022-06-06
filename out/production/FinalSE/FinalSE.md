### Introduction

Given the task of producing code to conduct conversions, for this project I will be conducting five functionalities to be stored in modules (four category 1 and one category 2):

Category 1
a. Converting a given string to upper case or lower case.
b. Identify whether numeric values are in a given string.
c. Identify whether a given string is a valid number or not.
d. Remove any numeric values in a given string and then convert the string to upper case or lower Case. 

Category 2
c. Converting a number which represents a time given in hours to minutes and vice versa, and time given in minutes to seconds and vice versa. 

Within this document, I'll be giving overviews of each of the module and how version control was utilised as well as the test designs implemented for my code, both black box testing and white box testing. Following that will be the test implementations and its documentation as well as the rundown for ethics and professionalism of produced code. 

### Module Descriptions

For the five functions, I've created 11 modules including the main...

"Main"

The Main module is used to call each of the separate modules to perform the functions listed. The Main opens up a menu by running the Converters.java program. The menu is created by a set of print statements. It then lists the five total functions asking for user integer input to output the selected function. The integer selection given by the user through keyboard input will then call a module to be used for function output. 

"lowerCase"

The lowerCase module is used to take a lower case string input from user to produce a case conversion output to an upper case string. It is run by first selecting the "Converting a given string to upper case or lower case." function in the menu then selecting the "1. Lower case to upper case." option in the second menu produced by the Main module. After collecting the user's string input, the system will use a specific Java command (toUpperCase) that outputs user input in upper case through print statement.

"upperCase" 

The upperCase module is used to take a upper case string input from user to produce a case conversion output to a lower case string. It is run by first selecting the "Converting a given string to upper case or lower case." function in the menu then selecting the "2. Upper case to lower case." option in the second menu produced by the Main module. After collecting the user's string input, the system will use a specific Java command (toLowerCase) that outputs user input in lower case through print statement.

"containNumeric"

The containNumeric module is used for function 2, "Identify whether numeric values are in a given string." The module is called after selecting that specific function in the menu provided by the Main module. The module asks for user input as a string. The user will enter their string and the system will scan to identify if there any integer values within the string and give a print output based on its findings. 

"isNumeric"

The isNumeric module is used for function 3, "Identify whether a given string is a valid number or not." Basically, the module will be called upon by integer selecion from the main to then ask for user string input on keyboard. Using boolean, the scanner will identify if the string is numerical or not, a true statement will output a print statement delcaring that the input is indeed a valid number, if false, it'll output a print statement declaring an invalid number was input. 

"removeNum"

The removeNum module is used for function 4, "Remove any numeric values in a given string and then convert the string to upper case or lower Case." Calling the module will be done in the same fashion as the previous functions by integer selection in the menu. The module once called, will require string input. The system will then scan for any non-numeric values in the string and using an if-statement, it'll append all non-numeric values to create a string containing no numerical values. The system will then prompt the user to choose to either make the string upper case or lower case through integer selection. Print output depending on case choice. 

"readArray"

The readArray module is used for function 5, "Converting a number which represents a time given in hours to minutes and vice versa, and time given in minutes to seconds and vice versa." This module is called by integer selection from the Main module. It doesn't require user input however it requires parameters set in the code by setting a file as the input. For this module, it is under the assumption that the file used for input is under the name "times.txt" whilst containing a set of integers to be used for time conversion. The module doesn't produce an output, but acts to read the file given line by line to be used in other modules. 

"HoursToMinutes"

This module is part of function 5 as well. The module collects data from the readArray module that is called within this module to provide input. The system creates an array by storing read data into an array to be used in a for loop to conduct conversion using an equation. For every integer value read (assuming that each integer is a time given), it'll convert the time in hours into minutes by multiplying the integer by 60 and outputting a print statement in a separate file titled "Hours2Minutes.txt". The module returns the conversion value. 

"MinutesToHours"

This module is part of function 5 as well. The module collects data from the readArray module that is called within this module to provide input. The system creates an array by storing read data into an array to be used in a for loop to conduct conversion using an equation. For every integer value read (assuming that each integer is a time given), it'll convert the time in hours into minutes by dividing the integer by 60 and outputting a print statement in a separate file titled "Minutes2Hours.txt". The module returns the conversion value. 

"MinutesToSeconds"

This module is part of function 5 as well. The module collects data from the readArray module that is called within this module to provide input. The system creates an array by storing read data into an array to be used in a for loop to conduct conversion using an equation. For every integer value read (assuming that each integer is a time given), it'll convert the time in hours into minutes by multiplying the integer by 60 and outputting a print statement in a separate file titled "Minutes2Seconds.txt". The module returns the conversion value. 

"SecondsToMinutes"

This module is part of function 5 as well. The module collects data from the readArray module that is called within this module to provide input. The system creates an array by storing read data into an array to be used in a for loop to conduct conversion using an equation. For every integer value read (assuming that each integer is a time given), it'll convert the time in hours into minutes by dividing the integer by 60 and outputting a print statement in a separate file titled "Seconds2Minutes.txt". The module returns the conversion value. 


### Modularity

Modularity means to break down the software into workable pieces that help to build the overall project in separate parts. We can create a checklist to ensure that modularity is optimal in our project.

- Refactor code
- Reduce redundancy
- Improve cohesion
- Reduce coupling
- Conduct maintenance 

Modularity Review

From a personal standpoint, the code I've created utilises 11 separate modules with coupling only being existent within the fifth function that requires modules to be called into another module. Where it is required for file reading. I'd say that coupling is low. With the use of a file as a global variable. 

### Version Control

Using git, I was able to store different versions of my code to be used for any updates to be made or in the case that I would like to restore an older version when playing around with different functions. I created a 5 separate branches for each designated function from the master branch. I created git commits for the purpose of checkpoints when developing my code to avoid any severe loss if I were to make any significant changes to a specific function. If I needed to go back to a specific version to redo a certain branch of code, then my previous commits would allow me to do so. 

### Test Cases


lowerCase Equivalence Partitioning


Path            | Test Data | Expected Result |
----------------|-----------|-----------------|
1. lower case input 				   |   x = "input"        | y = "INPUT" 			      |			    
2. integer input | x = 2 | y = No string detected

upperCase Equivalence Partitioning 

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. upper case input| x = "INPUT" | y = "input"
2. integer input | x = 2 | y = No string detected

containNumeric Equivalence Partitioning 

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. input containing a number | x = "input1" | y = x contains a number
2. input containing no number| x = "input" | y = x doesn't contain a number

isNumeric Equivalence Partitioning

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. input is a number | x = 1 | y = x is a number
2. input is not a number| x = "input1" | y = x is not a number

removeNum Equivalence Partitioning 

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. convert input to uppercase, removing number | x = "Input1" | y = "INPUT"
2. convert input to lowercase, removing number | x = "Input1" | y = "input"

HoursToMinutes Equivalence Partitioning

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. convert hours to minutes | x = 5 (from input file) | y = 300 (to output file)

MinutesToHours Equivalence Partitioning

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. convert minutes to hours | x = 5 (from input file) | y = 0.083 (to output file)

MinutesToSeconds Equivalence Partitioning

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. convert minutes to seconds | x = 5 (from input file) | y = 300 (to output file)

SecondsToMinutes Equivalence Partitioning

Path | Test Data | Expected Result |
-----|-----------|-----------------|
1. convert seconds to minutes | x = 5 (from input file) | y = 0.083 (to output file)


For the other modules, equivalence partitioning cannot be conducted as there is no test data or output provided, like with the module that reads the file to be used in other modules. 

Boundary value analysis is not required in this as for our numerical imports there are no ranges to separate different paths. 




### Ethics and Professionalism

In this project, I created code that converts input for certain outputs - a case converter, a numeric value identifier within a string, a number identifier, a numeric value remover and a time converter. Although these functonalities are basic at its core, within the scope of larger projects, a lack of professionalism and ethical attitude can lead to disastrous consequences. Let's use the numeric value remover as an example. Say the function acted in a banking system to remove sensitive information such as bank details by removing any identified numbers. However, the code had a bug that prevented a line of numbers to be removed due to an error. The error was not identified as there was insufficent testing done after identifying a different error which took a substaintial amount of time to fix. Therefore as a result of unprofessional behaviour, it lead to the unwanted release of bank account information, causing many people financial and privacy issues. Not only that, but due to an inability to identify one error, the general public lost trust in the company's services. 

As a software engineer it is part of our responsibility to adhere to the ethical principles to avoid harm to the wellbeing of not only self, but more importantly, to others around. From the example mentioned above, many people were harmed due to failure to act in accordance to principles found in the ACS Code of Professional Conduct. In this case, there was a failure to meet Competence and the Primacy of the Public Interest. To avoid such scenarios occurring, we need to understand the responbility we hold as software engineer and to endeavour the preservation of the confidentiality and privacy of the information of others in regards to the primacy of public interest - meaning to understand that there is a weight of responsibility in the task given as a software engineer for companies like banking services. As for the principle of Competence we should endeavour to provide products and services which match the operational and financial needs of stakeholders by ensuring that sufficient testing is done to avoid conseuqeunces and seek help from colleagues where necessary to help conduct with testing.
