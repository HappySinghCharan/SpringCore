package org.ConstructorInjection;

import java.util.List;

public class Person {
    private String name;
    private  int personId;
    private Certi certi;
    private List<String> ls;

    public Person(String name, int personId, Certi certi, List<String> ls) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.ls = ls;
    }

    public String toString()
    {
        return this.name+" : "+this.personId+" { "+this.certi.name+" } "+this.ls;
    }


}
