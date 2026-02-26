package ma.emsi.projets.magasin;

import java.util.Objects;
import java.util.Scanner;

public class Article {
    private long reference;
    private String description;
    private double priceExclTax;
    private int stock;

    public Article(long reference, String description, double priceExclTax, int stock) {
        this.reference = reference;
        this.description = description;
        this.priceExclTax = priceExclTax;
        this.stock = stock;
    }

    public void restock(int numberOfUnits) {
        this.stock += numberOfUnits;
    }

    public boolean sell(int numberOfUnits) {
        if (numberOfUnits <= this.stock) {
            this.stock -= numberOfUnits;
            return true;
        }
        return false;
    }

    public double priceInclTax() {
        return this.priceExclTax * 1.10;
    }

    public double salePriceInclTax(int numberOfUnits) {
        return this.priceInclTax() * numberOfUnits;
    }

    @Override
    public String toString() {
        return "Article{" +
                "reference=" + reference +
                ", description='" + description + '\'' +
                ", priceExclTax=" + priceExclTax +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return reference == article.reference;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reference);
    }

    public int getStock() {
        return stock;
    }

    public static void main(String[] args) {
        final int numberOfArticles = 10;
        System.out.println("Creating an array of " + numberOfArticles + " articles");

        Article[] articles = new Article[numberOfArticles];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfArticles; i++) {
            System.out.println("\n=== Enter article " + (i + 1) + " ===");

            System.out.print("Reference: ");
            long reference = scanner.nextLong();
            scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Price Excl. Tax: ");
            double priceExclTax = scanner.nextDouble();

            System.out.print("Stock: ");
            int stock = scanner.nextInt();

            articles[i] = new Article(reference, description, priceExclTax, stock);
        }

        scanner.close();

        System.out.println("=== List of articles ===");
        for (Article article : articles) {
            System.out.println(article);
        }

        System.out.println("\n=== Test of sell() method ===");
        System.out.println("Selling 3 smartphones: " +
                articles[0].sell(3));
        System.out.println("Remaining stock: " + articles[0].getStock());

        System.out.println("\nSelling 10 computers (insufficient stock): " +
                articles[1].sell(10));
        System.out.println("Remaining stock: " + articles[1].getStock());

        System.out.println("\n=== Test of restock() method ===");
        System.out.println("Tablets stock before restocking: " + articles[2].getStock());
        articles[2].restock(5);
        System.out.println("Tablets stock after restocking 5 units: " + articles[2].getStock());

        System.out.println("\n=== Test of priceInclTax() method ===");
        System.out.println(String.format("Excl. Tax price of keyboard: %.2f", articles[3].priceExclTax));
        System.out.println(String.format("Incl. Tax price of keyboard: %.2f", articles[3].priceInclTax()));

        System.out.println("\n=== Test of salePriceInclTax() method ===");
        System.out.println(String.format("Incl. Tax sale price of 5 mice: %.2f", articles[4].salePriceInclTax(5)));

        System.out.println("\n=== Test of equals() method ===");
        Article article1 = new Article(1001, "Test", 100.0, 5);
        Article article2 = new Article(1001, "Other description", 200.0, 10);
        Article article3 = new Article(2001, "Smartphone", 450.0, 10);
        System.out.println("Article1 equals Article2 (same reference): " + article1.equals(article2));
        System.out.println("Article1 equals Article3 (different reference): " + article1.equals(article3));
        System.out.println("Article1 equals articles[0] (same reference): " + article1.equals(articles[0]));
    }
}
