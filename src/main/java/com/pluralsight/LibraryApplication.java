package com.pluralsight;

public class LibraryApplication {
    public static void main(String[] args) {
        //   Array of 20 Book objects
        Book[] books = new Book[20];
        //   List of 20 Book objects
        Book book1 = new Book(1, "978-0-69-295792-9", "Where Lions Go To Bloom");
        books[0] = book1;

        Book book2 = new Book(2, "978-0-06-231500-7", "The Alchemist");
        books[1] = book2;

        Book book3 = new Book(3, "978-1-94-975922-8", "The Mountain Is You");
        books[2] = book3;

        Book book4 = new Book(4, "978-1-57224-537-2", "The Untethered Soul");
        books[3] = book4;

        Book book5 = new Book(5, "978-1-5247-4674-2", "Dopamine Nation");
        books[4] = book5;

        Book book6 = new Book(6, "0-7607-0930-0", "Dreams");
        books[5] = book6;

        Book book7 = new Book(7, "978-0-7624-6597-2", "Magical Places");
        books[6] = book7;

        Book book8 = new Book(8, "978-1-78950-656-3", "World Mythology");
        books[7] = book8;

        Book book9 = new Book(9, "978-1-59463-472-7", "Big Magic Creative Living Beyond Fear");
        books[8] = book9;

        Book book10 = new Book(10, "978-1-250-84272-5", "Weyward");
        books[9] = book10;

        Book book11 = new Book(11, "978-8-352-83153-3", "Never Lie");
        books[10] = book11;

        Book book12 = new Book(12, "978-0-8021-2534-7", "Valley of the Dolls");
        books[11] = book12;

        Book book13 = new Book(13, "978-1-9821-3003-9", "The Braid");
        books[12] = book13;

        Book book14 = new Book(14, "978-1-6659-5488-4", "Powerless");
        books[13] = book14;

        Book book15 = new Book(15, "978-0-593-49232-1", "The Climate Book");
        books[14] = book15;

        Book book16 = new Book(16, "978-0-553-57340-4", "A Game of Thrones");
        books[15] = book16;

        Book book17 = new Book(17, "978-0-553-57990-1", "A Clash of Kings");
        books[16] = book17;

        Book book18 = new Book(18, "987-0-553-57342-8", "A Storm of Swords");
        books[17] = book18;

        Book book19 = new Book(19, "987-0-553-58202-4", "A Feast For Crows");
        books[18] = book19;

        Book book20 = new Book(20, "978-0-553-58201-7", "A Dance With Dragons");
        books[19] = book20;


    }


}
