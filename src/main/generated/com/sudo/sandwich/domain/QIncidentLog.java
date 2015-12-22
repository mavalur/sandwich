package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QIncidentLog is a Querydsl query type for IncidentLog
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QIncidentLog extends BeanPath<IncidentLog> {

    private static final long serialVersionUID = -1120847577L;

    public static final QIncidentLog incidentLog = new QIncidentLog("incidentLog");

    public final BooleanPath isHashTagged = createBoolean("isHashTagged");

    public final DateTimePath<java.time.LocalDateTime> loggedAt = createDateTime("loggedAt", java.time.LocalDateTime.class);

    public final StringPath logStatement = createString("logStatement");

    public final StringPath user = createString("user");

    public QIncidentLog(String variable) {
        super(IncidentLog.class, forVariable(variable));
    }

    public QIncidentLog(Path<? extends IncidentLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIncidentLog(PathMetadata<?> metadata) {
        super(IncidentLog.class, metadata);
    }

}

