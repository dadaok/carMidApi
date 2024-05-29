package lotte.carmidapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lotte.carmidapi.common.AsIsPropertyNamingStrategy;
import lombok.Getter;

@Getter
@JsonNaming(AsIsPropertyNamingStrategy.class)
public class AccelSet {
    @JsonProperty("long")
    private int Long;
    private int lat;
    private int vert;
    private int yaw;
}
