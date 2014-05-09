package com.pretech;

import java.io.*;

public class Student implements Serializable {

	private long id;

	private String name;

	private String standard;

	public String getStandard() {

		return standard;

	}

	public void setStandard(String standard) {

		this.standard = standard;

	}

	public long getId() {

		return id;

	}

	public String getName() {

		return name;

	}

	public void setId(long string) {

		id = string;

	}

	public void setName(String string) {

		name = string;

	}

	public String toString() {

		return name;

	}

}