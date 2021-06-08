package net.openu.demo;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by iopenu@gmail.com on 2021/06/08
 * Github : https://github.com/bnbaek
 */

public interface UserRepositoryCustom {

  UserAddress findByUserSeq(Long seq);
  UserAddress findByUsername(String username);

}
