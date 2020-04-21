package com.rj.design.study.flyweight.eg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 在内存中模拟数据库中的值
 *
 * @author renjin
 * @date 2020/1/10
 */
public class TestDB {

    public static Collection<String> colDB = new ArrayList<>();

    public static Map<String, String[]> mapDB = new HashMap<>();

    static {
        colDB.add("张三，人员列表，查看，1");
        colDB.add("李四，人员列表，查看，1");
        colDB.add("李四，操作薪资数据，，2");
        for (int i = 0; i < 3; i++) {
            colDB.add("张三" + i + "，人员列表，查看");
        }

        mapDB.put("操作薪资数据", new String[]{"薪资数据,查看", "薪资数据,修改"});
    }
}
