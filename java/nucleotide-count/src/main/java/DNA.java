import java.util.HashMap;
import java.util.Map;

class DNA {
  String s;

  public DNA(String s) {
    this.s = s;
  }

  public int count(char a) {
    if (a == 'A' || a == 'C' || a == 'G' || a == 'T') {
      char[] sequence = s.toCharArray();
      int count = 0;
      for (char b :
          sequence) {
        if (b == a) {
          count++;
        }
      }
      return (count);
    } else
      throw new IllegalArgumentException();

  }

  public Map<Character, Integer> nucleotideCounts() {
    char[] sequence = s.toCharArray();
    Map<Character, Integer> countMap = new HashMap<>();
    countMap.put('A', count('A'));
    countMap.put('C', count('C'));
    countMap.put('G', count('G'));
    countMap.put('T', count('T'));

    return countMap;
  }
}
