package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {


    static  public List<String> tails(String value) {
        List<String> list = new ArrayList<String>();
        list.add(value);
        for (int i=1;i<=value.length();i++){
            list.add(list.get(i-1).substring(1));
            System.out.println(list.get(i));
        }
        return list;
    }

}
