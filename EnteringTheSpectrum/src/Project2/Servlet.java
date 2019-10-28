package Project2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getRequestURI());		
		String uri = request.getRequestURI();
		
		if(uri.equals("/Drinks/checkDrink.do")) {
			DrinkDOA d = new DrinkDOA();
			String drinks = d.getDrinks();
			response.getWriter().append(d.getDrinks());
		} 
		
		if(uri.equals("/Apartment/checkApartment.do")) {
			String APTNAME = request.getParameter("AN");
			if (ApartmentService.checkApartments(APTNAME)) {
			response.getWriter().append("Exists");
			} else {
			response.getWriter().append("DNE");
			}
		} 
		
		if(uri.equals("/Apartment/changeRank.do")) {
			String APTNAME = request.getParameter("AptName");
			int rankChange = Integer.valueOf(request.getParameter("RC"));
			ApartmentService.changeRank(APTNAME,  rankChange);
		} 

		if(uri.equals("/Apartment/addApartment.do")) {
			String ApartmentName = request.getParameter("AN");
			String Address = request.getParameter("Address");
			String PhoneNumber = request.getParameter("PN");
			String ContractLength = request.getParameter("CLength");
			String DateAvailable = request.getParameter("DA");
			int RentAmount = Integer.valueOf(request.getParameter("RA"));
			int UtilitiesCost = Integer.valueOf(request.getParameter("UC"));
			int UpFrontCost = Integer.valueOf(request.getParameter("UFC"));
			String Notes = request.getParameter("NOTES");
			System.out.println(
					"  AN: " + ApartmentName + 
					"  Address: " + Address +
					"  PN: " + PhoneNumber +
					"  CLength: " + ContractLength +
					"  DA: " + DateAvailable +
					"  RA: " + RentAmount +
					"  UC: " + UtilitiesCost +
					"  UFC: " + UpFrontCost +
					"  NOTES: " + Notes
					);
			ApartmentService.newApartment(ApartmentName, Address, PhoneNumber, ContractLength, DateAvailable, RentAmount, UtilitiesCost, UpFrontCost, Notes);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}