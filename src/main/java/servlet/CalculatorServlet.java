package servlet;
import model.Calculator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
    public class CalculatorServlet extends HttpServlet {
       public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
            float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
            char operator = request.getParameter("operator").charAt(0);

            PrintWriter writer = response.getWriter();
            writer.println("<html>");

            writer.println("<h1>Ket qua:</h1>");
            try {
                float result = Calculator.calculate(firstOperand, secondOperand, operator);
                writer.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
            } catch (Exception ex) {
                writer.println("Loi: " + ex.getMessage());
            }
            writer.println("</html>");
        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doPost(request, response);
        }
    }
