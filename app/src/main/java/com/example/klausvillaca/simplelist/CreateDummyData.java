package com.example.klausvillaca.simplelist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by klausvillaca on 21/07/2014.
 */
public class CreateDummyData {

    private static List<MyBean> myBeanList;
    private static MyBean myBean;

    public static List<MyBean> getDummyData() {
        myBeanList = new ArrayList<MyBean>();
        myBeanList.add(firstElement());
        myBeanList.add(secondElement());
        myBeanList.add(thirdElement());
        myBeanList.add(fourthElement());
        return myBeanList;
    }

    private static MyBean firstElement() {
        myBean = new MyBean();
        myBean.setTitle("Title 1");
        myBean.setDate("02/01/2014");
        myBean.setSomeData("Blablabla 1");
        return myBean;
    }


    private static MyBean secondElement() {
        myBean = new MyBean();
        myBean.setTitle("Title 2");
        myBean.setDate("02/01/2014");
        myBean.setSomeData("Blablabla 2");
        return myBean;
    }

    private static MyBean thirdElement() {
        myBean = new MyBean();
        myBean.setTitle("Title 3");
        myBean.setDate("02/01/2014");
        myBean.setSomeData("Blablabla 2");
        return myBean;
    }

    private static MyBean fourthElement() {
        myBean = new MyBean();
        myBean.setTitle("Title 4");
        myBean.setDate("02/01/2014");
        myBean.setSomeData("Blablabla 4");
        return myBean;
    }
}
