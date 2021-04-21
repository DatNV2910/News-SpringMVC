
package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {
	 
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code; 
	
	@ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}



	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}



	/**
	 * @return the users
	 */
	public List<UserEntity> getUsers() {
		return users;
	}



	/**
	 * @param users the users to set
	 */
	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}



	

	
	
	
	
	
}
