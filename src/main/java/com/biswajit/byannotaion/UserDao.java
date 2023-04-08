package com.biswajit.byannotaion;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	public void init() throws Exception {
		System.out.println("init method....");

	}

	public void destroy() throws Exception {
		System.out.println("destroy method....");

	}

	public void getData() {
		System.out.println("getting data from db..");

	}
}
