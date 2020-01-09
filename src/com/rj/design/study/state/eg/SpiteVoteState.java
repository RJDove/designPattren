package com.rj.design.study.state.eg;

/**
 * 恶意投票状态
 * @author renjin
 * @date 2020/1/8
 */
public class SpiteVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票，取消用户的投票资格，并取消投票记录
        String s = voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(user);
        }
    }
}
