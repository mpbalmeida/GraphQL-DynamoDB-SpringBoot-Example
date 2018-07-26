package br.com.faroltech.graphqldynamodbspringexample.repositories;

import br.com.faroltech.graphqldynamodbspringexample.domain.Author;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;


@EnableScan
public interface AuthorRepository extends CrudRepository<Author, String> {
}
