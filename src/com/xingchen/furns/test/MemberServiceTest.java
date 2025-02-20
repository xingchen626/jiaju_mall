package com.xingchen.furns.test;

import com.xingchen.furns.entity.Member;
import com.xingchen.furns.service.impl.MemberService;
import com.xingchen.furns.service.impl.MemberServiceImpl;
import org.junit.Test;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public class MemberServiceTest {
    private MemberService memberService = new MemberServiceImpl();

    @Test
    public void isExistUsername() {
        if (memberService.isExistMember("admin")){
            System.out.println("用户名已存在");
        }else {
            System.out.println("用户名不存在");
        }
    }

    @Test
    public void registerMember() {
        Member member = new Member(null, "marry", "marry", "marry@qq.com");
        if (memberService.registerMember(member)){
            System.out.println("注册用户成功");
        }else {
            System.out.println("注册用户失败");
        }
    }

    @Test
    public void login() {
        Member member = new Member(null,"admin","admin", null);
        System.out.println(memberService.login(member));
    }
}
