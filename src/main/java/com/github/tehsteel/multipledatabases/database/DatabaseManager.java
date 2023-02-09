package com.github.tehsteel.multipledatabases.database;

import com.github.tehsteel.multipledatabases.database.impl.MongoDatabase;
import com.github.tehsteel.multipledatabases.database.impl.MySQLDatabase;

public final class DatabaseManager {

	private final IDatabase database;
	private final DataType dataType;

	public DatabaseManager(final DataType dataType) {
		this.dataType = dataType;

		if (dataType == DataType.MONGO) {
			database = new MongoDatabase();
		} else {
			database = new MySQLDatabase();
		}
		
	}

	public IDatabase getDatabase() {
		return database;
	}

	public DataType getDataType() {
		return dataType;
	}

}
