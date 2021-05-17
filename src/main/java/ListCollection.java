import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

    // if we want to create new ArrayList our instance should type of interface.
    public List<Integer> intList = new ArrayList<>();

    public ListCollection(){

        System.out.println("- Basic elements of our list -");
        System.out.println(intList + "\n");

    }

    /*
        functions of List interace:
        To the List interface belong Arraylist and also Vector but Vector is not used currently.
            -   add
            -   addAll
            -   remove
            -   removeAll
            -   size
            -   isEmpty
            -   contains
            -   iterator
            -   toArray
            -   sort
            -   clear() is for clear all Array after this Array will be empty
            -   equals
            -   hashCode()
            -   get
     */
    public void addElement(Integer temp){
        System.out.println("\n - adding element - ");
        intList.add(temp);
        System.out.println("result list-> " + intList);
    }
    public void addAllFunc(List<Integer> tempList){
        System.out.println("\n - adding list to list - ");
        intList.addAll(tempList);
        System.out.println("result list-> " + intList);
    }
    public void removeElement(Integer temp){
        System.out.println("\n - remove element - ");
        intList.remove(temp);
        System.out.println("result list-> " + intList);
    }
    public void removeElementByIndex(Integer index){
        System.out.println("\n - remove element by index - ");
        intList.remove(intList.get(index));
        System.out.println("result list-> " + intList);
    }
    public void containsFunc(Integer temp){
        System.out.println("\n - if list contain element - ");
        if(intList.contains(temp)) System.out.println("contain!");
    }
    // used to iterate our list by Iterator interface.. we'll use it more later
    public void iteratorFunc(){
        System.out.println("\n - Iterator - ");
        Iterator<Integer> iter = intList.iterator();
        while(iter.hasNext()) System.out.print(iter.next() + " ");
    }

}
