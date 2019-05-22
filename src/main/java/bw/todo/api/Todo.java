package bw.todo.api;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Byungwook lee on 2019-05-22
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Getter
@Builder(toBuilder = true)
@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Todo {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String description;
	private Integer priority;
	@Enumerated(EnumType.STRING)
	private Status status;

	public Todo(TodoDto todoDto) {
		this.id = todoDto.getId();
		this.title = todoDto.getTitle();
		this.description = todoDto.getDescription();
		this.priority = todoDto.getPriority();
		this.status = todoDto.getStatus();
	}
}
