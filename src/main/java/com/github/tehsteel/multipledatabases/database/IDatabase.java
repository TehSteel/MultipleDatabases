package com.github.tehsteel.multipledatabases.database;

import com.github.tehsteel.multipledatabases.student.Student;

public interface IDatabase {

	void connect();

	Student getDataFromName(String name);

	void disconnect();

}
