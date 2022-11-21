

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class all_words {

public static void count_all(){
Scanner obj1 = new Scanner(System.in);
String para = obj1.nextLine();
obj1.close();
Map<String,Integer> hashmap = new HashMap<>();

String[] words = para.split(" ");
for (String word : words){

Integer integer = hashmap.get(word);

if (integer == null){
hashmap.put(word,1);
}
else{
hashmap.put(word,integer+1);

}

}
System.out.println(hashmap);
TreeMap<String,Integer> obj = new TreeMap<String,Integer>(hashmap);
System.out.println(obj);
}
public static void main(String[] args) {
count_all();


}
}

