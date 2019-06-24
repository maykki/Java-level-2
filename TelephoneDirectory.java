import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TelephoneDirectory {
    private Map <String, TreeSet>  telephoneDirectory = new HashMap<>();

    public void add(String name, String number){
        if(telephoneDirectory.containsKey(name)) {
            TreeSet tempSet = telephoneDirectory.get(name);
            tempSet.add(number);
            telephoneDirectory.put(name, tempSet);
        }
        else{
            TreeSet<String> tempSet = new TreeSet<>();
            tempSet.add(number);
            telephoneDirectory.put(name, tempSet);
        }
    }

    public TreeSet get(String name) {
        TreeSet tempSet = telephoneDirectory.get(name);

        return tempSet;
    }

}
