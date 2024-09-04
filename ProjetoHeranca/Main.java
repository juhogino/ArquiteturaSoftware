 public class Main {
        public static void main(String[] args) {

            
            
            Carro meuCarro = new Carro("Ford", "Focus", 2022, 4);
            Moto minhaMoto = new Moto("Honda", "CBR", 2021, true);

            System.out.println("Informações carro: ");
            meuCarro.exibirInformacao();
            meuCarro.acelerar();
            meuCarro.abrirPortaMalas(); 

            System.out.println("\n\nInformações moto: ");
            minhaMoto.exibirInformacao();
            minhaMoto.acelerar();
            minhaMoto.empinar();
        }
    }


