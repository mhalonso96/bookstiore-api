package com.example.bookstore.domain;

import java.util.Objects;

public class Livro {
	private Integer id;
	private String title;
	private String authorName;
	private String textBook;
	private Categoria categoria;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer id, String title, String authorName, String textBook, Categoria categoria) {
		super();
		this.id = id;
		this.title = title;
		this.authorName = authorName;
		this.textBook = textBook;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTextBook() {
		return textBook;
	}

	public void setTextBook(String textBook) {
		this.textBook = textBook;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
