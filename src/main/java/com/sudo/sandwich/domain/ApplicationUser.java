package com.sudo.sandwich.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by satishterala on 12/15/15.
 */
@Entity
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "APP_USER_ID"))
})
@EqualsAndHashCode(callSuper=false)
@Data
public class ApplicationUser extends AbstractPersistable<Long> implements Ordered{

    @Email
    @NotNull
    private String emailAddress;

    @NotNull
    private String userId;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;

    @NotNull
    @Column(name = "CALL_ORDER")
    private Integer callOrder;


    @ManyToMany(mappedBy = "applicationUsers")
    private Collection<ApplicationTeam> applicationTeams =  new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "PHONE_NUMBER",joinColumns = {@JoinColumn(name = "APP_USER_ID")})
    private Collection<PhoneNumber> phoneNumbers =  new ArrayList<>();


    @Override
    public int getOrder() {
        return callOrder;
    }
}
