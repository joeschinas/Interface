
package controller;

import entidades.Contrato;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

   
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);
      
        System.out.println("Entre Com os dados do contrato :" );
        System.out.print("Numero : ");
        Integer numContrato = read.nextInt();
        System.out.print("Data do Contrato : ");
        Date dtContrato = sdf.parse(read.next());
        System.out.print("Valor do Contrato : ");
        Double valorContrato = read.nextDouble();
        
        Contrato contrato = new Contrato(numContrato, dtContrato,valorContrato);
        
    }
    
}
