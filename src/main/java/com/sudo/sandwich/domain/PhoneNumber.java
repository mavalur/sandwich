package com.sudo.sandwich.domain;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by satishterala on 12/15/15.
 */
@Embeddable
public class PhoneNumber {

    @Size(min = 10, max = 10)
    @NotNull
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private PhoneNumberType phoneNumberType;

}
