package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QIncident is a Querydsl query type for Incident
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QIncident extends EntityPathBase<Incident> {

    private static final long serialVersionUID = -392468259L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIncident incident = new QIncident("incident");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final QApplication application;

    public final QBridge bridge;

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final CollectionPath<IncidentLog, QIncidentLog> incidentLogs = this.<IncidentLog, QIncidentLog>createCollection("incidentLogs", IncidentLog.class, QIncidentLog.class, PathInits.DIRECT2);

    public final EnumPath<IncidentStatus> incidentStatus = createEnum("incidentStatus", IncidentStatus.class);

    public final DateTimePath<java.time.LocalDateTime> updatedDate = createDateTime("updatedDate", java.time.LocalDateTime.class);

    public QIncident(String variable) {
        this(Incident.class, forVariable(variable), INITS);
    }

    public QIncident(Path<? extends Incident> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QIncident(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QIncident(PathMetadata<?> metadata, PathInits inits) {
        this(Incident.class, metadata, inits);
    }

    public QIncident(Class<? extends Incident> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.application = inits.isInitialized("application") ? new QApplication(forProperty("application"), inits.get("application")) : null;
        this.bridge = inits.isInitialized("bridge") ? new QBridge(forProperty("bridge"), inits.get("bridge")) : null;
    }

}

