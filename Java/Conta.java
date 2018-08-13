/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo2_lista1;

/**
 *
 * @author Carlos Antonio
 */
public class Conta {
private int numero;
private float saldo;
private boolean especial=true;
private float limite;

public int getNumero(){
    return numero;
}
   public void setNumero(int numero){
       this.numero=numero;
   }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
   
   
}
