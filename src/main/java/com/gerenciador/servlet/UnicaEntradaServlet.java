// package com.gerenciador.servlet;

// import java.io.IOException;
// import javax.servlet.RequestDispatcher;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import com.gerenciador.acoes.Acao;

// @WebServlet(urlPatterns="/entrada")
// public class UnicaEntradaServlet extends HttpServlet{
//     @Override
//     protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
//         String paramAcao = req.getParameter("acao");
//         String nomeDaClasse = "com.gerenciador.acoes." + paramAcao;

//         Object obj;
//         try {
//             Class classe = Class.forName(nomeDaClasse);
//             obj = classe.newInstance();
//         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//             throw new ServletException(e);
//         };
//         Acao acao = (Acao)obj;
//         String nome = acao.executa(req, resp);

//         String[] tipoEndereco = nome.split(":");
        
//         if(tipoEndereco[0].equals("forward")){
//             RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
//             rd.forward(req, resp);
//         } else if(tipoEndereco[0].equals("redirect")){
//             resp.sendRedirect(tipoEndereco[1]);
//         }
//     }    
// }
