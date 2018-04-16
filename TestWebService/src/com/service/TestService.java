package com.service;

public class TestService {

	public int checkUserRight(String userId, String password) {

		// 假设进行数据库操作

		if (password != null && "fred".equals(userId)) {

			return 1;

		}

		return 0;

	}

}
