package dev.ranieri.app;

import dev.ranieri.controllers.BookController;
import dev.ranieri.daos.BookDAOLocal;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import io.javalin.Javalin;

public class App {
	
	public static void main(String[] args) {
		Javalin app = Javalin.create(config ->{			
			config.enableCorsForAllOrigins();
		}).start(7000);
		
		//Inject dependencies for a dev application no persistence
		BookService bookService = new BookServiceImpl(new BookDAOLocal());
		BookController bookController = new BookController(bookService);
		
		app.get("/books", bookController.getBooks);
		app.get("/books/:id", bookController.getBookById);
		
		app.post("/books", bookController.addBook);
		
		app.put("/books/:id", bookController.updateBook);
		
		app.delete("/books/:id", bookController.deleteBook);
		
		
	}

}
