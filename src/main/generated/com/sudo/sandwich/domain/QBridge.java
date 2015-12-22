package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBridge is a Querydsl query type for Bridge
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBridge extends EntityPathBase<Bridge> {

    private static final long serialVersionUID = -849457580L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBridge bridge = new QBridge("bridge");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final DateTimePath<java.time.LocalDateTime> bridgeEndTime = createDateTime("bridgeEndTime", java.time.LocalDateTime.class);

    public final CollectionPath<Person, QPerson> bridgeMembers = this.<Person, QPerson>createCollection("bridgeMembers", Person.class, QPerson.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> bridgeStartTime = createDateTime("bridgeStartTime", java.time.LocalDateTime.class);

    public final EnumPath<BridgeState> bridgeState = createEnum("bridgeState", BridgeState.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIncident incident;

    public QBridge(String variable) {
        this(Bridge.class, forVariable(variable), INITS);
    }

    public QBridge(Path<? extends Bridge> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBridge(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBridge(PathMetadata<?> metadata, PathInits inits) {
        this(Bridge.class, metadata, inits);
    }

    public QBridge(Class<? extends Bridge> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.incident = inits.isInitialized("incident") ? new QIncident(forProperty("incident"), inits.get("incident")) : null;
    }

}

