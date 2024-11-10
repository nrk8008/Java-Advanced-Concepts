package Comparable.PlayerSortingUsingComparable;

import java.util.*;

public class TestPrintElements {

    public static void main(String[] args) {

        //Element is String, Integer,or other primitive type
        List<String> sList = new ArrayList<String>();
        sList.add("string1");
        sList.add("string2");
        System.out.println(sList);

        //Element is custom type
        Student st1=new Student(15,"Tom");
        Student st2=new Student(16,"Kate");
        List<Student> stList=new ArrayList<Student>();
        stList.add(st1);
        stList.add(st2);
        System.out.println(stList);
    }
}


