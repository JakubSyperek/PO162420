public record BookDTO(String title, String author, double price, int yearOfPublication) {
    public String BookDTOInfo(){
        return author + ", '" + title + "', " + + yearOfPublication  + ", Cena: " + price;
    }
}
 class TestBookDTO {
    public static void main(String[] args){
        BookDTO bookDTO1 = new BookDTO("Lalka", "Bolesław Prus", 39.99, 2008);
        BookDTO bookDTO2 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz", 49.99, 1999);
        BookDTO bookDTO3 = new BookDTO("Ludzie bezdomni", "Stefan Żeromski", 35.99, 2013);
        BookDTO bookDTO4 = new BookDTO("Dziady, cz. III", "Adam Mickiewicz", 29.99, 2017);
        BookDTO bookDTO5 = new BookDTO("Zbrodnia i kara", "Fiodor Dostojewski", 49.99, 2019);
        System.out.println(bookDTO1.BookDTOInfo());
        System.out.println(bookDTO2.BookDTOInfo());
        System.out.println(bookDTO3.BookDTOInfo());
        System.out.println(bookDTO4.BookDTOInfo());
        System.out.println(bookDTO5.BookDTOInfo());
    }
}
