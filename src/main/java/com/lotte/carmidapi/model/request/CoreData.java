package com.lotte.carmidapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CoreData {
    @JsonProperty("Long")
    private long Long;
    private AccelSet accelSet;
    private Accuracy accuracy;
    private int angle;
    private Brakes brakes;
    private int elev;
    private int heading;
    private List<Integer> id = new ArrayList<>();
    private long lat;
    private int msgCnt;
    private int secMark;
    private Size size;
    private int speed;
    private int transmission;
}
