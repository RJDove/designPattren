package com.rj.design.study.flyweight.eg;

import com.rj.design.study.flyweight.eg.model.AuthorizationModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 安全管理，实现成单例
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

    private Map<String, Collection<AuthorizationModel>> map = new HashMap<>();


    public void login(String user) {
        //登录时就需要把该用户所拥有的权限，从数据库中取出来，放到缓存中去
        Collection<AuthorizationModel> col = queryByUser(user);
        map.put(user, col);
    }


    /**
     * 判断某个用户是否拥有某种权限
     * @param user
     * @param securityEntity
     * @param permit
     * @return
     */
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<AuthorizationModel> col = map.get(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (AuthorizationModel model : col) {
            System.out.println("model== " + model);
            if (model.getSecurityEntity().equals(securityEntity) &&
                    model.getPermit().equals(permit)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 从数据库中获取某人所拥有的权限
     * @param user
     * @return
     */
    private Collection<AuthorizationModel> queryByUser(String user) {
        Collection<AuthorizationModel> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] ss = s.split("，");
            if (ss[0].equals(user)) {
                AuthorizationModel model = new AuthorizationModel();
                model.setUser(ss[0]);
                model.setSecurityEntity(ss[1]);
                model.setPermit(ss[2]);
                col.add(model);
            }
        }
        return col;
    }

}
