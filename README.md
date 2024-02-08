# java-queue-implementation

This repository contains a Java implementation of a queue abstract data type (ADT) using arrays and singly linked lists.

## Classes

The project consists of four classes:

- **Main**: This class contains the main method that creates a list, an array queue, and a linked list queue object and tests some of the methods on them.
- **List**: This class represents a list ADT, which has methods for adding, removing, peeking, checking if full or empty, and converting to a string.
- **ArrayQueue**: This class represents a queue ADT implemented using an array, which inherits from the List class and overrides some of its methods.
- **Node**: This class represents a node in a singly linked list, which has a data field and a next pointer. It also has two constructors and a toString method.
- **LinkedListQueue**: This class represents a queue ADT implemented using a singly linked list, which inherits from the List class and overrides some of its methods.

## Methods

The List class has the following methods:

- **add**: This method adds a new element to the end of the list. It throws an exception if the list is full.
- **remove**: This method removes and returns the element at the beginning of the list. It throws an exception if the list is empty.
- **isEmpty**: This method checks if the list is empty. It returns true if the list is empty or false otherwise.
- **isFull**: This method checks if the list is full. It returns true if the list is full or false otherwise.
- **peek**: This method returns the element at the beginning of the list without removing it. It throws an exception if the list is empty.
- **toString**: This method returns a string representation of the list. It shows the elements from front to end, separated by commas.

The ArrayQueue class has the following methods:

- **ArrayQueue**: This is a constructor that takes an integer parameter for the capacity of the array and initializes the list accordingly.
- **add**: This method overrides the add method of the List class and adds a new element to the rear of the queue. It throws an exception if the queue is full.
- **remove**: This method overrides the remove method of the List class and removes and returns the element at the front of the queue. It throws an exception if the queue is empty.
- **peek**: This method overrides the peek method of the List class and returns the element at the front of the queue without removing it. It throws an exception if the queue is empty.
- **isFull**: This method overrides the isFull method of the List class and checks if the queue is full. It returns true if the queue is full or false otherwise.
- **isEmpty**: This method overrides the isEmpty method of the List class and checks if the queue is empty. It returns true if the queue is empty or false otherwise.

The LinkedListQueue class has the following methods:

- **LinkedListQueue**: This is a constructor that initializes the list with a null front and rear node and a zero size.
- **add**: This method overrides the add method of the List class and adds a new node to the rear of the queue. It does not throw an exception as the queue can grow dynamically.
- **remove**: This method overrides the remove method of the List class and removes and returns the data of the node at the front of the queue. It throws an exception if the queue is empty.
- **peek**: This method overrides the peek method of the List class and returns the data of the node at the front of the queue without removing it. It throws an exception if the queue is empty.
- **isFull**: This method overrides the isFull method of the List class and checks if the queue is full. It always returns false as the queue can grow dynamically.
- **isEmpty**: This method overrides the isEmpty method of the List class and checks if the queue is empty. It returns true if the queue is empty or false otherwise.



You can modify the main method to test different methods on different queues.
