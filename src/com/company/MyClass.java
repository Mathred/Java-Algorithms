package com.company;

public class MyClass {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private String string;
    private Integer integer;

    public MyClass(byte b, short s, int i, long l, float f, double d, String string, Integer integer) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.string = string;
        this.integer = integer;
    }

    public void printInfo(){
        System.out.printf("byte is %d, short is %d, int is %d, long is %d, float is %5.2f, double is %5.2f, String is %s, Integer is %d",b,s,i,l,f,d,string,integer);
    }

    public boolean compare(byte that){return b == that;}

    public boolean compare(short that){return s == that;}

    public boolean compare(int that){return i == that;}

    public boolean compare(long that){return l == that;}

    public boolean compare(float that){return f == that;}

    public boolean compare(double that){return d == that;}

    public boolean compare(String that){return string == that;}

    public boolean compare(Integer that){return integer == that;}

}
