package com.xingchen.furns.test;

import com.xingchen.furns.dao.impl.MemberDao;
import com.xingchen.furns.dao.impl.MemberDaoImpl;
import com.xingchen.furns.entity.Member;
import org.junit.Test;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class MemberDaoTest {
    private MemberDao memberDao = new MemberDaoImpl();
    @Test
    public void queryMemberByUsername() {
        if(memberDao.queryMemberByUsername("admin") == null){
            System.out.println("该用户名不存在");
        }else {
            System.out.println("该用户名已存在");
        }
    }
    @Test
    public void saveMember() {
        Member member = new Member(null, "king", "king", "king@qq.com");
        if (memberDao.saveMember(member) ==1){
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }
}
