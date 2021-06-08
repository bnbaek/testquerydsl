package net.openu.demo;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import static net.openu.demo.QAddress.*;
import static net.openu.demo.QUser.*;

/**
 * Created by iopenu@gmail.com on 2021/06/08
 * Github : https://github.com/bnbaek
 */

@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserRepositoryImpl implements UserRepositoryCustom {
  private final JPAQueryFactory queryFactory;


  @Override
  public UserAddress findByUserSeq(Long seq) {
    return queryFactory
        .select(Projections.fields(UserAddress.class,
            address.as("address"),
            user.as("user")
        )).from(user)
        .innerJoin(address)
        .on(user.id.eq(address.id))
//        .innerJoin(user.address,QAddress.address)
        .where(user.id.eq(seq))
        .fetchOne();
  }

  @Override
  public UserAddress findByUsername(String username) {
    return queryFactory
        .select(Projections.fields(UserAddress.class,
            address.as("address"),
            user.as("user")
        )).from(user)
        .innerJoin(address)
        .on(user.id.eq(address.id))
//        .innerJoin(user.address,QAddress.address)
        .where(user.username.eq(username))
        .fetchOne();
  }
}
