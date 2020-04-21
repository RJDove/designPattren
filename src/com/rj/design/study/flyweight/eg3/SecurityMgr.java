package com.rj.design.study.flyweight.eg3;

import com.rj.design.study.flyweight.eg.TestDB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 安全管理，实现成单例
 *
 * @author renjin
 * @date 2020/1/10
 */
public class SecurityMgr {

    private static SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr() {
    }

    public static SecurityMgr getInstance() {
        return securityMgr;
    }

    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    /**
     * 模拟登陆功能
     *
     * @param user
     */
    public void login(String user) {
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }


    /**
     * 从数据库中获取某人所拥有的权限
     *
     * @param user
     * @return
     */
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] ss = s.split("，");
            if (ss[0].equals(user)) {
                Flyweight flyweight;
                if (ss[3].equals("2")) {
                    //表示是组合
                    flyweight = new UnsharedConcreteFlyweight();
                    String[] tempSs = TestDB.mapDB.get(ss[1]);
                    for (String tempS : tempSs) {
                        Flyweight tempFm = FlyweightFactory.getInstance().getFlyweight(tempS);
                        flyweight.add(tempFm);
                    }
                } else {
                    flyweight = FlyweightFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
                }
                col.add(flyweight);
            }
        }
        return col;
    }


    /**
     * 判断某个用户是否拥有某种权限
     *
     * @param user
     * @param securityEntity
     * @param permit
     * @return
     */
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = map.get(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (Flyweight fm : col) {
            System.out.println("fm== " + fm);
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }
}
