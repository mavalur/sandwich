package com.sudo.sandwich.repository;

import com.sudo.sandwich.json.domain.Group;
import com.sudo.sandwich.json.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by satishterala on 12/21/15.
 */
@Repository
public interface GroupRepository extends PagingAndSortingRepository<Group,String> {
}
