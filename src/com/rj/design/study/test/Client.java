package com.rj.design.study.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author renjin
 * @date 2019/11/25
 */
public class Client {

    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
        /*System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        CustomerService service = new Proxy(new CustomerServiceImpl()).getProxy();
        System.out.println(service.getCustomerByName());*/
        Date data = new Date(1578287765019L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(data));
    }


}
