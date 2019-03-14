package com.cxgc;

public class Test {

    public static void main(String[] args) {
        IFactory javaf = new JavaFactory();
        javaf.create().info();
        javaf.createHosework().info();

        javaf.createNOte().info();


        IFactory pythonf = new PythonFactory();
        pythonf.create().info();
        pythonf.createHosework().info();

        pythonf.createNOte().info();
    }
}
