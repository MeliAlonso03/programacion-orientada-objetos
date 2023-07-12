package agenda;

public class Persona
{
    private String Nombre;
    private String Apellido;
    private int Documento;
    private int Nacimiento[]=new int[3];
    public Persona()
    {
        this.Nombre="NONE";
        this.Apellido="NONE";
        this.Documento=0;
        for(int i=0;i<3;i++)
            this.Nacimiento[i]=0;
    }
    public Persona(String Nombre,String Apellido,int Documento,int Dia,int Mes,int Anio)
    {
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Documento=Documento;
        this.Nacimiento[0]=Dia;
        this.Nacimiento[1]=Mes;
        this.Nacimiento[2]=Anio;
    }
    public String getNombre(){return this.Nombre;}
    public String getApellido(){return this.Apellido;}
    public int getDocumento(){return this.Documento;}
    public int getNacimientoDia(){return this.Nacimiento[0];}
    public int getNacimientoMes(){return this.Nacimiento[1];}
    public int getNacimientoAnio(){return this.Nacimiento[2];}
    public void setNombre(String s){this.Nombre=s;}
    public void setApellido(String s){this.Apellido=s;}
    public void setDocumento(int i){this.Documento=i;}
    public void setNacimientoDia(int i){this.Nacimiento[0]=i;}
    public void setNacimientoMes(int i){this.Nacimiento[1]=i;}
    public void setNacimientoAnio(int i){this.Nacimiento[2]=i;}
    public void mostrarDatos()
    {
        System.out.println("Nombre:"+this.Nombre+" "+this.Apellido);
        System.out.println("Documento:"+this.Documento);
        System.out.println("Fecha de Nacimiento:"+this.Nacimiento[0]+"/"+this.Nacimiento[1]+"/"+this.Nacimiento[2]);
    }
}
