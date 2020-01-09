package com.rj.design.study.state;

/**
 * @author renjin
 * @date 2020/1/7
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i=0; i<8; i++) {
            vm.vote("user", "V");
        }

    }
}
