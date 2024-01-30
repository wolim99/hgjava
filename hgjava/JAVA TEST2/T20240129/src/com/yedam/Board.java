package com.yedam;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Board implements Serializable {
    private int no;
    private String title;
    private String section;
    private String name;
    private LocalDateTime day;

    public Board(int no, String title, String section, String name, LocalDateTime day) {
        this.no = no;
        this.title = title;
        this.section = section;
        this.name = name;
        this.day = LocalDateTime.now();
    }
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getDay() {
		return day;
	}
	public void setDay(LocalDateTime day) {
		this.day = day;
	}
	
	
}
