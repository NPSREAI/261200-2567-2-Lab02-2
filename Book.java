class Book {
    String title;
    String author;
    double price;

    // ตัวสร้างเริ่มต้น
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // ตัวสร้างพร้อมพารามิเตอร์
    public Book(String title,String author,double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // แสดงรายละเอียดของหนังสือ
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // อัปเดตราคา
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
            System.out.println("\nValid price! Updated price.");
        } else {
            System.out.println("\nInvalid price! Update price is failed. Price not updated.");
        }
    }
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0.0 && discountPercentage < 100.0) {
            this.price = this.price*(1-discountPercentage / 100.0);
            System.out.println("\nDiscount applied: " + discountPercentage + "%.");
        } else {
            System.out.println("\nInvalid discount percentage! Discount not applied.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();

        // ทดสอบใช้ส่วนลด
        hp1Book.applyDiscount(30);
        hp1Book.displayDetails();

    }
}


