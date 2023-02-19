package map;

import java.util.*;

public class M5 {
    public static void main(String[] args) {
        /*Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
(Büyük/küçük harfe duyarlı değil) */
String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
s = s.replaceAll("\\p{Punct}","").toLowerCase();
Map<String, Integer> wordOccurence = new HashMap<>();
String[] words = s.split(" ");
for(String w : words){
Integer numOfOccurence = wordOccurence.get(w);
if(numOfOccurence == null ){
 wordOccurence.put(w, 1);
}else{
 wordOccurence.put(w, numOfOccurence+1);
}
}
System.out.println(wordOccurence);

List<String> list=new ArrayList<>(List.of(words));
list.sort(Comparator.comparing(String::valueOf));
int counter=1;
        Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < words.length; i++) {
            //////////////    map.putAll(list.get(i),counter );
                if(list.get(i)== list.get(i+1)){
                    counter++;
                }


        }
    }
}
