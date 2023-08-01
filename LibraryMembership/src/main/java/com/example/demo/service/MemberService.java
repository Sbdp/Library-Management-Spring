package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.MemberDetails;
import com.example.demo.entity.Member;

@Service
public interface MemberService {
	
	public void addNewMember(MemberDetails memberDetails);

	public List<Member> getAllMembers();

}
