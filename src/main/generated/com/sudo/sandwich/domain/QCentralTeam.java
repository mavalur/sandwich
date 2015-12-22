package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCentralTeam is a Querydsl query type for CentralTeam
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCentralTeam extends EntityPathBase<CentralTeam> {

    private static final long serialVersionUID = 1551318407L;

    public static final QCentralTeam centralTeam = new QCentralTeam("centralTeam");

    public final QTeam _super = new QTeam(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ListPath<Person, QPerson> persons = this.<Person, QPerson>createList("persons", Person.class, QPerson.class, PathInits.DIRECT2);

    //inherited
    public final StringPath teamCode = _super.teamCode;

    //inherited
    public final EnumPath<TeamType> teamType = _super.teamType;

    public QCentralTeam(String variable) {
        super(CentralTeam.class, forVariable(variable));
    }

    public QCentralTeam(Path<? extends CentralTeam> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCentralTeam(PathMetadata<?> metadata) {
        super(CentralTeam.class, metadata);
    }

}

