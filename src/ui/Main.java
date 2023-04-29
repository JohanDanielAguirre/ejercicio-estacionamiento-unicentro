package ui;
import java.util.Scanner;
import model.*;
public class Main {
    private Scanner sc;
    public Main() {
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.operations();

    }

    private void operations() {
        boolean a=true;
        int fate=0,mot=0,car=0;
        String placa="",id="";
        do {
            System.out.println("ingrese una de las siguientes opciones");
            System.out.println(
                    "1. ingresar un carro \n" +
                            "2. ingresar una moto \n"+
                            "3. salir");
            fate= sc.nextInt();
            sc.next();
            Parking p=new Parking();
            switch (fate){
                case 1:
                    System.out.println("ingrese la placa del vehiculo");
                    placa= sc.nextLine();
                    sc.next();
                    System.out.println("ingrese su cedula");
                    id= sc.nextLine();
                    sc.next();
                    try{
                        p.registervehicle(placa,id,car,fate);
                    }catch (LimitExeption e){
                        System.out.println(e);
                    }catch (IdExeption e){
                        System.out.println(e);

                    }catch (PlateExeption e){
                        System.out.println(e);
                    }
                    mot++;
                break;
                case 2:
                    System.out.println("ingrese la placa del vehiculo");
                    placa= sc.nextLine();
                    sc.next();
                    System.out.println("ingrese su cedula");
                    id= sc.nextLine();
                    sc.next();
                    try{
                        p.registervehicle(placa,id,car,fate);
                    }catch (LimitExeption e){
                        System.out.println(e);
                    }catch (IdExeption e){
                        System.out.println(e);

                    }catch (PlateExeption e){
                        System.out.println(e);
                    }
                    car++;
                break;
                case 3:
                    a=false;
                break;
            }
        }while (a);
    }
}