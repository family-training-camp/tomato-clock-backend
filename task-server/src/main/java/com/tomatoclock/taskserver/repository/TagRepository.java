package com.tomatoclock.taskserver.repository;

import com.tomatoclock.taskserver.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
  List<Tag> findAllByUserId(String userId);
}
