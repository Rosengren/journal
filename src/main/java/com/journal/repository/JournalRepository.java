package com.journal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.journal.domain.JournalEntry;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> { }
