package lotte.carmidapi.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Brakes {
    @Schema(example = "22")
    private int abs;
    @Schema(example = "23")
    private int auxBrakes;
    @Schema(example = "24")
    private int brakeBoost;
    @Schema(example = "25")
    private int scs;
    @Schema(example = "26")
    private int traction;
    @Schema(example = "[27,28,29,30]")
    private List<Integer> wheelBrakes = new ArrayList<>();
}
