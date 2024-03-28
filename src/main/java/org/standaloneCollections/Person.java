package org.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,Integer> fee;

    private Properties prop;
    public List<String> getFriends() {
        return friends;
    }

    public Map<String, Integer> getFee() {
        return fee;
    }
    public Properties getProp() {
        return prop;
    }
    public void setFee(Map<String, Integer> fee) {
        this.fee = fee;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }



    public void setProp(Properties prop) {
        this.prop = prop;
    }



    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", fee=" + fee +
                ", prop=" + prop +
                '}';
    }
}
