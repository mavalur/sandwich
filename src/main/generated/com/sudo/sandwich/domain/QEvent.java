package com.sudo.sandwich.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QEvent is a Querydsl query type for Event
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEvent extends EntityPathBase<Event> {

    private static final long serialVersionUID = 1776599663L;

    public static final QEvent event = new QEvent("event");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final StringPath applicationCode = createString("applicationCode");

    public final StringPath eventDescription = createString("eventDescription");

    public final StringPath eventExceptionMessage = createString("eventExceptionMessage");

    public final EnumPath<EventSeverityLevel> eventSeverityLevel = createEnum("eventSeverityLevel", EventSeverityLevel.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final DateTimePath<java.time.LocalDateTime> timeOfOccurence = createDateTime("timeOfOccurence", java.time.LocalDateTime.class);

    public QEvent(String variable) {
        super(Event.class, forVariable(variable));
    }

    public QEvent(Path<? extends Event> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEvent(PathMetadata<?> metadata) {
        super(Event.class, metadata);
    }

}

