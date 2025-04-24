package com.example.oca.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LogConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogConsumer.class);

    @KafkaListener(topics = "NewTopic"  )
    public void consumeLog(ConsumerRecord<String, String> record) {
        LOGGER.info("Nhận log từ Kafka: Key = {}, Value = {}", record.key(), record.value());
    }
}
