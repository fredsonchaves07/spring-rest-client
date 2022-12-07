package com.fredsonchaves07.algafoodjavaclient.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class Problem {

    private OffsetDateTime timeStamp;
    private String status;
    private String userMessage;
}
