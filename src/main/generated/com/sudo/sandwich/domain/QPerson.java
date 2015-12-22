package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPerson is a Querydsl query type for Person
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPerson extends EntityPathBase<Person> {

    private static final long serialVersionUID = -460372448L;

    public static final QPerson person = new QPerson("person");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final CollectionPath<ApplicationTeam, QApplicationTeam> applicationTeams = this.<ApplicationTeam, QApplicationTeam>createCollection("applicationTeams", ApplicationTeam.class, QApplicationTeam.class, PathInits.DIRECT2);

    public final NumberPath<Integer> callOrder = createNumber("callOrder", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final StringPath emailAddress = createString("emailAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final CollectionPath<PhoneNumber, QPhoneNumber> phoneNumbers = this.<PhoneNumber, QPhoneNumber>createCollection("phoneNumbers", PhoneNumber.class, QPhoneNumber.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> updatedDate = createDateTime("updatedDate", java.time.LocalDateTime.class);

    public final StringPath userId = createString("userId");

    public QPerson(String variable) {
        super(Person.class, forVariable(variable));
    }

    public QPerson(Path<? extends Person> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPerson(PathMetadata<?> metadata) {
        super(Person.class, metadata);
    }

}

