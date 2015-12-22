package com.sudo.sandwich.policy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sudo.sandwich.json.domain.GroupMember;

@Component("WholeGroup")
public class WholeGroupPolicy implements OnCallPolicy {

	@Override
	public List<String> getOnCallUsers(List<GroupMember> groupMembers) {
		List<String> ret = new ArrayList<>();
		if (groupMembers.isEmpty()) {
			return null;
		} else {
			for (GroupMember gm : groupMembers) {
				ret.add(gm.getUser());
			}
		}
		return ret;
	}

}
