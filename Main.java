import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] list={10,20,20,10,10,20,5,20};
        HashMap<String, Integer> liste = new HashMap<String, Integer>();
        int sayac=0,temp=0;
        while(sayac<list.length) {
            for (int i = 0; i < list.length; i++) {
                if ((list[sayac] == list[i])) {
                    temp++;
                }
            }
            liste.put(list[sayac]+" sayısının tekrarı ->", temp);
            temp = 0;
            sayac++;
        }
        for(String x : liste.keySet()){
            System.out.println(x +" "+ liste.get(x));
        }

    }
}
