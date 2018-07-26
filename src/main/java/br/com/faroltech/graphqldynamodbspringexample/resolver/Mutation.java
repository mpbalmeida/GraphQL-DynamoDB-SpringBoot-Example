package br.com.faroltech.graphqldynamodbspringexample.resolver;

import br.com.faroltech.graphqldynamodbspringexample.domain.Author;
import br.com.faroltech.graphqldynamodbspringexample.repositories.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final AuthorRepository authorRepository;

    public Mutation(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(String name, String description) {

        Author author = new Author();
        author.setName(name);
        author.setDescription(description);

        return authorRepository.save(author);
    }
}
