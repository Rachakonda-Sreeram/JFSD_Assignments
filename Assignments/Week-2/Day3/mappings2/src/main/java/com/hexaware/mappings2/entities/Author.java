package com.hexaware.mappings2.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(name = "author_name")
	    private String authorName;
	    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	    private List<Book> books = new ArrayList<>();
		public Author() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Author(Long id, String authorName, List<Book> books) {
			super();
			this.id = id;
			this.authorName = authorName;
			this.books = books;
		}
		@Override
		public String toString() {
			return "Author [id=" + id + ", authorName=" + authorName + ", books=" + books + "]";
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
		}
		 public void addBook(Book book) {
		        books.add(book);
		        book.setAuthor(this);
		    }

		    public void removeBook(Book book) {
		        books.remove(book);
		        book.setAuthor(null);
		    }
}
