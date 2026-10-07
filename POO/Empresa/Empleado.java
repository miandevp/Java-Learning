package Empresa;


public class Empleado{
    private String nombre;
    private double salario;
    protected String departamento;

    final int id;

    public Empleado(int id, String nombre, double salario){
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }
    }


    protected void mostrarDepartamento(){
        System.out.println("Departamento : " + departamento);
    }

    protected void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Saldo: "+ salario);   
    }

}