package com.hk.test.service;

import org.springframework.stereotype.Service;

import com.hk.test.dto.MemberDto;

@Service
public interface TestSerivce {

	public int testRegister(MemberDto member);
}
