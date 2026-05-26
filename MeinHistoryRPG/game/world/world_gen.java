
class Mundo{
    private int semilla_mundo;
    private int dimensiones_x;
    private int dimensiones_y;
    private int dimensiones_z;
    private String nombre_mundo;
    private String tipo_mundo;
    public Mundo(int semilla_mundo, int dimensiones_x, int dimensiones_y, int dimensiones_z, String nombre_mundo, String tipo_mundo){
        this.semilla_mundo = semilla_mundo;
        this.dimensiones_x= dimensiones_x;
        this.dimensiones_y= dimensiones_y;
        this.dimensiones_z= dimensiones_z;
        this.nombre_mundo = nombre_mundo;
        this.tipo_mundo = tipo_mundo;
    }

    // getter

    // Da un numero al aleatorio
    public int getSemilla_mundo(){
        return semilla_mundo;
    }
    public int getDimensiones_x(){
        return dimensiones_x;
    }
    public int getDimensiones_y(){
        return dimensiones_y;
    }
    public int getDimensiones_z(){
        return dimensiones_z;
    }

    //setter
    public void setSemilla_mundo(int semilla_mundo){
        this.semilla_mundo = semilla_mundo;
    }
    public void setDimensiones_X(int dimensiones_x){
        this.dimensiones_x = dimensiones_x;
    }
    public void setDimensiones_Y(int dimensiones_y){
        this.dimensiones_y = dimensiones_y;
    }
    public void setDimensiones_Z(int dimensiones_z){
        this.dimensiones_z = dimensiones_z;
    }

    public void generarSemilla(){
    
    }

}

public class Main{
    public static void main(String[] Args){
        menu miMenu = new menu();
        miMenu.mostrarMenu();
    }
}