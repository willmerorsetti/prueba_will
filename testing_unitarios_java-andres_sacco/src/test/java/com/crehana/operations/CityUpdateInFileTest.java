package com.crehana.operations;

import com.crehana.catalog.dto.CityDTO;
import com.crehana.catalog.exception.CrehanaException;
import com.crehana.catalog.persistence.CityPersistence;
import com.crehana.catalog.service.CityService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Clase que permite realizar los test en el proceso para actualizar  Ciudad
 *
 * @author willmer.orsetti
 *
 */
public class CityUpdateInFileTest {
    @Test
    public void should_update_city(){

        //when-----------------------------------------------
        CityDTO cityDTO=new CityDTO("PAR","Le Paris");
        CityPersistence cityPersistence=new CityPersistence();
        CityService cityService=new CityService(cityPersistence) ;

        //given-----------------------------------------------
        cityPersistence.update(cityDTO);

        //then------------------------------------------------
        Assert.assertEquals("Le Paris", cityService.existCity("PAR").get().getName());
    }
    @Test
    public void should_not_update_city(){
        try{
            //when-----------------------------------------------
            CityDTO cityDTO=new CityDTO("XXX","Otra Ciudad");
            CityPersistence cityPersistence=new CityPersistence();
            CityService cityService=new CityService(cityPersistence) ;

            //given-----------------------------------------------
            cityPersistence.update(cityDTO);

            //then------------------------------------------------
        }catch (CrehanaException e){
            Assert.assertTrue(true);
        }   catch(Exception e){
            Assert.fail("wrong exception thrown");
        }
    }



}
