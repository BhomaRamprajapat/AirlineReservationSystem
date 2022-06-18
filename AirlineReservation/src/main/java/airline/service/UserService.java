package airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import airline.dao.UserDao;
import airline.model.User;

@Service
public class UserService 
{
 @Autowired
 private UserDao userDao;
 
 public void saveUser(User user)
 {
  userDao.saveUser(user);
 }
}




















