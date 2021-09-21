# TemperaturAndHumidityClient
A program that uses a Raspberry Pi to monitor temperature and humidity.
The server is written in python and the client that recieves data is written in java.

The way we went about implementing the solution is based on research on the internet.

We use TCP (Transmission Control Protocol) in this project. The data from the raspberry pi is handled by a program written in Python.
We created our own protocol for sending and recieving data -  we ended up using Atomic Integers.
The Python program recieves data from the raspberry pi and the Python program sends the collected data from the raspberry pi to the java program.
The server code can be seen here: https://github.com/KRL1991/RaspberryPiServer



Conclusion:
We succeded in setting up a Raspberry PI with a linux based OS. 
We also connected a sensor that monitored temperature and humidity data. 
We can send the data from the raspberry pi via a python program and that data can be recieved by a java client.
