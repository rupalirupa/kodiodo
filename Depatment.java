package com.Model;

import java.util.Set;

@Entity
public class Depatment {
	@Id
  private int did;
  private String dname;
  @OneToMany(casecade=cascadeType.All)
  private Set<Employee>s=new HashSet<>();
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Set<Employee> getS() {
	return s;
}
public void setS(Set<Employee> s) {
	this.s = s;
}
  
  
  
}
