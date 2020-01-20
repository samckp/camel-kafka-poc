# camel-kafka-poc

Camel, SpringBoot, REST Api with Apache Kafka POC.
Create Kafka Producer and Consumer.
Monitor Kafka application.
Expose REST API with Swagger.
Commands:
Create Topic
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test-topic

Delete Topic
kafka-topics.bat -zookeeper localhost:2181 -delete --topic test-topic

Consume from Topic
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning

Produce on Topic
kafka-console-producer -broker-list localhost:9092 -topic test-topic

