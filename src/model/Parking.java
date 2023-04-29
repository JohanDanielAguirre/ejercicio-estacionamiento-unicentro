package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class  Parking {
    private Vehicle[] motos= new Vehicle[100];
    private Vehicle[] carros= new Vehicle[200];
    public Parking(){
    }
    public void  registervehicle(String placa, String id, int mot, int fate) throws LimitExeption, IdExeption,PlateExeption {
        DateFormat dateFormat = new SimpleDateFormat("d");
        DateFormat dateFormat1= new SimpleDateFormat("HH");
        String date = dateFormat.format(new Date());
        String date1= dateFormat1.format(new Date());
        int fid= Integer.parseInt(id.charAt(id.length()-1)+"");
        int dat=Integer.parseInt(date1);
        if(fate==1){
            try{
                int id1=Integer.parseInt(placa.charAt(id.length()-2)+""+placa.charAt(id.length()-1)+"");
                motos[mot]=new Vehicle(placa,id);
                if((fid==0 || fid==1) && date.equals("Lunes")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==2 || fid==3) && date.equals("Martes")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==4 || fid==5) && date.equals("Miercoles")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==6 || fid==7) && date.equals("Jueves")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==8 || fid==9) && date.equals("Viernes")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                }
                if((id1>=00 && id1<=49) && (07>=dat && 14<dat)){
                    throw new PlateExeption("no puede entrar por que se excedio el tiempo permitido");
                } else  if((id1>=50 && id1<=99) && (14>=dat && 20<dat)) {
                    throw new PlateExeption("no puede entrar por que se excedio el tiempo permitido");
                }
            }catch (IndexOutOfBoundsException e){
                throw new LimitExeption("no se encuentran mas espacios disponibles para parquear motos");
            }
        }else {
            try{
                String id2= String.valueOf(placa.charAt(0));
                carros[mot]=new Vehicle(placa,id);
                if((fid==0 || fid==1) && date.equals("Lunes")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==2 || fid==3) && date.equals("Martes")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==4 || fid==5) && date.equals("Miercoles")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==6 || fid==7) && date.equals("Jueves")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                } else  if((fid==8 || fid==9) && date.equals("Viernes")){
                    throw new IdExeption("no puede entrar por que su cedula no lo permite");
                }
                if(("ABCDEFGHIJKLM".contains(id2)) && (07<=dat && 14>dat)){
                    throw new PlateExeption("no puede entrar por que se excedio el tiempo permitido");
                } else  if(("NOPQRSTUVWXYZ".contains(id2)) && (23>=dat && dat<14)) {
                    throw new PlateExeption("no puede entrar por que se excedio el tiempo permitido");
                }
            }catch (IndexOutOfBoundsException e){
                throw new LimitExeption("no se encuentran mas espacios disponibles para parquear motos");
            }
        }

    }
}
