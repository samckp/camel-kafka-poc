package com.kafka.poc.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProducerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("{{}}")
                .routeId("producerRoute")
                .log(LoggingLevel.INFO, "${body}")
                .to("{{}}")
                ;
    }
}
