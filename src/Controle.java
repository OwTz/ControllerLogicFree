public class Controle implements Appinterface {
    private boolean ligado;
    private int volume;
    private boolean menu;

    /* construtor da classe  */

    public Controle(){

        this.ligado = false;
        this.volume = 50;
        this.menu = false;

    }
    // obs: os métodos get e set podem ser privado :)
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume){
        this.volume += volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setMenu(boolean menu) {
        this.menu = menu;
    }
    private boolean getMenu(){
        return this.menu;
    }
    /* métodos para ligar */
    public void ligar(){

        if (getLigado()) {

            System.out.println("o controle já está ligado!");
            
        } else {

            this.setLigado(true);
            System.out.println("o controle foi ligado");
            
        }
    }
    public void desligar(){
        if (getLigado() == false) {

            System.out.println("o controle já está desligado!");
            
        } else {

            this.setLigado(false);
            System.out.println("o controle foi desligado");

        }
        
    }
    /* abrir e fechar menu */
    public void abrirMenu(){

        /* if ternario colocando resultado em string para converter o boolean para string  */

        String resultado;
        resultado = getLigado()?"Ligado":"desligado";

        if(getLigado()){

            this.setMenu(true);
            System.out.println("o menu foi ligado :) aproveite");
            System.out.printf(" volume: "+getVolume());
            for (int i = 0 ; i <= this.getVolume() ; i+= 10){
                System.out.printf("|");
            }
            System.out.println("  situação: "+resultado);
            System.out.println(" || FIM DO MENU ||");
        } else {
            System.out.println("o menu nn pode ser ligado: "+resultado);
        }
    }
    public void fecharMenu(){
        if (this.getMenu() == true) {
            this.setMenu(false);
            System.out.println("o menu foi fechado :( ");
        } else {
            System.out.println("erro: menu já está fechado! ");
        }
    }
    public void aumentar(){
        if ( this.getLigado() && this.getMenu() ) {

            if ( this.getVolume() == 0 || this.getVolume() < 0) {
                System.out.println("o volume está em 100% , não é possível aumenta");
            } else {

                this.setVolume(5);
                for(int i = 5 ; i <= this.getVolume() ; i+=5 ){
                    System.out.printf("|");
                    
               }
            }
            
        } else {
            System.out.println("não foi possível aumentar o volume :(");
        }
    }
    public void diminuir(){

        if (this.getLigado() == true && this.getMenu() == true) {
 
            if (this.getVolume() > 0 ) {
                System.out.println("o volume está em 100% , não é possível aumenta");
            } else {
                
                this.setVolume(-5) ;
               for(int i = 5 ; i < 100 ; i++ ){
                    System.out.println("o volume foi aumentado: " +i);
               }
            }

        }else{
            System.out.println(" não é possível diminuir o volume");
        }
    }

}
