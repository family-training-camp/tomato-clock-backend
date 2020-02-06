package com.tomatoclock.authserver.user.service.impl;

import com.tomatoclock.authserver.user.entity.User;
import com.tomatoclock.authserver.user.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
  @Resource UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    List<SimpleGrantedAuthority> authorities = new ArrayList<>();
    User user = userRepository.findByUsername(username);
    authorities.add(new SimpleGrantedAuthority("USER"));
    return new org.springframework.security.core.userdetails.User(
        user.getUsername(), user.getPassword(), authorities);
  }
}
