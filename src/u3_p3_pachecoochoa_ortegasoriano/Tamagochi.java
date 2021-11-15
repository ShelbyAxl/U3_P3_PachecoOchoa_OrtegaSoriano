/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3_p3_pachecoochoa_ortegasoriano;

/**
 *
 * @author luisa
 */
public class Tamagochi {
    int hungry, fun, sick, clean;
    
    public Tamagochi(int hungry, int fun, int sick, int clean){
        this.hungry = hungry;
        this.fun = fun;
        this.sick = sick;
        this.clean = clean;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }

    public int getSick() {
        return sick;
    }

    public void setSick(int sick) {
        this.sick = sick;
    }

    public int getClean() {
        return clean;
    }

    public void setClean(int clean) {
        this.clean = clean;
    }
    
}
