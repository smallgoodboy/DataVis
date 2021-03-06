package com.index.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by smallgoodboy on 2014/5/21.
 */
public class MainFilter implements Filter {
    static String rootPath = "/Datavis/";
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        String contextPath = request.getRequestURI();

        if(contextPath.equals(rootPath)){
//            ServletContext context2 = request.getServletContext().getContext("/web2");
//            System.out.println(23432);
//            System.out.println(context2.toString());
//            RequestDispatcher requestDispatcher;
//            requestDispatcher = context2.getRequestDispatcher(newPath);
//            requestDispatcher.forward(req, resp);
            req.getRequestDispatcher("helloworld").forward(req, resp);
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
