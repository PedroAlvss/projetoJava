package Calculadora;
import java.util.Scanner;

public class CalculadoraCientifica {
    double x1 = 0;
    double x2 = 0;
    int opcao = 0;
    Scanner input = new Scanner(System.in);
    
    public double Soma(double x1, double x2){
        double soma = x1 + x2;

        return soma;
    }

    public double Subtracao(double x1, double x2){
        double subtracao = x1 - x2;

        return subtracao;
    }
    
    public double Multiplicacao(double x1, double x2){
        double multi = x1 * x2;

        return multi;
    }

    public double Divisao(double x1, double x2){
        double divisao = 0;
        if (x2 == 0) {
            System.out.print("Divisão por 0 não pode!");
        } else {
            divisao = x1 / x2;
        }
        return divisao;
    }

    public double Potenciacao(double x1, double x2){
        double potencia = Math.pow(x1, x2);

        return potencia;
    }
    
    public double Radiciacao(double x1){
        double raiz = Math.sqrt(x1);
        
        return raiz;
    }

    public double Fatorial(double x1) {
        double fatorial = 1;
        if (x1 > 0) {
            for(double i = x1; i>1; i--){
                fatorial *= i;
            }
            
        } else if(x1 == 0){
            fatorial = 1;
        } else {
            System.out.print("Não existe fatorial negativo!! burro");
        }

        return fatorial;
    }

    public double Arranjo(double x1, double x2) {
        double arranjo = this.Fatorial(x1) / this.Fatorial(x1 - x2);        
        return arranjo;
    }

    public double Combinacao(double x1, double x2) {
        double combinacao = this.Fatorial(x1) / (this.Fatorial(x2) * this.Fatorial(x1 - x2));
        return combinacao;
    }

    public double Porcentagem(double x1, double x2) {
        double porcentagem = 0;
        if (x1 > 0) {
            porcentagem = x1 * (x2/100);
        }
        return porcentagem;
    }
    
    public void Menu(){
        System.out.println("\n\n---CALCULADORA CIÊNTIFICA---");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Potenciação");
        System.out.println("6- Radiciação");
        System.out.println("7- Fatorial");
        System.out.println("8- Analise Combinatória");
        System.out.println("9- Porcentagem");
        System.out.println("10- Zerar o resultado!");
        System.out.println("11- Mostrar Número");
        System.out.println("0- Sair");
        System.out.print("R: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        double x1, x2;
        double ultimoResultado = 0;
        CalculadoraCientifica calculo = new CalculadoraCientifica();
        
        do {
            calculo.Menu();
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1: //SOMA
                    System.out.print("Digite o número a ser somado: ");
                    x1 = input.nextDouble();

                    if (ultimoResultado == 0) {
                        System.out.print("Digite o número a ser somado: ");
                        x2 = input.nextDouble();
                        ultimoResultado = calculo.Soma(x1, x2);
                        System.out.println("A soma é igual a: " + ultimoResultado);
                    } else {
                        ultimoResultado = calculo.Soma(ultimoResultado, x1);

                        System.out.println("A soma é igual a: " + ultimoResultado);
                    }
                    
                    break;
                
                case 2: //SUBTRAÇÃO
                    System.out.print("Digite o número a ser subtraido: ");
                    x1 = input.nextDouble();
                    
                    if (ultimoResultado == 0) {
                        System.out.print("Digite o número a ser subtraido: ");
                        x2 = input.nextDouble();
                        ultimoResultado = calculo.Subtracao(x1, x2);
                        System.out.println("A subtração é igual a: " + ultimoResultado);
                    } else {
                        ultimoResultado = calculo.Subtracao(ultimoResultado, x1);
                        
                        System.out.println("A subtração é igual a: " + ultimoResultado);
                    }
                    
                    break;
                    
                case 3: //MULTIPLICAÇÃO
                    System.out.print("Digite o número a ser multiplicado: ");
                    x1 = input.nextDouble();
                    
                    if (ultimoResultado == 0) {
                        System.out.print("Digite o número a ser multiplicado: ");
                        x2 = input.nextDouble();
                        ultimoResultado = calculo.Multiplicacao(x1, x2);
                        System.out.println("A multiplicação é igual a: " + ultimoResultado);
                    } else {
                        ultimoResultado = calculo.Multiplicacao(ultimoResultado, x1);
                        
                        System.out.println("A multiplicação é igual a: " + ultimoResultado);
                    }
                    break;
                
                case 4: //DIVISÃO
                    System.out.print("Digite o número a ser dividido: ");
                    x1 = input.nextDouble();
                    
                    if (ultimoResultado == 0) {
                        System.out.print("Digite o número a ser dividido: ");
                        x2 = input.nextDouble();
                        ultimoResultado = calculo.Divisao(x1, x2);
                        System.out.println("A divisão é igual a: " + ultimoResultado);
                    } else {
                        ultimoResultado = calculo.Divisao(ultimoResultado, x1);
                        
                        System.out.println("A divisão é igual a: " + ultimoResultado);
                    }
                    break;
                
                case 5: //POTENCIAÇÃO
                    System.out.print("Digite o expoente: ");
                    x1 = input.nextDouble();
                    
                    ultimoResultado =  calculo.Potenciacao(ultimoResultado, x1);
                    
                    System.out.println("A potenciação é igual a: " + ultimoResultado);
                    
                    
                    break;

                case 6: //RADICIAÇÃO
                    ultimoResultado = calculo.Radiciacao(ultimoResultado);

                    System.out.println("A radiciação é igual a: " + ultimoResultado);
                    
                    break;

                case 7: //FATORIAL
                    ultimoResultado = calculo.Fatorial(ultimoResultado);

                    System.out.println("O fatorial é igual a: " + ultimoResultado);

                    break;
                case 8: //ANÁLISE COMBINATÓRIA
                    System.out.println("1- Arranjo");
                    System.out.println("2- Combinação");
                    System.out.println("3- Permutação");
                    System.out.print("R: ");

                    opcao = input.nextInt();
                    switch (opcao) {
                        case 1: //ARRANJO
                            System.out.print("Digite o número: ");
                            x1 = input.nextDouble();
                    
                            if (ultimoResultado == 0) {
                                System.out.print("Digite o número: ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Arranjo(x1, x2);
                                System.out.println("O arranjo é igual a: " + ultimoResultado);
                            } else {
                                ultimoResultado = calculo.Arranjo(ultimoResultado, x1);
                        
                                System.out.println("O arranjo é igual a: " + ultimoResultado);
                            }
                            
                            
                            break;
                        case 2: //COMBINAÇÃO
                            System.out.print("Digite o número: ");
                            x1 = input.nextDouble();
                    
                            if (ultimoResultado == 0) {
                                System.out.print("Digite o número: ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Combinacao(x1, x2);
                                System.out.println("A combinação é igual a: " + ultimoResultado);
                            } else {
                                ultimoResultado = calculo.Combinacao(ultimoResultado, x1);
                        
                                System.out.println("A combinção é igual a: " + ultimoResultado);
                            }
                            
                            break;
                        case 3: //PERMUTAÇÃO
                            
                            int opc = 0;

                            System.out.println("1- Permutação simples");
                            System.out.println("2- Permutação com repetição");
                            System.out.print("R: ");
                            opc = input.nextInt();

                        
                            switch (opc) {
                                case 1:
                                    if (ultimoResultado == 0) {
                                        System.out.print("Digite o número: ");
                                        x1 = input.nextDouble();
                                        ultimoResultado = calculo.Fatorial(x1);
                                        System.out.println("A permutação simples é igual a: " + ultimoResultado);
                                    } else {
                                        ultimoResultado = calculo.Fatorial(ultimoResultado);
                                
                                        System.out.println("A permutação simples é igual a: " + ultimoResultado);
                                    }
                                    
                                    break;
                                
                                case 2:
                                    int cont = 0;
                                    int rep;
                                    System.out.print("");

                                    System.out.print("Digite a quantidade de repetições: ");
                                    rep = input.nextInt();

                                    ultimoResultado = calculo.Fatorial(ultimoResultado) / calculo.Fatorial(rep);

                                    System.out.print("\nDeseja constatar mais uma repetição? (1 para verdadeiro/0 para falso)  R: ");
                                    cont = input.nextInt();
                                    input.nextLine();

                                    while(cont != 0) {
                                        System.out.print("Digite a quantidade de repetições: ");
                                        rep = input.nextInt();

                                        ultimoResultado /= calculo.Fatorial(rep);

                                        //System.out.println("A permutação com repetição é igual a: " + ultimoResultado);
                                        System.out.print("\nDeseja constatar mais uma repetição? (1 para verdadeiro/0 para falso)  R: ");
                                        cont = input.nextInt();
                                        input.nextLine();

                                    } 
                                    System.out.println("A permutação composta é igual a " + ultimoResultado);
                                    break;
                                default:
                                    break;
                        }
                            
                            break;
                    
                        default:
                            break;
                    } //fim do bloco switch do case 8

                    break;
                case 9: //OPERAÇÕES COM PORCENTAGEM & PORCENTAGEM
                    System.out.println("1- Soma com porcentagem");
                    System.out.println("2- Subtração com porcentagem");
                    System.out.println("3- Multiplicação com porcentagem");
                    System.out.println("4- Divisão com porcentagem");
                    System.out.println("5- Porcentegam");
                    System.out.print("R: ");
                    opcao = input.nextInt();
                    switch (opcao) {
                        case 1: //SOMA C/PORCENTAGEM
                        if (ultimoResultado == 0) {
                                System.out.print("Digite o número: ");
                                x1 = input.nextDouble();
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Soma(x1,(calculo.Porcentagem(x1, x2)));
                                System.out.println("A soma com porcentagem é igual a: " + ultimoResultado);
                            } else {
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Soma(ultimoResultado, calculo.Porcentagem(ultimoResultado, x2));
                        
                                System.out.println("A soma com porcentagem é igual a: " + ultimoResultado);
                            }
                            break;

                        case 2: //SUBTRAÇÃO C/ PORCENTAGEM
                        if (ultimoResultado == 0) {
                            System.out.print("Digite o número: ");
                            x1 = input.nextDouble();
                            System.out.print("Digite a porcentagem(%): ");
                            x2 = input.nextDouble();
                            ultimoResultado = calculo.Subtracao(x1,(calculo.Porcentagem(x1, x2)));
                            System.out.println("A subtração com porcentagem é igual a: " + ultimoResultado);
                        } else {
                            System.out.print("Digite a porcentagem(%): ");
                            x2 = input.nextDouble();
                            ultimoResultado = calculo.Subtracao(ultimoResultado, calculo.Porcentagem(ultimoResultado, x2));
                    
                            System.out.println("A subtração com porcentagem é igual a: " + ultimoResultado);
                        }   
                            break;

                        case 3: //MULTIPLICAÇÃO C/PORCENTAGEM
                            if (ultimoResultado == 0) {
                                System.out.print("Digite o número: ");
                                x1 = input.nextDouble();
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Multiplicacao(x1,(calculo.Porcentagem(x1, x2)));
                                System.out.println("A multiplicação com porcentagem é igual a: " + ultimoResultado);
                            } else {
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Multiplicacao(ultimoResultado, calculo.Porcentagem(ultimoResultado, x2));
                        
                                System.out.println("A multiplicação com porcentagem é igual a: " + ultimoResultado);
                            }
                            break;

                        case 4: //DIVISÃO C/PORCENTAGEM
                            if (ultimoResultado == 0) {
                                System.out.print("Digite o número: ");
                                x1 = input.nextDouble();
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Divisao(x1,(calculo.Porcentagem(x1, x2)));
                                System.out.println("A divisão com porcentagem é igual a: " + ultimoResultado);
                            } else {
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Divisao(ultimoResultado, calculo.Porcentagem(ultimoResultado, x2));
                        
                                System.out.println("A divisão com porcentagem é igual a: " + ultimoResultado);
                            }
                            break;
                        
                        case 5: //PORCENTAGEM
                            if (ultimoResultado == 0) {
                                System.out.print("Digite o número: ");
                                x1 = input.nextDouble();
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Porcentagem(x1, x2);
                                System.out.println("A porcentagem é igual a: " + ultimoResultado);
                            } else {
                                System.out.print("Digite a porcentagem(%): ");
                                x2 = input.nextDouble();
                                ultimoResultado = calculo.Porcentagem(ultimoResultado, x2);
                        
                                System.out.println("A porcentagem é igual a: " + ultimoResultado);
                            }
                            break;
                        default:
                            break;
                        } //fim do bloco switch do case 9 
                        break;
                case 10:
                    ultimoResultado = 0;
                    
                    System.out.println("O valor foi zerado " + ultimoResultado);

                    break;

                case 11:
                    System.out.println("Seu último número é : " + ultimoResultado);
                    break;
                
                default:
                    System.out.println("Fechando calculadora...");
                    break;
                
            }
    
        } while(opcao != 0);

    input.close();
    }
}