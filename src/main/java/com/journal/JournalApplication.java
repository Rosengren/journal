package com.journal;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Bean;

import com.journal.domain.JournalEntry;
import com.journal.repository.JournalRepository;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = {"com.journal.repository"})
public class JournalApplication {

  @Bean
  InitializingBean saveData(JournalRepository repo) {
    return () -> {
      repo.save(new JournalEntry("Get to know Spring Boot",
        "Today I will learn Spring Boot", "2018-07-03"));
      repo.save(new JournalEntry("Give money away",
        "Invest in Bitcoin", "2018-08-02"));
      repo.save(new JournalEntry("Read East of Eden",
        "I hear it's a great book", "2018-08-04"));
    };
  }

  public static void main(String[] args) {
    SpringApplication.run(JournalApplication.class, args);
  }
}
