//testehospede

package hotelaula;

public class testehospede {
    
    public static void main(String [] args){
        Hospede h3 = new Hospede("Pedro", "Paschoalotti", 16, 8, 1997);
        
        h3.mostradadoshospede();
    }
}

//Hospede

package hotelaula;

public class Hospede {
    private static int id;
    private String nome;
    private String sobrenome;
    private Data dataEntrada;
    
    public Hospede(String nome){
        ++this.id;
        this.nome = nome;
    }
    
    public Hospede(String nome, String sobrenome, int dia, int mes, int ano){
        ++this.id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataEntrada = new Data(dia, mes, ano);
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
     
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void mostra(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
    }
    
    public void mostradadoshospede(){
        if (this.nome == null){
            System.out.println("Nome: Não cadastrado");
        } else { 
            System.out.println("Nome: "+this.nome);
        }
        
        if (this.sobrenome == null){
            System.out.println("Sobrenome: Não cadastrado.");
        } else{
            System.out.println("Sobrenome: "+this.sobrenome);
        }
        
        System.out.println(this.dataEntrada.getdia()+"/"+this.dataEntrada.getmes()+"/"+this.dataEntrada.getano());
    }
}


//Data

package hotelaula;


public class Data {
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setdia(int dia){
        this.dia = dia;
    }
    
    public void setmes(int mes){
        this.mes = mes;
    }
    
    public void setano(int ano){
        this.ano = ano;
    }
    
    public int getdia(){
        if (this.dia > 31 || this.dia < 1){
            this.dia = 0;
        }
        return dia;
    }
    
    public int getmes(){
        if (this.mes > 12 || this.mes < 1){
            this.mes = 0;
        }
        return mes;
    }

    public int getano(){
        if (this.ano > 2016 || this.ano < 1916){
            this.ano = 0;
        }
        return ano;
    }
}

//hotel.java

package hotelaula;


public class Hotel {
    private String nome;
    private Hospede[] arrayDeHospedes;
    private int[] telefones;
    
    public Hotel(String nome, Hospede[] arrayDeHospedes, int[] telefones){
        this.nome = nome;
        this.arrayDeHospedes = arrayDeHospedes;
        this.telefones = telefones;
    }
}
