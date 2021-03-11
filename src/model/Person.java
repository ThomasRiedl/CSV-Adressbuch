package model;

public class Person {

    private String name;
    private String addr;
    private String phoneNR;

    public Person()
    {
        setAddr("-");
        setName("-");
        setPhoneNR("-");
    }

    public Person(String n, String a, String pNR) {
        this.name = n;
        this.addr = a;
        this.phoneNR = pNR;
    }

    @Override
    public String toString() {
        return name + "," + addr + "," + phoneNR;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setPhoneNR(String phoneNR) {
        this.phoneNR = phoneNR;
    }

    public String getPhoneNR() {
        return phoneNR;
    }
}
