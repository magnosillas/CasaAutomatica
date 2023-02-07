package Casa;

public class Lampada extends Dispositivo{
    private String cor;
    private int intensidade;


    public Lampada(int id) {
        super(id);
    }




    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        cor = cor.toLowerCase();
        if(cor.equals("azul") || cor.equals("vermelho") || cor.equals("verde") || cor.equals("amarelo")){
            this.cor = cor;
        }
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {

        this.intensidade = intensidade;
    }
}
