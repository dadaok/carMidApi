package com.lotte.carmidapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class BasicSafetyMessage {
    @JsonProperty("CoreData")
    private CoreData CoreData;
}
