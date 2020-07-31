package dev.ranieri.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="b_id")
	private int id;	
	
	@Column(name ="title")
	@NotNull
	private String title;
	
	@Column(name ="author")
	@NotNull
	private String author;
	
	@Column(name ="pages")
	@NotNull
	private int pages;
	
	@Column(name ="genre")
	private String genre;
	
	public Book() {
		super();
	}

	public Book(int id, String title, String author, int pages, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.genre = genre;
	}	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", pages=" + pages + ", genre=" + genre
				+ "]";
	}
	
	

}
