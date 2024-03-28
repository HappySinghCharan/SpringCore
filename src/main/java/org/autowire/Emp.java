package org.autowire;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting address in Emp");
        this.address = address;
    }

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
