package com.tomatoclock.authserver.user.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Authority implements GrantedAuthority {
  @Id private Long id;
  @ManyToOne private User user;
  private String name;

  @Override
  public String getAuthority() {
    return this.name;
  }
}
