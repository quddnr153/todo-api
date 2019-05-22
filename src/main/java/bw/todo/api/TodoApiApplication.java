package bw.todo.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "bw.todo.api")
@SpringBootApplication
public class TodoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner initTodo(TodoRepository todos) {
		return (args) -> {
			todos.save(
				Todo.builder()
					.title("Learn Javascript")
					.description("For Front-end Development")
					.priority(1)
					.status(Status.DONE)
					.build()
			);

			todos.save(
				Todo.builder()
					.title("Learn HTML")
					.description("For Front-end Development")
					.priority(2)
					.status(Status.DONE)
					.build()
			);

			todos.save(
				Todo.builder()
					.title("Learn CSS")
					.description("For Front-end Development")
					.priority(3)
					.status(Status.DONE)
					.build()
			);

			todos.save(
				Todo.builder()
					.title("Learn ES6")
					.description("For Front-end Development")
					.priority(1)
					.status(Status.DONE)
					.build()
			);

			todos.save(
				Todo.builder()
					.title("Learn React")
					.description("For Front-end Development")
					.priority(1)
					.status(Status.DOING)
					.build()
			);

			todos.save(
				Todo.builder()
					.title("Learn Redux and mobX")
					.description("For comparing two skill's pros and cons")
					.priority(1)
					.status(Status.TODO)
					.build()
			);

			todos.save(
				Todo.builder()
					.title("Learn Javascript Class and React Hooks")
					.description("For comparing two skill's pros and cons")
					.priority(1)
					.status(Status.TODO)
					.build()
			);
		};
	}
}
