import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        System.out.println("---- Collections ----");
        ListCollection listCollection = new ListCollection();
        listCollection.addElement(1);
        //using stream to generate int values [ we used boxed to convert intstream to list (it's important)!]
        List<Integer> tempIntStreamList = IntStream.range(2, 13).boxed().collect(Collectors.toList());
        listCollection.addAllFunc(tempIntStreamList);
        listCollection.removeElement(12);
        // we can also remove element by his index
        // index: 11 - value = 10;
        listCollection.removeElementByIndex(10);
        listCollection.containsFunc(5);
        listCollection.iteratorFunc();
    }

}
