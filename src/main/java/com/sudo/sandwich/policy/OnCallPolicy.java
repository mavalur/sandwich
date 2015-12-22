package com.sudo.sandwich.policy;

import java.util.List;

import com.sudo.sandwich.json.domain.GroupMember;

public interface OnCallPolicy {
	List<String> getOnCallUsers(List<GroupMember> groupMembers);
}
