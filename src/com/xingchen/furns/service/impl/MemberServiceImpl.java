package com.xingchen.furns.service.impl;

import com.xingchen.furns.dao.impl.MemberDAO;
import com.xingchen.furns.dao.impl.MemberDAOImpl;
import com.xingchen.furns.entity.Member;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDao = new MemberDAOImpl();

    @Override
    public boolean registerMember(Member member) {
         return memberDao.saveMember(member) == 1 ? true : false;

    }

    /**
     *
     * @param username 用户名
     * @return 如果存在返回true 否则返回false
     */
    @Override
    public boolean isExistMember(String username) {
        return memberDao.queryMemberByUsername(username) == null ? false : true;

    }



    @Override
    public Member login(Member member) {

        return memberDao.queryMemberByUsernameAndPassword
                (member.getUsername(),member.getPassword());
    }


}
