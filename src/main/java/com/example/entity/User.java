package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
public class User {
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	@GraphQLQuery(name = "id", description = "A user's id")
    private long id;
	
    @Column(name = "first_name", nullable = false)
    @GraphQLQuery(name = "firstName", description = "A user's firstName")
    private String firstName;
    
    @Column(name = "middle_name", nullable = false)
    @GraphQLQuery(name = "middleName", description = "A user's middleName")
    private String middleName;
    
    @Column(name = "last_name", nullable = false)
    @GraphQLQuery(name = "lastName", description = "A user's lastName")
    private String lastName;
    
    @Column(name = "age")
    @GraphQLQuery(name = "age", description = "A user's age")
    private byte age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
    
	@Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", firstname='" + firstName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", lastname='" + lastName + '\'' +
            ", age='" + age + '\'' +
            '}';
    }
    
    
}
