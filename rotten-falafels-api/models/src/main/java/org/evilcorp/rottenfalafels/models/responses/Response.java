package org.evilcorp.rottenfalafels.models.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Response {
    private int statusCode;
    private String description;
}
