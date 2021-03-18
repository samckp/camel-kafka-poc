# camel-kafka-poc

Camel, SpringBoot, REST Api with Apache Kafka POC.<BR>
Create Kafka Producer and Consumer.<BR>
Monitor Kafka application.<BR>
Expose REST API with Swagger.<BR>
<BR>
Commands:<BR>
Create Topic<BR>
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test-topic<BR>

Delete Topic<BR>
kafka-topics.bat -zookeeper localhost:2181 -delete --topic test-topic<BR>

Consume from Topic<BR>
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning<BR>

Produce on Topic<BR>
kafka-console-producer --broker-list localhost:9092 --topic test-topic<BR>

Print Whole message from a topic.<BR>
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic -from-beginning<BR>