package lotte.carmidapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CoreData {
    @JsonProperty("Long")
    @Schema(example = "1")
    private long Long;
    private AccelSet accelSet;
    private Accuracy accuracy;
    @Schema(example = "2")
    private int angle;
    private Brakes brakes;
    @Schema(example = "3")
    private int elev;
    @Schema(example = "4")
    private int heading;
    @Schema(example = "[11,12,13,14]")
    private List<Integer> id = new ArrayList<>();
    @Schema(example = "6")
    private long lat;
    @Schema(example = "7")
    private int msgCnt;
    @Schema(example = "2024012413131313")
    private long secMark;
    private Size size;
    @Schema(example = "9")
    private int speed;
    @Schema(example = "10")
    private int transmission;
}
