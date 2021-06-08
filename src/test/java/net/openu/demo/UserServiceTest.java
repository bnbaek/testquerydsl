package net.openu.demo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Created by iopenu@gmail.com on 2021/06/08
 * Github : https://github.com/bnbaek
 */
@ExtendWith(SpringExtension.class)  // (1)
@SpringBootTest

public class UserServiceTest {

  @Autowired
  UserService userService;

  @BeforeEach
  void init(){
    User save = userService.save("bbn1", "ci", "st");

    System.out.println("save.getUsername() = " + save.getUsername());

  }
  @Test
  void di(){
    UserAddress bbn1 = userService.findId(1L);
    System.out.println("bbn1 = " + bbn1);
  }



}