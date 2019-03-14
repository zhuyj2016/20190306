package com.cxgc;

import com.jdgc.ICourse;
import com.jdgc.JavaCourse;
import com.jdgc.PythonCourse;

public class PythonFactory implements IFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }

    @Override
    public INote createNOte() {
        return new PythonNote();
    }

    @Override
    public IHosework createHosework() {
        return new PythonHosework();
    }
}
