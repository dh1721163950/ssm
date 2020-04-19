package com.dh.gmall.service;

import com.dh.gmall.bean.UmsMemberReceiveAddress;
import com.dh.gmall.bean.UmsMember;
import com.dh.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByUser(String memberId);
}
