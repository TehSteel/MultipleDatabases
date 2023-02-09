package com.github.tehsteel.multipledatabases.database.impl;

import com.github.tehsteel.multipledatabases.database.IDatabase;
import com.github.tehsteel.multipledatabases.student.Student;

public final class MySQLDatabase implements IDatabase {
	@Override
	public void connect() {
		// Connect Logic
	}

	@Override
	public Student getDataFromName(final String name) {
		// SELECT * FROM database WHERE name = ?

		final Student student = new Student(name);

		// student.setAge(age);
		
		return student;
	}

	@Override
	public void disconnect() {
		// Disconnect Logic

	}
}
