# Temperatur And Humidity Client
A program that uses a Raspberry Pi to monitor temperature and humidity through a sensor.  
The server is written in python and the client that recieves data is written in java.

The way we went about implementing the solution is based on research on the internet.

We use TCP (Transmission Control Protocol) in this project. The data from the raspberry pi is handled by a program written in Python.
We created our own protocol for sending and recieving data -  we ended up using Atomic Integers.
The Python program recieves data from the raspberry pi and the Python program sends the collected data from the raspberry pi to the java program.
The server code can be seen here: https://github.com/KRL1991/RaspberryPiServer

#### Brief explanation of the server and client:
We created a TCP socket for communicating with our client, we made use of the jpysocket library in python for transmitting our data.  
We transmitted the data in UTF-format so that our java client could parse the information. 
The data is constantly transmitted in a "while true" loop with a half second delay, essentially providing a new reading on the client every half second.  
The Client is a console application so the data is displayed as a text string in the terminal.  
The string is formatted in a way that makes every new reading easy to identify and read.


#### Conclusion:
We succeded in setting up a Raspberry PI with a linux based OS.  
We also connected a sensor that monitored temperature and humidity data.  
We can send the data from the raspberry pi via a python program and that data can be received by a java client.  
We planned on implementing a graph to display the data through JavaFX however due to receiving data in atomic format, this proved to be really complicated.  
We managed to make the graph respond to the data.
the input from the server expanded the axis' over time and according to the temperature/humidity readings, however we were unable to plot points on the graph.  
If we had more time we would have figured out a way to receive non-atomic data so it would be easier to display in a graph and then implemented the graph display.  
We succeded in encrypting data in our Server, we were able to send the data to our JavaClient however due to our data sending method encoding our data weirdly, our client is unable to parse and display it. See image encryption/decryption.


#### Code:

Python Server:             |  Java Client:
:-------------------------:|:-------------------------:
![](https://user-images.githubusercontent.com/70659124/135987885-2cc45715-c389-4790-a47b-bc4cdc10e559.png)  |  ![](https://user-images.githubusercontent.com/70659124/135988744-93788d57-7be6-482c-8082-79682b22890b.png)

#### Encryption/decryption:
![image](https://user-images.githubusercontent.com/70881764/136217754-3689fa5c-d4cf-4cf0-95eb-483f09231f0c.png)

