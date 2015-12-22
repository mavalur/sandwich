package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QApplication is a Querydsl query type for Application
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QApplication extends EntityPathBase<Application> {

    private static final long serialVersionUID = -1038458523L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QApplication application = new QApplication("application");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final StringPath applicationCode = createString("applicationCode");

    public final StringPath applicationName = createString("applicationName");

    public final QApplicationTeam applicationTeam;

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Incident, QIncident> incidents = this.<Incident, QIncident>createList("incidents", Incident.class, QIncident.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> updatedDate = createDateTime("updatedDate", java.time.LocalDateTime.class);

    public QApplication(String variable) {
        this(Application.class, forVariable(variable), INITS);
    }

    public QApplication(Path<? extends Application> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QApplication(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QApplication(PathMetadata<?> metadata, PathInits inits) {
        this(Application.class, metadata, inits);
    }

    public QApplication(Class<? extends Application> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.applicationTeam = inits.isInitialized("applicationTeam") ? new QApplicationTeam(forProperty("applicationTeam")) : null;
    }

}

