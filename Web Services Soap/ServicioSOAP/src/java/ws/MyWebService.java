/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author NELSON
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod (operationName = "Login")
    public String Login(@WebParam(name="usuario") String usuario, @WebParam(name="contra") String contra)
    {
        if(usuario.equals("nelson") && contra.equals("123")){
            return "Login Correcto";
        } else 
        {
            return "Error al iniciar sesion";
        }
    }
    
    @WebMethod (operationName = "Suma")
    public int Suma(@WebParam(name="numero1") int numero1, @WebParam(name="numero2") int numero2){
        return numero1 + numero2;
    }
    
    
    @WebMethod(operationName = "CalcularAreaCuadrado")
    public double calcularAreaCuadrado(@WebParam(name = "lado") double lado) {
        return lado * lado;
    }

    @WebMethod(operationName = "CalcularAreaCircunferencia")
    public double calcularAreaCircunferencia(@WebParam(name = "radio") double radio) {
        return Math.PI * radio * radio;
    }

    @WebMethod(operationName = "CalcularAreaTrianguloEquilatero")
    public double calcularAreaTrianguloEquilatero(@WebParam(name = "lado") double lado) {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @WebMethod(operationName = "CalcularAreaRectangulo")
    public double calcularAreaRectangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura) {
        return base * altura;
    }

    @WebMethod(operationName = "CalcularAreaRomboide")
    public double calcularAreaRomboide(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura) {
        return base * altura;
    }

    @WebMethod(operationName = "CalcularAreaTrapecio")
    public double calcularAreaTrapecio(@WebParam(name = "baseMayor") double baseMayor, @WebParam(name = "baseMenor") double baseMenor, @WebParam(name = "altura") double altura) {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    @WebMethod(operationName = "CalcularAreaPentagonoRegular")
    public double calcularAreaPentagonoRegular(@WebParam(name = "lado") double lado) {
        return (5 * lado * lado) / (4 * Math.tan(Math.PI / 5));
    }

    @WebMethod(operationName = "CalcularAreaHexagonoRegular")
    public double calcularAreaHexagonoRegular(@WebParam(name = "lado") double lado) {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    
}
