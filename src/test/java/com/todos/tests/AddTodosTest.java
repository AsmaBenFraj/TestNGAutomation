package com.todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todos.page.TodosPage;
import com.todos.utils.Setup;

public class AddTodosTest extends Setup {

	public AddTodosTest() throws IOException {
		super();

	}

	TodosPage todospage;

	@Test
	public void iCanAddTodos() throws IOException {
		todospage = new TodosPage();
		todospage.submitTodos(prop.getProperty("todos1"));
	}
}
