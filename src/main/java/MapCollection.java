import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapCollection {

    /*
        Map it's interface of collection !framework! but it's not a collection, it doesn't implement Collection interface
        because we have to use key-value.

        HashMap - it's a basic implementation of Map
        TreeMap - it's sorted Hashmap
        LinkedHashMap - we can use it when we want to iterate element in order as we added.

        Map interace we don't have a add() funtion because Map interace doesn't implement Collection functions.

     */
    Map<String, Integer> map = new HashMap<>();

    public MapCollection() {
        System.out.println("Wolcome to Map collection!\n");

    }
    private void iterateMap(Map<String, Integer> iteratedMap){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
    public void addElementToMap(){
        System.out.println(" - adding element - ");
        map.put("first element", 1);
        System.out.println("our map : ");
        this.iterateMap(map);
    }
    //we can also put all element but we make it i random order
    public void addAllElementsToMap(Map<String, Integer> tempMap){
        System.out.println("\n - addAllElementsToMap - ");
        map.putAll(tempMap);
        System.out.println("our map : ");
        this.iterateMap(map);
    }

    // we can also change value of some key

    public void changeValue(String key, Integer value){
        System.out.println("\n - change value - ");
        System.out.println(" map before -> " + map);
        for (Map.Entry e : map.entrySet()){
            if(e.getKey().equals(key)){
                e.setValue(value);
            }
        }
        System.out.println(" map after -> " + map);
    }
    // it perform us how treeMap sort an elements.
    // streams are the simplest way to convert map to other map :) but for it we change key corresponding to the values
    public void hashToTree(){
        System.out.println("\n - treeMap perform - ");
        System.out.println("HashMap -> " + map);
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap = map.entrySet().stream().collect(Collectors.toMap( e -> Integer.toString(e.getValue()), Map.Entry::getValue));
        System.out.println("treeMap -> " + treeMap);
    }


}
