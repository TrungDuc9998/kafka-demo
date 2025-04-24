//package com.example.oca.kafka;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LogProducer {
//    private static final Logger LOGGER = LoggerFactory.getLogger(LogProducer.class);
//    private final KafkaTemplate<String, String> kafkaTemplate;
//    private static final String TOPIC = "TestTopic";
//
//    public LogProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendLog(String logMessage) {
//        kafkaTemplate.send(TOPIC, logMessage);
//        LOGGER.info("Log đã gửi lên Kafka: {}", logMessage);
//    }
//}
