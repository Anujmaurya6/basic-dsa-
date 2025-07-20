package Arraycode.coding;

import java.util.HashSet;
import java.util.Set;


public class Findintersection {
        public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int[] b = {2, 3, 5};

        Set<Integer> set=new HashSet<>();

        for(int anuj:a){
            set.add(anuj);
        }
        for(int anuj:b){
            if(set.contains(anuj)){
                System.out.println(anuj+" ");
            };
        }
}
}
