package airline.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import airline.model.User;

@Repository
public class UserDao 
{
 @Autowired
 private HibernateTemplate hibernateTemplate;
 
 @Transactional
 public void saveUser(User user)
 {
  hibernateTemplate.save(user);
 }
}
