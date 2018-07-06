package com.journal;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Bean;

import com.journal.domain.Journal;
import com.journal.repository.JournalRepository;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = {"com.journal.repository"})
public class JournalApplication {
  
  @Bean
  InitializingBean saveData(JournalRepository repo) {
    return () -> {
      repo.save(new Journal("Get to know Spring Boot",
        "Today I will learn Spring Boot", "07/03/2018"));
    };
  }

  public static void main(String[] args) {
    SpringApplication.run(JournalApplication.class, args);
  }
}
