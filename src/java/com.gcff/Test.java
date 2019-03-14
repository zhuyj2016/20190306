package com.gcff;

import com.jdgc.ICourse;

public class Test {

    public static void main(String[] args) {
        IFactory factory = new JavaFactory();
        ICourse course = factory.create();
        course.info();
    }
}
