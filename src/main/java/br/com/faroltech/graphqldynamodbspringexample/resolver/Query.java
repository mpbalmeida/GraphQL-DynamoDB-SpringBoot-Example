package br.com.faroltech.graphqldynamodbspringexample.resolver;

import br.com.faroltech.graphqldynamodbspringexample.domain.Book;
import br.com.faroltech.graphqldynamodbspringexample.repositories.BookRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> books() {
        return Lists.newArrayList(bookRepository.findAll());
    }
}
