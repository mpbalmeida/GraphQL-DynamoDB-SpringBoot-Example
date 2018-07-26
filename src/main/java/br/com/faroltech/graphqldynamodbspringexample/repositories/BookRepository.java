package br.com.faroltech.graphqldynamodbspringexample.repositories;

import br.com.faroltech.graphqldynamodbspringexample.domain.Book;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface BookRepository extends CrudRepository<Book, String> {
}
