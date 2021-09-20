# TemperaturAndHumidityClient
A program that uses a Raspberry Pi to monitor temperature and humidity.
The server is written in python and the program that recieves data is written in java.

We use TCP (transmission control protocol) in this project. The data from the raspberry pi is handled by a program written in Python. 
The Python program sends the collected data from the raspberry pi to the java program.
The server code can be seen here: https://github.com/KRL1991/RaspberryPiServer
