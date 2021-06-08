package net.openu.demo;

import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by iopenu@gmail.com on 2021/06/08
 * Github : https://github.com/bnbaek
 */

@Entity
@Table(name = "address")
public class Address {

  @Id
  @Column(name = "user_id")
  private Long id;

  private String street;
  private String city;



  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  protected Address(){

  }

  public Address(Long id, String street, String city) {
    this.id = id;
    this.street = street;
    this.city = city;
  }

  @Override
  public String toString() {
    return "Address{" +
        "id=" + id +
        ", street='" + street + '\'' +
        ", city='" + city + '\'' +
        '}';
  }

}
