package Chapter_16_a;
import java.util.HashSet;
import java.util.Set;

//1.Write a method called set that accepts an index and a value and sets the list’s element at that index to have the give
// value. You may assume that the index is between 0 (inclusive) and the size of the list (exclusive).
public class Exercise_01_a
{
    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();
        System.out.println(linkedIntList);


        for (int i = 0; i < 10 ; i++)
            linkedIntList.add(i);
        System.out.println(linkedIntList);

        linkedIntList.add(1, 25);
        System.out.println(linkedIntList);
    }




}
