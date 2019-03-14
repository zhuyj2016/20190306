package com.gcff;

import com.jdgc.ICourse;
import com.jdgc.JavaCourse;
import com.jdgc.PythonCourse;

public class PythonFactory implements IFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
