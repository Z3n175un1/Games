class move{
    private char movimiento_x;
    private char movimiento_y;
    private char movimiento__x;
    private char movimiento__y;

    public move(char mov__x,char mov__y,char mov_x,char mov_y,){
        this.movimiento_x = up;
        this.movimiento_y = down;
        this.movimiento__x = left;
        this.movimiento__y = right;
    }

    // getters
    
    public void getMoveX(){
        return movimiento__x;
    }

    public void getMoveY(){
        return movimiento__y;
    }

    public void getMove__X(){
        return movimiento_x;
    }

    public void getMove__Y(){
        return movimiento_y;
    }


    //setters
    public void setMoveX(char movimiento_x){
        this.movimiento_x = movimiento_x;
    }

    public void setMoveY(char movimiento_y){
        this.movimiento_y = movimiento_y;
    }

    public void setMove__X(char movimiento__x){
        this.movimiento__x = movimiento__x;
    }

    public void setMove__Y(char movimiento__y){
        this.movimiento__y = movimiento__y;
    }
}
