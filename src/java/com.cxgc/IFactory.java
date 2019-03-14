package com.cxgc;

import com.jdgc.ICourse;

public interface IFactory {
    ICourse create();
    INote createNOte();
    IHosework createHosework();
}
