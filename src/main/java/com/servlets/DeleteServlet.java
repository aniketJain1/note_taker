package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String noteId = request.getParameter("note_id").trim();
			
			Session s = FactoryProvider.getFactory().openSession();
			Note note = s.get(Note.class, noteId);
			Transaction tx = s.beginTransaction();
			s.remove(note);
			tx.commit();
			s.close();
			response.sendRedirect("all_notes.jsp");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
