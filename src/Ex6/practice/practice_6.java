class Marine{
    int x=0, y=0;
    int hp = 60;
    int weapon = 6; // static 
    int armor = 0; // static -- 모든 Marine 인스턴스에 대해 동일한 값이어야함
    void weaponUp(){
        weapon++;
    }
    void armorUp(){
        armor++;
    }
    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}