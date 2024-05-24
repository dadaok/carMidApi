package lotte.carmidapi.model.request;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Brakes {
    private int abs;
    private int auxBrakes;
    private int brakeBoost;
    private int scs;
    private int traction;
    private List<Integer> wheelBrakes = new ArrayList<>();
}
