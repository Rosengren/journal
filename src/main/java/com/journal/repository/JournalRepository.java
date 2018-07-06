package com.journal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.journal.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> { }
