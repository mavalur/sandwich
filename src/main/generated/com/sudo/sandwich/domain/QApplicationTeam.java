package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QApplicationTeam is a Querydsl query type for ApplicationTeam
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QApplicationTeam extends EntityPathBase<ApplicationTeam> {

    private static final long serialVersionUID = -2118591134L;

    public static final QApplicationTeam applicationTeam = new QApplicationTeam("applicationTeam");

    public final QTeam _super = new QTeam(this);

    public final CollectionPath<Application, QApplication> applications = this.<Application, QApplication>createCollection("applications", Application.class, QApplication.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ListPath<Person, QPerson> persons = this.<Person, QPerson>createList("persons", Person.class, QPerson.class, PathInits.DIRECT2);

    //inherited
    public final StringPath teamCode = _super.teamCode;

    //inherited
    public final EnumPath<TeamType> teamType = _super.teamType;

    public QApplicationTeam(String variable) {
        super(ApplicationTeam.class, forVariable(variable));
    }

    public QApplicationTeam(Path<? extends ApplicationTeam> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApplicationTeam(PathMetadata<?> metadata) {
        super(ApplicationTeam.class, metadata);
    }

}

