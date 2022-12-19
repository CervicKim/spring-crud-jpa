package com.dw.springcrudjpa.model;

import javax.persistence.Entity;

import org.springframework.boot.context.properties.bind.Name;

@Entity
@Table(name = "dw_member")
public class member {

    @studentName @stydentAge @studentPhone @studentAddress

    public Object get @StudentName()
    {
		return this.@studentName;
	}

    public void set @StudentName(Object @studentName)
    {
		this.@studentName = @studentName;
	}

    public Object get @StydentAge()
    {
		return this.@stydentAge;
	}

    public void set @StydentAge(Object @stydentAge)
    {
		this.@stydentAge = @stydentAge;
	}

    public Object get @StudentPhone()
    {
		return this.@studentPhone;
	}

    public void set @StudentPhone(Object @studentPhone)
    {
		this.@studentPhone = @studentPhone;
	}

    public Object get @StudentAddress()
    {
		return this.@studentAddress;
	}

    public void set @StudentAddress(Object @studentAddress)
    {
		this.@studentAddress = @studentAddress;
	}

}
