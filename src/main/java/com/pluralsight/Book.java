package com.pluralsight;

public class Book {
    // field members
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false; // I added isCheckedOut = false bc initially it won't be checkedOut
        this.checkedOutTo = ""; // I added checkOutTo = "" bc the initially it will be empty since no one has checked it out yet
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // checkOut(name) Method
    public void checkOut(String name) {
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }

    // checkIn() Method
    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

}
