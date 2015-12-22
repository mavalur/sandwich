package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPhoneNumber is a Querydsl query type for PhoneNumber
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QPhoneNumber extends BeanPath<PhoneNumber> {

    private static final long serialVersionUID = 509285996L;

    public static final QPhoneNumber phoneNumber1 = new QPhoneNumber("phoneNumber1");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final EnumPath<PhoneNumberType> phoneNumberType = createEnum("phoneNumberType", PhoneNumberType.class);

    public QPhoneNumber(String variable) {
        super(PhoneNumber.class, forVariable(variable));
    }

    public QPhoneNumber(Path<? extends PhoneNumber> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhoneNumber(PathMetadata<?> metadata) {
        super(PhoneNumber.class, metadata);
    }

}

