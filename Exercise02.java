import java.util.Arrays;
import java.util.Comparator;

public class Exercise02 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0]=new Book("西游记dfgdfgdfgdfgd",20);
        books[1]=new Book("金瓶梅d",50);
        books[2]=new Book("水浒传",9);
        books[3]=new Book("java入门到放弃",100);

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book01=(Book) o1;
                Book book02=(Book) o2;
                double priseVul=book02.getName().length()-book01.getName().length();
                if(priseVul>0){
                    return -1;
                }else if(priseVul<0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
