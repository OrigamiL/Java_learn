package com.weifang.test;

public class Army {
    private final int num;
    private Weapon[] w;
    private int i;

    public Army(int num) {
        this.num = num;
        this.w = new Weapon[num];
    }

    public int getNum() {
        return num;
    }

    public Weapon[] getW() {
        return w;
    }

    public void addWeapon(Weapon wa) throws OverException {
        if(i > num -1){
            throw new OverException("武器已经满了");
        }
        w[i++] = wa;
        System.out.println(wa.toString()+" 已经装载,当前武器数为 "+(i));
    }

    public void attackAll(){
        for (int j = 0; j < i; j++) {
            if(w[j] instanceof Attachable){
                Attachable attachable = (Attachable)w[j];
                attachable.attack();
            }
        }
    }

    public void moveAll(){
        for (int j = 0; j < i; j++) {
            if(w[j] instanceof Moveable){
                Moveable moveable = (Moveable)w[j];
                moveable.move();
            }
        }
    }
}
