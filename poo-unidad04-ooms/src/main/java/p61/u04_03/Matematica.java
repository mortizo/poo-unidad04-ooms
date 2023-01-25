/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.u04_03;


/**
 *
 * @author morti
 */
public class Matematica {
    
    private double valor1;
    private double valor2;
    private double valor3;

    public Matematica(double valor1, double valor2, double valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }
    
    /*
    valor1=10
    valor2=20
    valor3=30
    */
    public double calcularSuma(){//60
        return valor1+valor2+valor3;
    }
    
    public double calcularResta(){//-40
        return valor1-valor2-valor3;
    }
    
    public double calcularMultiplicacion(){//6000
        return valor1*valor2*valor3;
    }
    
    public double calcularDivision(){//0.0166666
        return valor1/valor2/valor3;
    }
    
    public void calcularAdmision(){
    
    }
    
    //800 horas, 2 materias, quintil 3
    //300 horas, 2 materias, quintil 2
    //300 horas, 1 materias, quintil 2
    //500 horas, 3 materias, quintil 3
    //500 horas, 4 materias, quintil 4
    //radio 2
    
    //perimetro 12.222 //area 25.3
    
    public double[] calcularPerimetroAreaCircunferencia(int radio){
        var retorno=new double[2];

        return retorno;
    }   
    
    
    public double calcularMatricula(int horas, int mat2M, int quintil){ //1675.48 //1536.90 //13685.2 //1696.66 //
        return 0;
    }
    
    
}
