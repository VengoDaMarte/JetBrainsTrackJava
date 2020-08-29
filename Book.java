class Book {
    String title;
    int yearOfPublishing;
    String[] authors;
/*
Sometimes you don't want to directly assign a collection (authors).
If you do, internal data of your class could be modified from outside of the class.
That's why you want to create a copy of the array instead. NOT SURE ABOUT THIS
also look into arraycopy (user supplied array is stored directly - bad)
*/
    Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors.clone();
    }
}
