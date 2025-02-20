package com.xingchen.furns.dao.impl;

import com.xingchen.furns.entity.Member;

/**
 * @Author: 倪亮
 * @Version: 1.0
 */
public interface MemberDao {
//    提供一个通过用户名返回对应的Member
    public Member queryMemberByUsername(String username);

//    提供一个保存Member对象到数据库/表member表
      public int saveMember(Member member);



}

