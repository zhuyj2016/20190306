package com.cxgc;

import com.jdgc.ICourse;
import com.jdgc.JavaCourse;
import com.sun.source.tree.IfTree;

public class JavaFactory implements IFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }

    @Override
    public INote createNOte() {
        return new JavaNote();
    }

    @Override
    public IHosework createHosework() {
        return new JavaHosework();
    }
}
