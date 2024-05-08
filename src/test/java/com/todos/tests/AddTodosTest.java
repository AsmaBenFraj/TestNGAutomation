package com.todos.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.todos.page.TodosPage;
import com.todos.utils.Setup;

public class AddTodosTest extends Setup {

	public AddTodosTest() throws IOException {
		super();

	}

	TodosPage todosPage;

	@Test
	public void iCanAddTodos() throws IOException {
		todosPage = new TodosPage();
		
		boolean fieldTodos = todosPage.isElementDisplayed(TodosPage.inputText);
		
		Assert.assertTrue(fieldTodos);
		
		todosPage.submitTodos(prop.getProperty("todos1"));
		
		String textTodos = todosPage.checkElementContain(TodosPage.textTodos);
		Assert.assertTrue(textTodos.contains(prop.getProperty("todos1")));
		
		boolean checkbox = todosPage.isCheckBoxSelected(TodosPage.checkBoxTodos);
		assertFalse(checkbox);
	}
}
