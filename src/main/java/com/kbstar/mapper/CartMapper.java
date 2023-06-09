package com.kbstar.mapper;

import com.kbstar.dto.Cart;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CartMapper extends KBMapper<Integer, Cart> {
    public List<Cart> getmycart(String cid);

    //전체조회가 아니라, 회원 아이디로 조회하는 기능 추가. 어떤 회원이 어떤 상품을 담았는지!!
    //기존에 없던 기능 추가. 이게 스페셜라이즈...?머..?
}
