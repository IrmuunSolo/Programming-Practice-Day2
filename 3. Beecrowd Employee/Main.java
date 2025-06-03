import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextFloat()){
            float salary = scan.nextFloat();
            System.out.printf("Novo salario: %.2f%n", newSalary(salary));
            System.out.printf("Reajuste ganho: %.2f%n", earnedMoney(salary));
            System.out.println("Em percentual: " + (int)(ReadjRate(salary) * 100) + " %");
        }
    }
    
    public static float ReadjRate(float salary){
        float ReadRate;
        if(salary <= 400)
            return ReadRate = 0.15f;
        else if(salary <= 800)
            return ReadRate = 0.12f;
        else if(salary <= 1200)
            return ReadRate = 0.1f;
        else if(salary <= 2000)
            return ReadRate = 0.07f;
        else 
            return ReadRate = 0.04f;
    }
    
    public static float earnedMoney(float salary){
        return ReadjRate(salary) * salary;
    }
    
    public static float newSalary(float salary){
        return salary + earnedMoney(salary);

    }
 
}