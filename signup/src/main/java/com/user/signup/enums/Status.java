package com.user.signup.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    RECEIVED("Received"),
    APPROVED("Approved"),
    REJECTED("Rejected");

    private final String value;
}
