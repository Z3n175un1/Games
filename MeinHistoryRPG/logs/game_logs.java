class game_logs{
    private String titulo;
    private String descripcion;
    private Date fecha;
    private String tipo;
    
    public game_logs(String titulo, String descripcion, Date fecha, String tipo){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo_a;
    }

    // getters 

    public void getTitulo(){
        return titulo;
    }
    public void getDescripcion(){
        return descripcion;
    }
    public void getFecha(){
        return fecha;
    }
    public void getTipo(){
        return tipo;
    }

    // setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    // voids
    public void reporte(){

    }
}