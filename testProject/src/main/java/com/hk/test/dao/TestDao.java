package com.hk.test.dao;

import org.springframework.stereotype.Repository;

import com.hk.test.dto.MemberDto;
import com.hk.test.service.TestSerivce;

@Repository
public class TestDao implements TestSerivce {

	@Override
	public int testRegister(MemberDto member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
