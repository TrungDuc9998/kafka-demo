package com.example.oca.transaction;

import com.example.oca.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.server.UID;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    private final KafkaProducer kafkaProducer;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Author check() {
        Optional<Author> author = this.authorRepository.findById(1L);
        author.ifPresent(value -> value.setName("check"));
//        this.sendLog();
        return author.get();
    }

    @Override
    public Author create() {
        Author author = Author.builder()
                .name(UUID.randomUUID().toString())
                .build();
        this.kafkaProducer.sendMessage(UUID.randomUUID().toString());
        log.info("--- create done");
        return this.authorRepository.save(author);
    }
}
