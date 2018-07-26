package br.com.faroltech.graphqldynamodbspringexample.resolver;

import br.com.faroltech.graphqldynamodbspringexample.domain.Author;
import br.com.faroltech.graphqldynamodbspringexample.domain.Book;
import br.com.faroltech.graphqldynamodbspringexample.repositories.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLResolver<Book> /* This class is a resolver for the Book "Data Class" */ {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author author(Book book) {
        return authorRepository.findById(book.getAuthorId()).get();
    }
}
