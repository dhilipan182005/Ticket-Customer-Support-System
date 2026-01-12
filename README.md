# Train Ticket Customer Support System

## Description

This project is a Java-based console application that implements a **Train Ticket Customer Support System** using a **Singly Linked List**.
Tickets are managed based on priority so that critical issues are resolved first.

## Objectives

* Implement a singly linked list
* Handle customer support tickets efficiently
* Process tickets based on priority

## Features

* Add new support tickets
* Automatically arrange tickets by priority
* Resolve the highest-priority ticket
* Display all pending tickets
* Menu-driven console interface

## Priority Levels

* Critical (Highest)
* High
* Normal (Lowest)

## Data Structure

* Singly Linked List
  Each node stores ticket details and a reference to the next node.

## Project Files

* `Main.java` – Program execution and menu handling
* `Ticket.java` – Ticket node structure
* `TicketQueue.java` – Linked list operations

## How It Works

1. User selects an option from the menu
2. Tickets are inserted into the list based on priority
3. Resolving a ticket removes the head node
4. Tickets are displayed in priority order

## Menu Options

```
1. Add Ticket
2. Resolve Ticket
3. List Tickets
0. Exit
```

## Time Complexity

* Add Ticket: O(n)
* Resolve Ticket: O(1)
* List Tickets: O(n)

## How to Run

```bash
javac Main.java
java Main
```

## Conclusion

This project demonstrates the use of **singly linked lists** and **priority-based processing** in a real-world support system scenario.
