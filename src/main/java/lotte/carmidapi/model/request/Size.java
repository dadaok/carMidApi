package lotte.carmidapi.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class Size {
    @Schema(example = "31")
    private int length;
    @Schema(example = "32")
    private int width;
}
