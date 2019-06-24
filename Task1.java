import java.util.HashMap;

import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        String[] words = {"Апельсин","ЯБЛОКО","Банан","ЯБЛОКО","Ананас","Мандарин","яблоко","Лук","Ананас","Апельсин","Телефон","Помидор","Арбуз","Телефон","Мандарин","ЯБЛОКО", "яблоко"};
        Map<String, String>  uniqueNamesCount = new HashMap<>();
        for (String word : words){
            if(uniqueNamesCount.containsKey(word)){
                int temp = Integer.parseInt(uniqueNamesCount.get(word));
                temp += 1;
                uniqueNamesCount.put(word, String.valueOf(temp));
            }
            else{
                int temp = 1;
                uniqueNamesCount.put(word,String.valueOf(temp));
            }
        }
        System.out.println(uniqueNamesCount);




    }
}
