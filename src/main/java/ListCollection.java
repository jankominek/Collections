import java.util.*;

public class ListCollection {

    // if we want to create new arraylist or linkedList our instance should type of interface.
    public List<Integer> intList = new ArrayList<>();
    // this list it type of LinkedList not List because we want to access to LinkedList methods
    // and not only for List methods
    public LinkedList<Integer> linkedIntList = new LinkedList<Integer>();
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

        in the linkedList we have additional functions like:
            getting first and last element. that exist because in the linkedList getting an element is going better than
            in arrayList so we can also take carefully element from the middle and rechanging list will be faster than others.
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
    public void toArrayFunc(){
        System.out.println("\n\n - toArrayFunction - ");
        Object[] tempIntList = intList.toArray();
        for(Object o : tempIntList) System.out.print(o + " ");
    }
    public void sortFunc(){
        System.out.println("\n\n - sort Function - ");
        //if we want to sort List we need to use Collections.
        Collections.reverse(intList);
        System.out.println("sort reverse -> " + intList);
        Collections.sort(intList);
        System.out.println("sort asc -> " + intList);
    }
    //we can also set some value on the current index using set method on add value on specific index!
    public void setFunc(Integer index, Integer value){
        System.out.println("\n\n - set Func - ");
        Integer tVal = intList.get(index);
        intList.set(index, value);
        System.out.println("changed value " + tVal + " to "+value+" (index=" + index + " ) -> " + intList);
    }

    public void addWithIndex(Integer index, Integer value){
        System.out.println("\n\n - add with index - ");
        intList.add(index, value);// we can use only index equals List size + 1
        System.out.println("added value: " + value + " at index : "+ index + " -> " + intList);
    }
    public void clearFunc(){
        System.out.println("\n - clear function at the end because i need to go sleep");
        intList.clear();
        if(intList.isEmpty()) System.out.println("List is empty!");
    }

    // functions for LinkedList.

    public void addManyToLinkedList(List<Integer> temp){
        System.out.println("\n\n\n - Linked list - ");
        linkedIntList.addAll(temp);
        System.out.println("linkedIntList -> " + linkedIntList);
    }
    public void getFirstLastFromLinked(){
        System.out.println("\n - get first from list - ");
        Integer res1 = linkedIntList.getFirst();
        System.out.println("result -> " + res1);
        Integer res2 = linkedIntList.getLast();
        System.out.println("result -> " + res2);
    }
    //others interesing functions are: peek(), poll()
    public void peekAndPollLinkedList(){
        System.out.println("\n - peekAndPollLinkedList - ");
        //peek retrives but don;t remove first element
        Integer res1 = linkedIntList.peek();
        System.out.println("peek() res -> " + res1);
        // retrives and remove first element of this list
        Integer res2 = linkedIntList.poll();
        System.out.println("poll() res - >" + res2);
        System.out.println("linkedList result -> " + linkedIntList);
    }
    //others function are the same.
}
