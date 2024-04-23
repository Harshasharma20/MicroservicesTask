package com.tast.service.ParserService.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JsonRequestModel {
    private String name;
    private String surname;
    private String greeting;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
