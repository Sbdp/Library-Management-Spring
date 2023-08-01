package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.demo.convert.MemberUtil;
import com.example.demo.dto.MemberDetails;
import com.example.demo.entity.Member;
import com.example.demo.repository.LibraryRepository;


@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	LibraryRepository libraryRepository;
	@Override
	public void addNewMember(MemberDetails memberDetails) {
		Member member = MemberUtil.convertMemberDetailsToMember(memberDetails);
		libraryRepository.save(member);
		
	}
	@Override
	public List<Member> getAllMembers() {
		return libraryRepository.findAll();
	}

}
