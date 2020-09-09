/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18passmanager;

import classes.NewResource;
import classes.SaverToFile;
import entity.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    private List<Resource> ListResources = new ArrayList<>();
    private SaverToFile saverToFile = new SaverToFile();
    public App(){
        ListResources.addAll(saverToFile.loadListResources());
    
    }
    
    public void run() throws IOException{
        System.out.println("LOH");
        String repeat = "r";
        do{
        System.out.println("Выберите задачу: ");
        System.out.println("0 - выйти из программы: ");
        System.out.println("1 - добавить ресурс ");
        System.out.println("2 - список ресурсов ");
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            int task = scanner.nextInt();
        }while(celi(task)==task);
        scanner.nextLine();
        switch (task) {
            case 0:
                repeat = "q";
                break;
            case 1:
                System.out.println("Выбрана задача 1");                
                NewResource newResource = new NewResource();               
                ListResources.add(newResource.createResource());
                
            
                saverToFile.saveResource(ListResources);
            
            
                
                break;
            case 2:
                System.out.println("Выбрана задача 2");
                System.out.println("Список ресурсов:");
                for (Resource ListResource : ListResources) {
                    System.out.println(ListResource);
                }
            case 3:
                System.out.println("Выбрана задача 3");
                System.out.println("Список ресурсов: ");
                int i = 1;
                for(Resource r : ListResources){
                    
                }
                
                
        }
            }while(!"q".equals(repeat));
    }
      
     
}
