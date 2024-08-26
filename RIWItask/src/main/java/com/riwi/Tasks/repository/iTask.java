package com.riwi.Tasks.repository;

import com.riwi.Tasks.entity.taskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iTask extends JpaRepository<taskModel, Long> {
}
