package com.rj.design.study.state.eg;

/**
 * 重复投票状态
 * @author renjin
 * @date 2020/1/8
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票暂不处理
        System.out.println("请不要重复投票");
    }
}
