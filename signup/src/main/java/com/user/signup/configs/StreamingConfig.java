package com.user.signup.configs;

import com.user.signup.streamings.UserReceivedSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = { UserReceivedSource.class })
public class StreamingConfig {
}
