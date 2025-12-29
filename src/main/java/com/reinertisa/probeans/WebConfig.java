package com.reinertisa.probeans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MessageServiceRegistrar.class)
public class WebConfig {


}
