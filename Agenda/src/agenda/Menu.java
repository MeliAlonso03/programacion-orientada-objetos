package agenda;

public class Menu{
    private Consola con;
    private boolean Salir;
    private Persona ListaPersona[];
    int Contador,LargoLista;
    public Menu()
    {
        this.con=new Consola();
        this.Salir=false;
        this.Contador=0;
        this.LargoLista=this.con.getNum("Ingrese cantidad maxima de personas a cargar:");
        this.ListaPersona=new Persona[LargoLista];
    }
    public void Opciones()
    {
        String Opciones[]={"1: Cargar Persona","2: Listar Personas Cargadas","3: Buscar Persona Por Documento","4: Salir"};
        while(!Salir)
        {
            this.con.drawLine(50);
            this.con.displayMSG(Opciones);
            switch(this.con.getNum(""))
            {
                case 1:
                    if(Contador<LargoLista)
                        crearPersona();
                    else
                        System.out.println("Maximo de persona alcanzado.");
                    break;
                case 2:
                    if(this.Contador>0)
                    {
                        this.con.drawLine(50);
                        listar();
                    }else
                        System.out.println("No hay personas cargadas.");
                    break;
                case 3:
                    if(this.Contador>0)
                    {
                        this.con.drawLine(50);
                        buscar();
                    }else
                        System.out.println("No hay personas cargadas.");
                    break;
                case 4:
                    this.Salir=true;
                    break;
            }
        }
    }
    public void crearPersona()
    {
        this.con.limpiarBuffer();
        System.out.println("Nueva Persona");
        String Nombre=this.con.getString("Nombre: ");
        String Apellido=this.con.getString("Apellido: ");
        int Documento=this.con.getNum("Documento: ");
        int DiaN=this.con.getNum("Dia Nacimiento: ");
        int MesN=this.con.getNum("Mes Nacimiento: ");
        int AnioN=this.con.getNum("Anio Nacimiento: ");
        this.ListaPersona[this.Contador]=new Persona(Nombre, Apellido, Documento,DiaN,MesN,AnioN);
        this.Contador++;
    }
    public void listar()
    {
        for(int i=0;i<this.Contador;i++)
        {
            System.out.println((i+1)+":"+this.ListaPersona[i].getNombre()+" "+this.ListaPersona[i].getApellido()+"\n"+"Documento: "+this.ListaPersona[i].getDocumento()+"\n"+"Fecha de Nacimiento: "+this.ListaPersona[i].getNacimientoDia()+"/"+this.ListaPersona[i].getNacimientoMes()+"/"+this.ListaPersona[i].getNacimientoAnio());
        }
    }
    public void buscar()
    {
        int d=this.con.getNum("Ingrese Numero de Documento: ");
        int c=0;
        for(int i=0;i<this.Contador;i++)
        {
            if(d==this.ListaPersona[i].getDocumento())
            {
                this.con.drawLine(50);
                this.ListaPersona[i].mostrarDatos();
                c++;
            }
        }
        if(c==0)
            System.out.println("No se encontro la persona.");
    }
}
