# Distributed Systems

## Java RMI with factory patter

Aaron Peter Poruthoor
a1835075

### Compling

Compile files using

```
javac *.java
```

### Running

All the commands to run the project and do testing is test.sh. Give permission to the file using 

```
chmod 777 test.sh

```
To run 
```
./test.sh
```
The expected outcome is 

```
Runnint test for single client and server
Server ready
./test.sh: line 22: 43421 Killed                  java Server
Test with single client Succesful
Runnint test for server and multiple clients with their own stack
./test.sh: line 35: 43401 Killed                  rmiregistry
Server ready
./test.sh: line 52: 43530: command not found
Test Succesful for multiple clients

```

### Input

The input for client is given in  

```
input.txt
```
The file has the format :
```
option inputValue
```
Different options available are:
```
1. pushValue                                                     		 
2. pushOperator                                                    		 
3. pop                                                 					 
4. delayPop  
5. isEmpty                                                			 
```
For options 3 and 5 the ```inputValue``` is ```nil``` as it does not take any arguments.
