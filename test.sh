!/bin/bash

clear
echo 'Runnint test for single client and server'

rmiregistry &
sleep 3

# running server
java Server &
sleep 3

# running client and writing o/p to file
java SorterClient > outputClient.txt &
P1=$!

# waiting to finish executing client
wait $P1

# killing server and rmiregistry
pkill -9 java
pkill -9 rmiregistry

# compare o/p with expected o/p
cmp --silent outputClient.txt expectedClientOutput.txt && o1= true || o1=false

if $o1 ; then
    echo 'Test with single client Succesful'
else
	echo 'Test failed'
fi

echo 'Runnint test for server and multiple clients with their own stack'
rmiregistry &
sleep 3

# running server
java Server &
sleep 3

# running clients and writing o/p to file
java SorterClient > outputClient.txt &
P5=$!
java SorterClient > outputClient1.txt &
P2=$!
java SorterClient > outputClient2.txt &
P3=$!
java SorterClient > outputClient3.txt &
P4=$!

# waiting to finish executing clients
wait $P2 
wait $P4 
wait $P3 
wait $P5

# killing server and rmiregistry
pkill -9 java
pkill -9 rmiregistry

# compare o/p with expected o/p
diff --from-file expectedClientOutput.txt outputClient.txt outputClient1.txt outputClient2.txt outputClient3.txt && o1= true || o1=false

if $o1 ; then
    echo 'Test Succesful for multiple clients'
else
	echo 'Test failed'
fi