# camel-kafka-poc

Camel, SpringBoot, REST Api with Apache Kafka POC.
Create Kafka Producer and Consumer.
Monitor Kafka application.
Expose API with Swagger.
Commands:
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test-topic

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning