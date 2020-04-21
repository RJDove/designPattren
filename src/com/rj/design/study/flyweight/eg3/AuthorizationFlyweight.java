package com.rj.design.study.flyweight.eg3;


/**
 * 封装授权数据中重复出现部分的享元对象
 * @author renjin
 * @date 2020/1/10
 */
public class AuthorizationFlyweight implements Flyweight {

    private String securityEntity;

    private String permit;

    public AuthorizationFlyweight(String state) {
        String[] ss = state.split(",");
        securityEntity = ss[0];
        permit = ss[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        if (this.securityEntity.equals(securityEntity) &&
                this.permit.equals(permit)) {
            return true;
        }
        return false;
    }

    @Override
    public void add(Flyweight f) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
