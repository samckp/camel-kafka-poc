package com.kafka.poc.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        String topicName = "topic=test-topic";
        String kafkaServer = "kafka:localhost:9092";
        String zooKeeperHost = "zookeeperHost=localhost&zookeeperPort=2181";
        String serializerClass = "serializerClass=kafka.serializer.StringEncoder";

        String toKafka = new StringBuilder().append(kafkaServer).append("?").append(topicName).append("&").append(zooKeeperHost).append("&").append(serializerClass).toString();

        from("{{inRoute}}").split().tokenize("\n").to(toKafka);
    }
}
