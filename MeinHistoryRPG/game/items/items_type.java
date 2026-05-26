class items{
    private String tipo_item;
    private String Nombre_item;
    private int Daño_item;
    private int experiencia_requerida;
    private int nivel_requerida;
    protected String composicion_item;
    protected String Mundo_item;

    public item(String tipo_item, String Nombre_item, int Daño_item, int experiencia_requerida, int nivel_requerida, String composicion_item, String Mundo_item){
        this.tipo_item = tipo_item;
        this.Nombre_item = Nombre_item;
        this.Daño_item = Daño_item;
        this.experiencia_requerida = experiencia_requerida;
        this.nivel_requerida = nivel_requerida;
        this.composicion_item = composicion_item;
        this.Mundo_item = Mundo_item;
    }

    // getters
    public String getTipo_item() {
        return tipo_item;
    }
    public String getNombre_item() {
        return Nombre_item;
    }
    public int getDaño_item() {
        return Daño_item;
    }
    public int getExperiencia_requerida() {
        return experiencia_requerida;
    }
    public int getNivel_requerida() {
        return nivel_requerida;
    }
    public String getComposicion_item() {
        return composicion_item;
    }
    public String getMundo_item() {
        return Mundo_item;
    }
    // setters
    public void setTipo_item(String tipo_item) {
        this.tipo_item = tipo_item;
    }
    public void setNombre_item(String Nombre_item) {
        this.Nombre_item = Nombre_item;
    }
    public void setDaño_item(int Daño_item) {
        this.Daño_item = Daño_item;
    }
    public void setExperiencia_requerida(int experiencia_requerida) {
        this.experiencia_requerida = experiencia_requerida;
    }
    public void setNivel_requerida(int nivel_requerida) {
        this.nivel_requerida = nivel_requerida;
    }
    public void setComposicion_item(String composicion_item) {
        this.composicion_item = composicion_item;
    }
    public void setMundo_item(String Mundo_item) {
        this.Mundo_item = Mundo_item;
    }

    public void arco_Kaboom(){
        this.tipo_item = "arco";
        this.Nombre_item = "Arco Kaboom";
        this.Daño_item = 100;
        this.experiencia_requerida = 1000;
        this.nivel_requerida = 10;
        this.composicion_item = "madera";
        this.Mundo_item = "bosque";
    }

    public void espada_Ignea(){
        this.tipo_item = "espada";
        this.Nombre_item = "Espada Ignea";
        this.Daño_item = 100;
        this.experiencia_requerida = 1000;
        this.nivel_requerida = 10;
        this.composicion_item = "madera";
        this.Mundo_item = "bosque";
    }

    public void espada_Hielica(){
        this.tipo_item = "espada";
        this.Nombre_item = "Espada Hielica";
        this.Daño_item = 100;
        this.experiencia_requerida = 1000;
        this.nivel_requerida = 10;
        this.composicion_item = "madera";
        this.Mundo_item = "bosque";
    }
}
