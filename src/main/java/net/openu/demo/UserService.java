package net.openu.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by iopenu@gmail.com on 2021/06/08
 * Github : https://github.com/bnbaek
 */
@RequiredArgsConstructor

@Service
@Transactional(readOnly = true)
public class UserService {
  private final UserRepository userRepository;
  private final AddressRepository addressRepository;

  @Transactional
  public User save(String username,String city,String street){

    User user = new User(username);

    User saveUser = userRepository.save(user);
    Address address = new Address(saveUser.getId(),street,city);
    addressRepository.save(address);
    return saveUser;

  }

  public UserAddress findUsername(String username) {
    return userRepository.findByUsername(username);
  }

  public UserAddress findId(Long seq){
    return userRepository.findByUserSeq(seq);
  }
}
