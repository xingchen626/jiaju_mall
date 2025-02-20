package com.xingchen.furns.service.impl;

import com.xingchen.furns.entity.Member;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public interface MemberService {
    public boolean registerMember(Member member);

    public boolean isExistMember(String username);
}
