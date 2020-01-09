package com.rj.design.study.state;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票管理
 * @author renjin
 * @date 2020/1/7
 */
public class VoteManager {

    /**
     * 记录用户投票的结果 Map<用户名称，投票的选项></>
     */
    private Map<String, String> mapVote = new HashMap<>();

    /**
     * 记录用户投票次数，Map<用户名称，投票的次数></>
     */
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    /**
     * 投票
     * @param user 投票人
     * @param voteItem 投票的选项
     */
    public void vote(String user, String voteItem) {
        //1.先为该用户增加投票的次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }

        oldVoteCount = oldVoteCount + 1;
        mapVoteCount.put(user, oldVoteCount);

        //2.判断该用户投票的类型，到底是正常投票、重复投票、恶意投票、还是上黑名单，然后根据投票类型
        //来进行相应的操作
        if (oldVoteCount == 1) {
            //正常投票，记录到投票记录中
            mapVote.put(user, voteItem);
            System.out.println("恭喜你投票成功");
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            //重复投票暂不处理
            System.out.println("请不要重复投票");
        } else if (oldVoteCount >=5 && oldVoteCount <8) {
            //恶意投票，取消用户的投票资格，并取消投票记录
            String s = mapVote.get(user);
            if (s != null) {
                mapVote.remove(user);
            }
        } else if (oldVoteCount >= 8) {
            System.out.println("进入黑名单，将禁止登录和使用本系统");
        }
    }
}
