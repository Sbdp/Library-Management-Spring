package com.example.demo.convert;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.MemberDetails;
import com.example.demo.entity.BookInstance;
import com.example.demo.entity.Member;

public class MemberUtil {
	
	static int key=1;
	public static Member convertMemberDetailsToMember(MemberDetails memberDetails)
	{
		List<BookInstance> bookList= new ArrayList<BookInstance>();
		Member member = new Member(key++, memberDetails.getName(),
				memberDetails.getAddress(), memberDetails.getPhone(), bookList);
		return member;
	}

}
