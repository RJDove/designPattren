package com.rj.design.study.state.eg;


/**
 * 正常投票状态
 * @author renjin
 * @date 2020/1/7
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
    }
}
