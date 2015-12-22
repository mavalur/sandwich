package com.sudo.sandwich.policy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sudo.sandwich.json.domain.GroupMember;

@Component("FirstInSequence")
public class FirstInSequencePolicy implements OnCallPolicy {

	@Override
	public List<String> getOnCallUsers(List<GroupMember> groupMembers) {
		List<String> ret = new ArrayList<>();
		if (!groupMembers.isEmpty()) {
			ret.add(groupMembers.get(0).getUser());
		}
		return ret;
	}
}
