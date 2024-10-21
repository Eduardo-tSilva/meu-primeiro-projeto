package br.com.carstore.servlet;

import br.com.carstore.Dao.CarDao;
import br.com.carstore.Model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String name = req.getParameter("car-name");
        String color = req.getParameter("color");

        CarDao carDao = new CarDao();
        Car car = new Car(id, name, color);

        if(id.isBlank()) {
            carDao.createCar(car);
        } else {
            carDao.updateCar(car);
        }

        resp.sendRedirect("/find-all-cars");
    }
}
