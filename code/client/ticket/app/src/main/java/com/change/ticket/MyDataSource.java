package com.change.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/20.
 */
public class MyDataSource {

    public MyDataSource(){

    }

    public static List<String> getNavigationDateaSource()
    {
        List<String> list = new ArrayList<String>();
        list.add("账号管理");
        list.add("路线规划");
        list.add("提醒");
        list.add("设置");
        list.add("关于");
        return list;
    }
}
