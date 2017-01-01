import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    Set<Integer> keys = old.keySet();
    Map<String, Integer> newMap = new HashMap<String, Integer>();
    changeMap(old, keys, newMap);
    return newMap;

  }

  private void changeMap(Map<Integer, List<String>> old, Set<Integer> keys, Map<String, Integer> newMap) {
    for (Integer i :
        keys) {
      List<String> values = old.get(i);
      for (String value :
          values) {
        newMap.put(value.toLowerCase(), i);
      }

    }
  }

}



