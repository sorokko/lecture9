package ru.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/author")
public class GreetingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String authorInfo = "<html>" +
                "<head><title>Author Information</title></head>" +
                "<body>" +
                "<h1>Информация об авторе</h1>" +
                "<p>Фамилия: Иваненко</p>" +
                "<p>Имя: Иванко</p>" +
                "<p>Отчество: Рюрикович</p>" +
                "<p>Телефон: 8-800-555-35-35</p>" +
                "<p>Хобби: анжумания, бегит, прес качат</p>" +
                "<p>Bitbucket url: http://bitbucket/ivan</p>" +
                "</body>" +
                "</html>";

        response.getWriter().write(authorInfo);
    }
}
