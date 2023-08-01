package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MemberDetails;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@PostMapping(path = "/addMember")
	public void addMember(@RequestBody MemberDetails memberDetails)
	{
		System.out.println("Trying to add a new member");
		memberService.addNewMember(memberDetails);
		System.out.println("Added a new member");
	}
	@GetMapping("/allMembers")
	public List<Member> getAllMembers()
	{
		return memberService.getAllMembers();
	}
}
