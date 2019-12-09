package iset.mvcpersonne.controleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import iset.mvcpersonne.modele.Personne;

/**
 * Servlet implementation class AjoutServlet
 */
@WebServlet("/AjoutServlet")
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String sexe=request.getParameter("sexe");
		String code=request.getParameter("code");
		Personne p =new Personne(nom,prenom,sexe,code);
		HttpSession session = request.getSession();
		 ArrayList<Personne> listpersonne ;
		listpersonne = (ArrayList<Personne>)(session.getAttribute("list")) ;
		 if (listpersonne == null ) {
			  listpersonne = new ArrayList<Personne>();
			 listpersonne.add(p);
		 }else {
			 listpersonne.add(p);
		 }

		session.setAttribute("list", listpersonne);
		response.sendRedirect("./Affichage.jsp");
	}

}
