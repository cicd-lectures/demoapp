package com.cicdlectures.demoapp.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;

  private String name;

  private int age;

  protected User() {}

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format(
          "User[id=%d, name='%s', age=%d]",
          id, name, age);
  }

  @Override
	public boolean equals(Object o) {
    if (o == this)
      return true;

    if (!(o instanceof User))
      return false;

    User other = (User) o;

    boolean idEquals = this.id == other.id;
    boolean ageEquals = this.age == other.age;
    boolean nameEquals = (this.name == null && other.name == null)
	    || (this.name != null && this.name.equals(other.name));

    return idEquals && nameEquals && ageEquals;
  }

  @Override
  public int hashCode() {
    // This is a naive implementation, don't mind though.
    return (int) id * age * name.hashCode();
  }


}
