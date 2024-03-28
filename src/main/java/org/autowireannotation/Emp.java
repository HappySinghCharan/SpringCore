package org.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    //autowired on the variable

    @Autowired
    @Qualifier("address0")
    private Address address;

    public Address getAddress() {
        return address;
    }
//    @Autowired
    public void setAddress(Address address) {
        System.out.println("Setting address in Emp");
        this.address = address;
    }
//    @Autowired

    public Emp(Address address) {
        System.out.println("Inside Constructor");
        this.address = address;
    }

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
