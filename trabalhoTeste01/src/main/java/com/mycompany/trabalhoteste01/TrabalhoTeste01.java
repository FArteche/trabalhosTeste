package com.mycompany.trabalhoteste01;

import java.awt.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

/**
 *
 * @author faart
 */
public class TrabalhoTeste01 {

    private int num[] = {1, 2, 3, 4, 5};
    private String nome[] = {"Joao", "Maria", "Jose", "Ana"};
    private ArrayList<Integer> intArr = new ArrayList<>();
    private Iterable<String> arrayItTeste = new ArrayList<>(asList("Maria", "Ana", "Carla"));
    private String vazio;

    public int numIndex(int index){
        return num[8];
    }
    
    public void addArr (int add){
        for(int i=1;i<=add;i++){
            getIntArr().add(i);
        }
    }

    /**
     * @return the num
     */
    public int[] getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int[] num) {
        this.num = num;
    }

    /**
     * @return the nome
     */
    public String[] getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String[] nome) {
        this.nome = nome;
    }

    /**
     * @return the arrayTeste
     */
    public Iterable<String> getArrayItTeste() {
        return arrayItTeste;
    }

    /**
     * @param arrayTeste the arrayTeste to set
     */
    public void setArrayItTeste(Iterable<String> arrayTeste) {
        this.arrayItTeste = arrayTeste;
    }

    /**
     * @return the intArr
     */
    public ArrayList<Integer> getIntArr() {
        return intArr;
    }

    /**
     * @return the vazio
     */
    public String getVazio() {
        return vazio;
    }

    /**
     * @param vazio the vazio to set
     */
    public void setVazio(String vazio) {
        this.vazio = vazio;
    }

}
