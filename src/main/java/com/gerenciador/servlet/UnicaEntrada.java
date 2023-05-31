package com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

@WebServlet("/entrada")
public class UnicaEntrada extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException{

    }
    
}
