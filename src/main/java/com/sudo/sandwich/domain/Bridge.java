package com.sudo.sandwich.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by satishterala on 12/18/15.
 */
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "BRIDGE_ID"))
})

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Bridge extends AbstractPersistable<Long> {

    @OneToOne
    Incident incident;


    LocalDateTime bridgeStartTime;

    LocalDateTime bridgeEndTime;

    @Enumerated(EnumType.STRING)
    BridgeState bridgeState;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "BRIDGE_JOINEES",joinColumns = {@JoinColumn(name = "BRIDGE_ID")},inverseJoinColumns = {@JoinColumn(name = "PERSON_ID")})
    Collection<Person> bridgeMembers = new ArrayList<>();


    public void endBridge() {
        this.bridgeEndTime = LocalDateTime.now();
    }


}
