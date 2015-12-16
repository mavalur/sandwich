package com.sudo.sandwich.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;

/**
 * Created by satishterala on 12/15/15.
 */
@Embeddable
public class PhoneNumber {

    @Size(min = 10, max = 10)
    @NotNull
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phoneNumber;

}
