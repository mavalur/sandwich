package com.sudo.sandwich.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

/**
 * Created by satishterala on 12/15/15.
 */
@Entity
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "APP_USER_ID"))
})
public class ApplicationUser extends AbstractAuditable<ApplicationUser,Long>{

    String userId;

    @ManyToMany(mappedBy = "applicationUsers")
    Collection<Application> applications;


}
