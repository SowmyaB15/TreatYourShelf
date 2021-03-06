package org.liftoff.BookApp.data;

import org.liftoff.BookApp.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface BookRepository extends CrudRepository<Book, Integer> {

}