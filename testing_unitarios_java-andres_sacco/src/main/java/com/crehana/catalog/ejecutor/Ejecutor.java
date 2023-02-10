package com.crehana.catalog.ejecutor;

import com.crehana.catalog.controller.CityController;
import com.crehana.catalog.controller.MenuController;
import com.crehana.catalog.persistence.CityPersistence;
import com.crehana.catalog.service.CityService;
import com.crehana.catalog.validator.CityValidator;
import com.crehana.catalog.validator.MenuOptionValidator;

import java.util.Scanner;

public class Ejecutor {
    public static  void main (String arg[]){
        System.out.println("++++++++++++++++++");
        System.out.println("Inicia Ejecutor");
        System.out.println("++++++++++++++++++");

        CityValidator cityValidator=new CityValidator();
        CityPersistence cityPersistence= new CityPersistence();
        CityService cityService= new CityService(cityPersistence);
        Scanner scanner= new Scanner(System.in);
        MenuOptionValidator validator=new MenuOptionValidator();

        CityController cityController=new CityController(cityValidator,scanner,cityService);
        MenuController menuController=new MenuController(validator,cityController,scanner) ;
        //when
        menuController.draw();

        //System.out.println("++++++++++++++++++");
        //System.out.println("Finaliza Ejecutor");
        //System.out.println("++++++++++++++++++");


    }
}
