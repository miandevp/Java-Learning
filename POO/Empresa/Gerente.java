package Empresa;

public class Gerente extends Empleado {

    private double bono;


    public Gerente(int id , String nombre,double salario, double bono){
        super(id,nombre,salario);
        this.bono = bono;
    }

    public void mostrarDepartamentoGerente(){
        departamento = "Administración";

        mostrarDepartamento();
    }

    public double getBono(){
        return bono;
    }


    public void setBono(double bono){
        this.bono = bono;
    }

    public void mostrarInformacionGerente(){
        mostrarInformacion();
        System.out.println("Bono: "+bono);
    }


}