package com.sudo.sandwich.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by satishterala on 12/15/15.
 */
@Table(uniqueConstraints = {@UniqueConstraint(name = "uk_app_name", columnNames = "APP_NAME")})
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "APP_ID"))
})
@Entity
@Data
public class Application extends AbstractPersistable<Long> {

    @Column(name = "APP_NAME")
    @NotNull
    String applicationName;

    @ManyToMany
    @JoinTable(name = "APPLICATION_TO_USER", joinColumns = {@JoinColumn(name = "APP_ID")}, inverseJoinColumns = {@JoinColumn(name = "APP_USER_ID")})
    List<ApplicationUser> applicationUsers;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;


    /**
     * List of incidents assigned to this application
     **/
    @OneToMany(mappedBy = "application")
    List<Incident> incidents;


}
