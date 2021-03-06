package com.giacomini.andrea.GenericsAndCollections.UsingListsSetsMapsAndQueues.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");             // bamboo
        for(String key : map.keySet()){
            System.out.print(key + ",");          // koala, lion, giraffe,
        }

        System.out.println();

        //System.out.println(map.contains("lion"));             // NON COMPILA - il metodo "contains()" non è dell'interfaccia Map ma di Collection;
        System.out.println(map.containsKey("lion"));            // TRUE
        System.out.println(map.containsValue("lion"));          // FALSE
        System.out.println(map.size());                         // 3

    }
}
