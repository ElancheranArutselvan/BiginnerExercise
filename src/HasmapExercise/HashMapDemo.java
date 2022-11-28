package HasmapExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,String> ss = new HashMap<>();
        ss.put("Thanjavur" ,"Agriculture");
        ss.put("IttaNagar","Ore");
        ss.put("Kashmir","Apple");
        ss.put("Banaras","Textile");
        ss.put("Northeast","TribalCrafts");
        System.out.println(ss);
        System.out.println(ss.size());
        Set u = ss.entrySet();
        System.out.println(u);
//        Collections v = (Collections) ss.values();
//        System.out.println(v);
        System.out.println(ss.get("IttaNagar"));
        System.out.println(ss.keySet());
        System.out.println(ss.values());
        for(String i : ss.keySet()){
            System.out.println(i+" famous for "+ss.get(i));
        }
        ss.remove("Kashmir");
        System.out.println(ss);
        ss.clear();
        System.out.println(ss);
        String a= "venkat vishal";
        HashMap<Character,Integer>charCount = new HashMap<>();
        System.out.println(charCount);
        char[] ab = a.toCharArray();
        for (char b:ab) {
            if(charCount.containsKey(b)){
                charCount.put(b,charCount.get(b)+1);
            }else {
                charCount.put(b,1);
            }
        }
        System.out.println(charCount);
        System.out.println(charCount.entrySet());
        Set<Map.Entry<Character,Integer>>cd= charCount.entrySet();
        for(Map.Entry<Character,Integer>entry:cd){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        HashMapDemo str = new HashMapDemo();
        String gh = "Sachin is the greatest of all time the player is";
        char[]xz = gh.toCharArray();
        System.out.println(gh.toCharArray());
        str.countWords(gh);
        str.countChar(gh);
//        HashMap<String,String> wordCount = new HashMap<>();
    }

    public void countWords(String abc) {

        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] ij = abc.split(" ");
        for (String kl : ij) {
            if (wordCount.containsKey(kl)) {
                wordCount.put(kl, wordCount.get(kl) + 1);
            } else {
                wordCount.put(kl, 1);
            }
        }
        System.out.println(wordCount);
        System.out.println(wordCount.entrySet());
        Set<Map.Entry<String,Integer>>xy= wordCount.entrySet();
        for(Map.Entry<String,Integer>entry:xy){
            if(entry.getValue()!=1)
                System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public void countChar(String abc){
        HashMap<Character, Integer> charactorCount = new HashMap<>();
//        String[] ij = abc.split(" ");
        char[] mn = abc.toCharArray();
        for (char op : mn) {
            if (charactorCount.containsKey(op)) {
                charactorCount.put(op, charactorCount.get(op) + 1);
            } else {
                charactorCount.put(op, 1);
            }
        }
        System.out.println(charactorCount);
    }

}
