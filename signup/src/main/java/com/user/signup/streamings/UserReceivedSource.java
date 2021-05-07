package com.user.signup.streamings;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserReceivedSource {
    String OUTPUT = "user-received-output";

    @Output(OUTPUT)
    MessageChannel output();
}
