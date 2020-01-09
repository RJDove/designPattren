package com.rj.design.study.state.eg;

/**
 * 黑名单状态
 * @author renjin
 * @date 2020/1/8
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
