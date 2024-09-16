package basic_codes;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;

public class Iterator_1 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(10,20,30,40));

        // Iterators are typicallly used to iterate over the elements of the collection
        // Iterators provides the way to access them by following syntax;
        // generic type need provide.
        Iterator<Integer> set = arr.iterator();
        Iterator<Integer> set2 = arr2.iterator();
        Iterator<Integer> set3 = set; // By reference

        // Some important methods in the iterator interface
        // set.remove(); Throws exception IllegalStateException as next() is not called till now
        System.out.println(set.next()); // ---> Getting the next element --> NoSuchElementException if no next element
        System.out.println(set.hasNext()); // ---> UnsupportedOperationException if operation not supported by collection --> Boolean return value that there is next element or not
        System.out.println(set3.equals(set)); // True --> Only compares the iterator objects ans the content in it
        System.out.println(set2.equals(set)); // False ---> even if content is same but the objects are different
        // set.remove();
        // System.out.println(set.next()); ---> After removal output of this code is 20
        // ---> Also if we call remove more that one time without next it will throw IllegalStateException
        
    }
}   
