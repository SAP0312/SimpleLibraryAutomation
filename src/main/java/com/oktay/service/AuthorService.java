package com.oktay.service;

import java.util.List;

import com.oktay.models.Author;

/**
 * @author oktay
 *
 */
public interface AuthorService {
	
	public void addAuthor(Author author);
	
	public void deleteAuthor(Integer authorId);

	public List<Author> getAllAuthors();
}
