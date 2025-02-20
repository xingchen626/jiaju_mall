package com.xingchen.furns.service.impl;

import com.xingchen.furns.entity.Member;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public interface MemberService {
    public boolean registerMember(Member member);

    public boolean isExistMember(String username);



    /**
     *根据登录传入的member信息，返回DB中的member信息
     * @param member 是根据用户登录创建一个member信息
     * @return 返回的是DB中的member对象
     */
    public Member login(Member member);
}
