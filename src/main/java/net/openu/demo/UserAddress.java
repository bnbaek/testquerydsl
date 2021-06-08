package net.openu.demo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by iopenu@gmail.com on 2021/06/09
 * Github : https://github.com/bnbaek
 */

@Getter
@NoArgsConstructor
public class UserAddress {
  private User user;
  private Address address;

  @Override
  public String toString() {
    return "UserAddress{" +
        "user=" + user +
        ", address=" + address +
        '}';
  }
}
