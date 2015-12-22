package com.sudo.sandwich.services.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import policy.OnCallPolicy;

import com.sudo.sandwich.json.domain.GroupMember;
import com.sudo.sandwich.repository.GroupMemberRepository;
import com.sudo.sandwich.services.OnCallService;

@Service
public class OnCallServiceImpl implements OnCallService {

    @Inject
    GroupMemberRepository gmRepository;

    @Resource(name = "WholeGroup")
    OnCallPolicy wholeGroupPolicy;
    
    @Resource(name = "FirstInSequence")
    OnCallPolicy firstInSequencePolicy;
    
	@Override
	public List<String> getOnCallUser(String groupId) {
		List<GroupMember> users = gmRepository.findByGroup(groupId);
		
		return firstInSequencePolicy.getOnCallUsers(users);
	}

}
