package com.tomatoclock.taskserver.config;

import com.tomatoclock.taskserver.dto.CurrentUser;

public class UserContext {
  private static ThreadLocal<CurrentUser> currentUser = new ThreadLocal<CurrentUser>();

  public static void setCurrentUser(CurrentUser currentUser) {
    UserContext.currentUser.set(currentUser);
  }

  public static CurrentUser getCurrentUser() {
    return currentUser.get();
  }
}
