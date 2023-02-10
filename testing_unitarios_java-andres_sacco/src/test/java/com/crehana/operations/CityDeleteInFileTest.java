package com.crehana.operations;

import com.crehana.catalog.dto.CityDTO;
import com.crehana.catalog.exception.CrehanaException;
import com.crehana.catalog.persistence.CityPersistence;
import com.crehana.catalog.service.CityService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Clase que permite realizar los test en el Nuevo proceso para Borrado  Ciudad
 *
 * @author willmer.orsetti
 *
 */
public class CityDeleteInFileTest {
    @Test
    public void should_delete_city(){
        try{
            //when-----------------------------------------------
            CityDTO cityDTO=new CityDTO("PAR","Le Paris");
            CityPersistence cityPersistence=new CityPersistence();
            CityService cityService=new CityService(cityPersistence) ;

            //given-----------------------------------------------
            cityPersistence.delete(cityDTO);

            //then------------------------------------------------
            cityService.existCity("PAR").get().getCode();
        }catch (
        CrehanaException e){
            Assert.assertEquals("The city not exist",e.getMessage().toString());
        }   catch(Exception e){
            Assert.fail("wrong exception thrown");
        }

    }

    @Test
    public void should_not_delete_city(){

        try{
            //when-----------------------------------------------
            CityDTO cityDTO=new CityDTO("XXX","XXXXXX");
            CityPersistence cityPersistence=new CityPersistence();
            CityService cityService=new CityService(cityPersistence) ;

            //given-----------------------------------------------
            cityPersistence.delete(cityDTO);

            //then------------------------------------------------
            cityService.existCity("PAR").get().getCode();
        }catch (
                CrehanaException e){
            Assert.assertEquals("The city not exist",e.getMessage().toString());
        }   catch(Exception e){
            Assert.fail("wrong exception thrown");
        }
    }
}
