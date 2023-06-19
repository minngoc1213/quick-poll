package com.example.quickpoll.repository;

import com.example.quickpoll.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
