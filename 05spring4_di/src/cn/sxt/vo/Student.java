package cn.sxt.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String name;

	// 常量注入
	public void setName(String name) {
		this.name = name;
	}

	// bean注入
	private Address addr;

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	// 数组注入
	private String[] books;

	public void setBooks(String[] books) {
		this.books = books;
	}

	// List注入
	private List<String> hobbies;

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	// Map注入
	private Map<String, String> cards;

	public void setCard(Map<String, String> cards) {
		this.cards = cards;
	}

	// set注入
	private Set<String> games;

	public void setGames(Set<String> games) {
		this.games = games;
	}

	// Null注入
	private String wife;

	public void setWife(String wife) {
		this.wife = wife;
	}

	// Properties注入
	private Properties info;

	public void setInfo(Properties info) {
		this.info = info;
	}

	//P命名空间注入 
	public void show() {
		System.out.println("name:" + name + "    addr:" + addr.getAddress()
				+ "\nbooks:");
		for (String book : books) {
			System.out.println("book:" + book);
		}
		System.out.println("hobbies:" + hobbies);
		System.out.println("cards:" + cards);
		System.out.println("games:" + games);
		System.out.println("wife:" + wife);
		System.out.println("info:" + info);
	}
}
