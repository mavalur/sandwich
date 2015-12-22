package com.sudo.sandwich.json.domain;

import com.google.common.base.Enums;
import com.sudo.sandwich.HashTag;
import com.twitter.Extractor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by satishterala on 12/21/15.
 */
@Document(collection = "chats")
@Getter
@Setter
public class ChatStatement {
    @Id
    private String id;
    String user;
    String statement;
    LocalDateTime timestamp;
    private boolean isTagged = false;
    List<String> tags = new ArrayList<>();

    @Version
    Long version;

    @Transient
    Extractor extractor;

    @Indexed
    String incidentID;

    public <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void setStatement(String statement) {
        List<String> hashtags = extractor.extractHashtags(statement);
        List<String> tags = hashtags.stream().filter(s -> isInEnum(s, HashTag.class)).collect(Collectors.toList());
        if (tags != null && tags.size() > 0) {
            isTagged = Boolean.TRUE;
            this.tags = tags;
        }

    }

}
