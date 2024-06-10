package lotte.carmidapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lotte.carmidapi.common.AsIsPropertyNamingStrategy;
import lombok.Getter;

@Getter
@JsonNaming(AsIsPropertyNamingStrategy.class)
public class AccelSet {
    @JsonProperty("Long")
    @Schema(example = "15")
    private int Long;
    @Schema(example = "16")
    private int lat;
    @Schema(example = "17")
    private int vert;
    @Schema(example = "18")    private int yaw;
}
