package com.github.tehsteel.multipledatabases.database.impl;

import com.github.tehsteel.multipledatabases.database.IDatabase;
import com.github.tehsteel.multipledatabases.student.Student;

public final class MongoDatabase implements IDatabase {
	@Override
	public void connect() {
		// Connect Logic
	}

	@Override
	public Student getDataFromName(final String name) {
		// Get age from database by name

		final Student student = new Student(name);

		// student.setAge();

		return student;
	}

	@Override
	public void disconnect() {
		// Disconnect Logic
	}
}
