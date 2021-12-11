# person_family_java
just a program for my  java exam:)

Public class reader contains three private fields
String surname
book b1
book b1
A constructor that assigns a value to the surname field
ToString method - displays information about all fields
Method Public void TakeBook (book b) - allows the user to rent a book if it exists and if the user has the opportunity to rent a book (he currently has a maximum of one book in rent)
Public void DelBook (book b) - deletes the book if it exists

The public class book contains a private variable String author that stores the author of the book, a private variable String name that stores the title of the book, and a private variable Boolean rent that indicates whether the book is rented.
public book (String author, String name) - Creates an object and assigns values to the author and name fields.
public String toString () - displays the values of the author, name, rent status fields.
The public String method returns the variable author.
The public Boolean method returns the variable rent.
public void setRent (Boolean rent)
The public String method returns the variable name.

public class Main - creates three objects of class book (bk1, bk2, bk3),
creates three objects of class reader (r1, r2, r3). And also applies all existing functions to them in turn.
