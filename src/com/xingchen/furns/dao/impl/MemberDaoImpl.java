package com.xingchen.furns.dao.impl;

import com.xingchen.furns.entity.Member;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class MemberDaoImpl extends BasicDAO<Member> implements MemberDao {
    /**
     * 通过用户名返回对应的Member
     * @param username 用户名
     * @return 对应的Member 如果没有该Member 返回null
     */
    @Override
    public Member queryMemberByUsername(String username) {
        String sql = "SELECT `id`,`username`,`password`,`email` FROM `member` \n" +
                " WHERE `username`=?";

        Member member = querySingle(sql, Member.class, username);

        return member;
    }

    /**
     *
     * @param member 传入Member对象
     * @return 返回-1 就是失败 返回其他的数字就是受影响的行数
     */
    @Override
    public int saveMember(Member member) {
        String sql = " INSERT INTO `member`(`username`,`password`,`email`) " +
                " VALUES(?,MD5(?), ?)";
        return update(sql, member.getUsername(), member.getPassword(), member.getEmail());
    }
}
