package com.github.tehsteel.multipledatabases;

import com.github.tehsteel.multipledatabases.database.DataType;
import com.github.tehsteel.multipledatabases.database.DatabaseManager;
import com.github.tehsteel.multipledatabases.student.Student;

public final class Main {

	private static final DatabaseManager databaseManager = new DatabaseManager(DataType.MYSQL);

	public static void main(final String[] args) {
		databaseManager.getDatabase().connect();

		final Student student = databaseManager.getDatabase().getDataFromName("steel");


		System.out.println(student.getName());
		System.out.println(student.getAge());

		databaseManager.getDatabase().disconnect();

	}
}