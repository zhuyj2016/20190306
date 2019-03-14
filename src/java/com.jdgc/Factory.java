package com.jdgc;

public class Factory {

    public ICourse create(String type){
        ICourse course =null;

        if("java".equals(type)){
            course = new JavaCourse();
        }else if("python".equals(type)){
            course=new PythonCourse();
        }

        return course;
    }

    public ICourse create(Class<?> clazz){
        ICourse course =null;

        try{
            course= (ICourse) clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return course;
    }

    public ICourse create1(String clazzName){
        ICourse course =null;

        try{
            course= (ICourse) Class.forName(clazzName).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return course;
    }
}
