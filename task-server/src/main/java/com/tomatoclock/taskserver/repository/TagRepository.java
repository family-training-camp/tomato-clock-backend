package com.tomatoclock.taskserver.repository;

import com.tomatoclock.taskserver.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
  @Query(nativeQuery = true, value = "select * from tag where tag.user_id = ?1 and is_delete = 0")
  List<Tag> findAllByUserId(Long userId);

  @Query(
      nativeQuery = true,
      value = "select * from tag where tag.tag_name = ?1 and tag.user_id = ?2 and is_delete = 0")
  Optional<Tag> findByTagNameAndUserId(String tagName, Long userId);

  Optional<Tag> findByIdAndUserId(Long tagId, Long userId);
}
