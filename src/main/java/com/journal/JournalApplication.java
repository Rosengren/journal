package com.journal;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.journal.domain.JournalEntry;
import com.journal.repository.JournalRepository;

@SpringBootApplication
public class JournalApplication {

  @Bean
  InitializingBean saveData(JournalRepository repo) {
    return () -> {};
  }

  public static void main(String[] args) {
    SpringApplication.run(JournalApplication.class, args);
  }
}
