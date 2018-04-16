package com.service;

public class TestService {

	public int checkUserRight(String userId, String password) {

		// 我是大帅哥

		if (password != null && "fred".equals(userId)) {

			return 1;

		}

		return 00000;

	}

}
