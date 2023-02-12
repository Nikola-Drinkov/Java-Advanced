package BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int titleCompare = o1.compareTo(o2);
        if(titleCompare!=0){
            return titleCompare;
        }
        return o1.getYear()-o2.getYear();
    }
}
