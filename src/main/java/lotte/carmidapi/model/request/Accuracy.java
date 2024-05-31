package lotte.carmidapi.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class Accuracy {
    @Schema(example = "19")
    private int orientation;
    @Schema(example = "20")
    private int semiMajor;
    @Schema(example = "21")
    private int semiMinor;
}
