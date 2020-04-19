package com.dh.sc.user.service.impl;

import com.dh.gmall.service.UserService;
import com.dh.gmall.bean.UmsMember;
import com.dh.gmall.bean.UmsMemberReceiveAddress;
import com.dh.sc.user.mapper.UmsMemberReceiveAddressMapper;
import com.dh.sc.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsNumberList = userMapper.selectAll(); //userMapper.selectAllUser();

        return umsNumberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByUser(String memberId) {
      /* Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
         umsMemberReceiveAddressMapper.selectByExample(e);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);
*/
        //封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }
}
