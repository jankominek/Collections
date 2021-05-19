import java.util.*;

public class SetCollection {

    Set<String> set;

    public SetCollection() {
        System.out.println("\nWelcome to set collection!\n");
        set = new HashSet<String>();
    }
    /*
        Set interface it's a collectio of elements without duplicates
        Set has inherits all basic functions
     */


    //this method can present us how Set interface works.
    public void addElementsToHashSet(){
        List<String> list = new ArrayList<>();
        list = Arrays.asList("aaa", "bbbb", "ccccc", "dddddd","eeeeee", "aaa", "ccccc");
        System.out.println("List of strings -> " + list + "size: " + list.size());
        list.stream().forEach( e -> set.add(e));
        System.out.println("set of strings -> " + set + "size: " + set.size());
    }
    public void removeAndAddAll(){
        System.out.println("\n- remove and add many elements - ");
        System.out.println("set before -> " + set);
        set.remove("aaa");
        System.out.println("set after -> "+ set);

        set.addAll(Set.of("aaa", "xyzew", "hhhjjii"));
        System.out.println("new set -> " + set);
    }


}
