class Jugador{
    private String nombre_usuario;
    private int vida;
    private int hambre;
    private int composicion;
    private int experiencia;
    private int nivel;
    private int experiencia_nivel;
    private int experiencia_nivel_max;
    private int experiencia_nivel_min;
    private int experiencia_nivel_actual;
    private int experiencia_nivel_siguiente;
    private int experiencia_nivel_anterior;
    private int experiencia_nivel_siguiente_max;
    private int experiencia_nivel_siguiente_min;
    private int experiencia_nivel_siguiente_actual;
    private int experiencia_nivel_siguiente_anterior;
    
    public Jugador(String nombre_usuario, int vida, int hambre, int composicion, int experiencia, int nivel, int experiencia_nivel, int experiencia_nivel_max, int experiencia_nivel_min, int experiencia_nivel_actual, int experiencia_nivel_siguiente, int experiencia_nivel_anterior, int experiencia_nivel_siguiente_max, int experiencia_nivel_siguiente_min, int experiencia_nivel_siguiente_actual, int experiencia_nivel_siguiente_anterior){
        this.nombre_usuario = nombre_usuario;
        this.vida = vida;
        this.hambre = hambre;
        this.composicion = composicion;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.experiencia_nivel = experiencia_nivel;
        this.experiencia_nivel_max = experiencia_nivel_max;
        this.experiencia_nivel_min = experiencia_nivel_min;
        this.experiencia_nivel_actual = experiencia_nivel_actual;
        this.experiencia_nivel_siguiente = experiencia_nivel_siguiente;
        this.experiencia_nivel_anterior = experiencia_nivel_anterior;
        this.experiencia_nivel_siguiente_max = experiencia_nivel_siguiente_max;
        this.experiencia_nivel_siguiente_min = experiencia_nivel_siguiente_min;
        this.experiencia_nivel_siguiente_actual = experiencia_nivel_siguiente_actual;
        this.experiencia_nivel_siguiente_anterior = experiencia_nivel_siguiente_anterior;
    }
    // getter
    public String getNombre_usuario() {
        return nombre_usuario;
    }
    public int getVida() {
        return vida;
    }
    public int getHambre() {
        return hambre;
    }
    public int getComposicion() {
        return composicion;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public int getNivel() {
        return nivel;
    }
    public int getExperiencia_nivel() {
        return experiencia_nivel;
    }
    public int getExperiencia_nivel_max() {
        return experiencia_nivel_max;
    }
    public int getExperiencia_nivel_min() {
        return experiencia_nivel_min;
    }
    public int getExperiencia_nivel_actual() {
        return experiencia_nivel_actual;
    }
    public int getExperiencia_nivel_siguiente() {
        return experiencia_nivel_siguiente;
    }
    public int getExperiencia_nivel_anterior() {
        return experiencia_nivel_anterior;
    }
    public int getExperiencia_nivel_siguiente_max() {
        return experiencia_nivel_siguiente_max;
    }
    public int getExperiencia_nivel_siguiente_min() {
        return experiencia_nivel_siguiente_min;
    }
    public int getExperiencia_nivel_siguiente_actual() {
        return experiencia_nivel_siguiente_actual;
    }
    public int getExperiencia_nivel_siguiente_anterior() {
        return experiencia_nivel_siguiente_anterior;
    }
    // setter
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setHambre(int hambre) {
        this.hambre = hambre;
    }
    public void setComposicion(int composicion) {
        this.composicion = composicion;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setExperiencia_nivel(int experiencia_nivel) {
        this.experiencia_nivel = experiencia_nivel;
    }
    public void setExperiencia_nivel_max(int experiencia_nivel_max) {
        this.experiencia_nivel_max = experiencia_nivel_max;
    }
    public void setExperiencia_nivel_min(int experiencia_nivel_min) {
        this.experiencia_nivel_min = experiencia_nivel_min;
    }
    public void setExperiencia_nivel_actual(int experiencia_nivel_actual) {
        this.experiencia_nivel_actual = experiencia_nivel_actual;
    }
    public void setExperiencia_nivel_siguiente(int experiencia_nivel_siguiente) {
        this.experiencia_nivel_siguiente = experiencia_nivel_siguiente;
    }
    public void setExperiencia_nivel_anterior(int experiencia_nivel_anterior) {
        this.experiencia_nivel_anterior = experiencia_nivel_anterior;
    }
    public void setExperiencia_nivel_siguiente_max(int experiencia_nivel_siguiente_max) {
        this.experiencia_nivel_siguiente_max = experiencia_nivel_siguiente_max;
    }
    public void setExperiencia_nivel_siguiente_min(int experiencia_nivel_siguiente_min) {
        this.experiencia_nivel_siguiente_min = experiencia_nivel_siguiente_min;
    }
    public void setExperiencia_nivel_siguiente_actual(int experiencia_nivel_siguiente_actual) {
        this.experiencia_nivel_siguiente_actual = experiencia_nivel_siguiente_actual;
    }
    public void setExperiencia_nivel_siguiente_anterior(int experiencia_nivel_siguiente_anterior) {
        this.experiencia_nivel_siguiente_anterior = experiencia_nivel_siguiente_anterior;
    }
    // setter

    // matematica a tener en cuenta para el niveles de experiencia
    /** 
     * teniendo un numero menor n < 0 el jugador sigue en nivel 0
     * en cambio mayor a 100 el jugador sube de nivel 0 a 1
     * cuando suba de nivel el jugador tiene que seguir recolectando experiencia pero esta vez el doble y asi sucesivamente
     * al menos hasta el nivel 999 máximo y donde desde el nivel 300 empieza a ganar numeros bajos de experiencia
     * en este caso se tendria que usar el caracter float por que son despreciables numeros como 0.5 o 0.3
    */
   public void calcular_Experiencia(){

   }
}