package cn.sxt.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String name;

	// ����ע��
	public void setName(String name) {
		this.name = name;
	}

	// beanע��
	private Address addr;

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	// ����ע��
	private String[] books;

	public void setBooks(String[] books) {
		this.books = books;
	}

	// Listע��
	private List<String> hobbies;

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	// Mapע��
	private Map<String, String> cards;

	public void setCard(Map<String, String> cards) {
		this.cards = cards;
	}

	// setע��
	private Set<String> games;

	public void setGames(Set<String> games) {
		this.games = games;
	}

	// Nullע��
	private String wife;

	public void setWife(String wife) {
		this.wife = wife;
	}

	// Propertiesע��
	private Properties info;

	public void setInfo(Properties info) {
		this.info = info;
	}

	//P�����ռ�ע�� 
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
