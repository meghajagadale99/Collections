package com.thoughtworks.File;

import java.io.*;


class Serialization implements Serializable {
    int rno;
    String name;

    public
    Serialization(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}

class Child extends Serialization {
    int fees;
    String course;

    public
    Child(int rno, String name, int fees, String course) {
        super(rno, name);
        this.fees = fees;
        this.course = course;
    }
}

public
class SerializeISA {
    public static
    void main(String args[]) {
        try {
            Child child = new Child(2, "Megha", 500, "IT");
            FileOutputStream fout = new FileOutputStream("/Users/meghaprakashjagadale/Documents/Hello.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(child);

            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {

            FileInputStream file = new FileInputStream("/Users/meghaprakashjagadale/Documents/Hello.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            Child c = (Child) in.readObject();

            System.out.println(c.rno + " " + c.name + " " + c.course + " " + c.fees);

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
