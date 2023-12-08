import java.util.Scanner;

class Main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Funcoes funcoes = new Funcoes();

    int opcao = funcoes.menu(sc);
    if (opcao == 1) {
      funcoes.cadastroDeUsuario(sc);
      
      String escolhaUsuario = funcoes.menuUsuario(sc);
      if (escolhaUsuario.equalsIgnoreCase("A")) {
        System.out.println("\nA - Escolher motorista específico 🎯");
        System.out.println("B - Escolher motorista aleatório 🎲\n");
        String escolherMotorista = sc.nextLine();
        
        if (escolherMotorista.equalsIgnoreCase("A")) {
          String motoristaEspeficico = Funcoes.viajarComMotoristaEspecifico(sc);
          if (motoristaEspeficico.equalsIgnoreCase("A")) {
            System.out.println("\n🏍️ |Viajando com o motorista Roberto Carlos");
            System.out.println("📞|Telefone: (83) 99237-8429");
          } else if (motoristaEspeficico.equalsIgnoreCase("B")) {
            System.out.println("\n🏍️ |Viajando com o motorista Maria Eduarda");
            System.out.println("📞|Telefone: (83) 99237-8429");
          } else if (motoristaEspeficico.equalsIgnoreCase("C")) {
            System.out.println("\n🏍️ |Viajando com o motorista João Pedro");
            System.out.println("📞|Telefone: (83) 99237-8429");
          } else if (motoristaEspeficico.equalsIgnoreCase("D")) {
            System.out.println("\n🏍️ |Viajando com o motorista Maria Clara");
            System.out.println("📞|Telefone: (83) 99237-8429");
          } else {
            System.out.println("\n⚠️|Motorista não encontrado");
          }
        } else if (escolherMotorista.equalsIgnoreCase("B")){
            Funcoes.escolherMotoristaAleatorio();
        }
      } else if (escolhaUsuario.equalsIgnoreCase("B")) {
        Funcoes.avaliacaoUsuario(sc);
      } else {
        System.out.println("\n⚠️|Opção inválida");
      }
    } else if (opcao == 2) {
      funcoes.cadastroDeMotorista(sc);
      
      String escolhaMotorista = funcoes.menuMotorista(sc);
      if (escolhaMotorista.equalsIgnoreCase("A")) {
        String status = funcoes.statusMotorista(sc);
        if (status.equalsIgnoreCase("A")) {
          System.out.println("Motorista disponível 🔔");
        } else if (status.equalsIgnoreCase("B")) {
          System.out.println("Motorista ocupado 🔕");
        }
      } else if (escolhaMotorista.equalsIgnoreCase("B")) {
        funcoes.chamadas();
      } else {
        System.out.println("Opção inválida");
      }

      
    } else {
      System.out.println("⚠️|Opção inválida");
    }

  }
}